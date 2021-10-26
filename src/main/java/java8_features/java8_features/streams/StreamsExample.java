package java8_features.java8_features.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);

        System.out.println(list);

        // add 5 with every object
        List<Integer> addList = list.stream().map(i -> i + 5).collect(Collectors.toList());
        System.out.println(addList);

        /*
        // find even number from the list
        List<Integer> intList = list.stream().filter(l -> l % 2 == 0).collect(Collectors.toList());
        System.out.println(intList);
         */
    }
}
