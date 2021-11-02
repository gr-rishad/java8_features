package java8_features.java8_features.streams;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MediumStreamExample {

    public static void main(String[] args) {


        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Aman", 23, 23000, "USA"));
        employeeList.add(new Employee("Dev", 52, 23000, "USA"));
        employeeList.add(new Employee("Ben", 63, 25000, "China"));
        employeeList.add(new Employee("Zade", 34, 56000, "India"));
        employeeList.add(new Employee("Ben", 43, 67000, "USA"));
        employeeList.add(new Employee("Sam", 53, 54000, "China"));
        employeeList.add(new Employee("Sam", 45, 50000, "India"));


        /*  4. Matching(anyMatch(), allMatch(),noneMatch())
        // check any person residing in a particular country(anyMatch())
        boolean em = employeeList.stream().anyMatch(employee -> employee.getCountry().equals("USA"));
        System.out.println(em);

        // check All person residing in a particular country(allMatch())
        boolean allIndian = employeeList.stream().allMatch(employee -> employee.getCountry().equals("India"));
        System.out.println(allIndian);
        // check if all the persons are not residents of a particular country(noneMatch()) // keu mexican nai--> true
        boolean noneMaxican = employeeList.stream().noneMatch(employee -> employee.getCountry().equals("Mexico"));
        System.out.println(noneMaxican);
         */

        /* 3. Mapping(map(), flatMap())
        // length of string
        employeeList.stream().mapToInt(e -> e.getName().length()).forEach(System.out::println);
        // salary range increase 5 tk
        employeeList.stream().map(employee -> employee.getSalary() + 5).forEach(System.out::println);
        // uppercase the name
        employeeList.stream().map(employee -> employee.getName().toUpperCase()).forEach(System.out::println);
         */
        /* 2. Slicing (distinct(),limit(),skipping())
        // limit(2) --> return stream to return only upto n values
        employeeList.stream().filter(employee -> employee.getSalary() > 25000).limit(3).forEach(System.out::println);

        // skipping(2) ---> skipping first n (here 2) values
        employeeList.stream().filter(employee -> employee.getSalary() > 25000).skip(2).forEach(System.out::println);
         */

        /* 1. Filtering
        // filter Employee, Who's age is greater than 30
        List<Employee> employees = employeeList.stream().filter(employee -> employee.getAge() > 30).collect(Collectors.toList());
        employees.forEach(employee -> System.out.println(employee));
        employeeList.stream().filter(employee -> employee.getAge() > 30).forEach(System.out::println);
         */

        /*
        // filter Employee by Unique name using set
        Set<String> set= new HashSet<>(employeeList.size());
        employeeList.stream().filter(employee ->set.add(employee.getName())).forEach(System.out::println);

         */

    }
}
