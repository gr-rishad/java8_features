package java8_features.java8_features.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

class Stu {
    private String name;
    private Double mark;

    Stu(String name, Double mark) {
        this.name = name;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public Double getMark() {
        return mark;
    }
}


public class StreamsExample {

    public static void main(String[] args) {

        List<Stu> students = new ArrayList<>();
        students.add(new Stu("Golam Rabbani", 90.0));
        students.add(new Stu("Sabbir Ahmed", 66.0));
        students.add(new Stu("Sultan Mahmud", 75.0));
        students.add(new Stu("Abul  Hasan", 20.0));
        students.add(new Stu("Adil Khan", 30.0));


//        List<Integer> list = new ArrayList<>();
//        list.add(0);
//        list.add(5);
//        list.add(10);
//        list.add(25);
//        list.add(15);
//        list.add(20);


        System.out.println(students);

        List<Stu> stuList = students.stream().sorted((i1, i2) -> i1.getMark().compareTo(i2.getMark())).collect(Collectors.toList());
        stuList.forEach(stu -> System.out.println(stu.getMark()+"--------->>"+stu.getName()));

        // print stu object
        for (Stu stu : stuList
        ) {
            System.out.println(stu.getMark() + "---->" + stu.getName());
        }

        // min value
//        Stu minValue = students.stream().min(Comparator.comparing(Stu::getName)).orElseThrow(NoSuchElementException::new);
//        System.out.println(minValue.getMark() + "---" + minValue.getName());



        /*
        // sorted the list
        List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
        System.out.println(" Default Sorting" + sortedList);
        // customize sorting
        List<Integer> customizeSorting = list.stream().sorted((i1, i2) -> (i1 < i2) ? 1 : (i1 > i2) ? -1 : 0).collect(Collectors.toList());
        System.out.println("Customize Sorting" + customizeSorting);


        /*
        // how many numbers are less or equal than 10
        long noLessThanTen = list.stream().filter(m -> m <= 10).count();
        System.out.println(noLessThanTen);
         */

        /*
        // add 5 with every object
        List<Integer> addList = list.stream().map(i -> i + 5).collect(Collectors.toList());
        System.out.println(addList);
            */
        /*
        // find even number from the list
        List<Integer> intList = list.stream().filter(l -> l % 2 == 0).collect(Collectors.toList());
        System.out.println(intList);
         */
    }
}
