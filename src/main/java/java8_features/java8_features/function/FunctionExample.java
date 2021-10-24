package java8_features.java8_features.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

class Student {
    String name;
    int mark;

    Student(String name, int mark) {
        this.mark = mark;
        this.name = name;
    }
}

public class FunctionExample {

    public static void main(String[] args) {

        /*
        // square a number
        Function<Integer, Integer> f = i -> i * i;
        System.out.println(f.apply(4));
        System.out.println(f.apply(5));

        // length of a String
        Function<String, Integer> s = i -> i.length();
        System.out.println(s.apply("Rishad"));

        // uppercase a String
        Function<String,String> u= i->i.toUpperCase();
        System.out.println(u.apply("rishad"));

         */
        List<Student> st = new ArrayList<>();
        st.add(new Student("Rishad", 79));
        st.add(new Student("Rakib", 30));
        st.add(new Student("Sumon", 60));
        st.add(new Student("Afif", 90));
        st.add(new Student("Malik", 56));
        st.add(new Student("Dalim", 44));


        Function<Student, String> f = s -> {
            int marks = s.mark;
            String grade = "";

            if (marks >= 80) grade = "A[Distinction]";
            else if (marks >= 60) grade = "B[FC]";
            else if (marks >= 50) grade = "C[SC]";
            else if (marks >= 35) grade = "D[TC]";

            return grade;
        };

        //List<Student> studentList = st.stream().filter(s ->  ).collect(Collectors.toList());


        for (Student student : st) {
            System.out.println("Student name :" + student.name);
            System.out.println("Student Marks :" + student.mark);
            System.out.println("Student Grade :" + f.apply(student));
        }
    }
}
