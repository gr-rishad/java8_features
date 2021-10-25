package java8_features.java8_features.comsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ConsumerExample {

    public static void main(String[] args) {
/*
        Consumer<String> con= c-> System.out.println(c);
        con.accept("Rishad");

 */
        List<Student> students = new ArrayList<>();
        students.add(new Student("Rishad", 79));
        students.add(new Student("Rakib", 36));
        students.add(new Student("Sumon", 60));
        students.add(new Student("Afif", 90));
        students.add(new Student("Malik", 56));
        students.add(new Student("Dalim", 44));


        Function<Student, String> f = s -> {
            int marks = s.mark;
            String grade = "";

            if (marks >= 80) grade = "A[Distinction]";
            else if (marks >= 60) grade = "B[FC]";
            else if (marks >= 50) grade = "C[SC]";
            else if (marks >= 35) grade = "D[TC]";

            return grade;
        };
        Predicate<Student> studentPredicate = s -> s.mark >= 60;
        Consumer<Student> con = i -> {
            System.out.println("Students Name :" + i.name);
            System.out.println("Students Marks :" + i.mark);
            System.out.println("Students Grade :" + f.apply(i));
            System.out.println("---------------------------------------------------");
        };

        for (Student std : students) {
            if (studentPredicate.test(std)) {
                con.accept(std);
            }

        }


    }
}
