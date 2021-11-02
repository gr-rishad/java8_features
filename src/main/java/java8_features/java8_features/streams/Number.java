package java8_features.java8_features.streams;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Number {

    private Integer num;

    public Number(Integer num) {
        this.num = num;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Number{" +
                "num=" + num +
                '}';
    }
}

class MainClass {
    public static void main(String[] args) {

        List<Number> numberList = new ArrayList<>();
        numberList.add(new Number(1));
        numberList.add(new Number(12));
        numberList.add(new Number(23));
        numberList.add(new Number(32));
        numberList.add(new Number(56));
        numberList.add(new Number(6));
        numberList.add(new Number(12));

        // doesn't working
        numberList.stream().distinct().forEach(System.out::println);

        /*
        // unique number using Set
        Set<Integer> integers = new HashSet<>(numberList.size());
        numberList.stream().filter(number -> integers.add(number.getNum())).forEach(System.out::println);
         */
    }
}
