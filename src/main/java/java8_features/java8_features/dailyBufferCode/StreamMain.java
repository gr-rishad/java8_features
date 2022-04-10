package java8_features.java8_features.dailyBufferCode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {

    static List<Employee> employees = new ArrayList<>();

    static {
        employees.add(
                new Employee("Shabbir", "Dawoodi", 5000.0, List.of("Project 1", "Project 2"))
        );
        employees.add(
                new Employee("Nikhil", "Gupta", 6000.0, List.of("Project 1", "Project 3"))
        );
        employees.add(
                new Employee("Shivam", "Kumar", 5500.0, List.of("Project 3", "Project 4"))
        );
    }

    public static void main(String[] args) {

        // create  a stream of object
        Stream.of(employees); // (Collection) ;// stream of List of Collection
        employees.stream(); // both produces same result

        // forEach --> Terminal Operation
        employees.stream()
                .forEach(employee -> System.out.println(employee));

        //map --> allows u to map particular object to different type of object and it will return stream
        // all employees salary increment 10%
        // collect
        Set<Employee> increasedSal = employees.stream()
                .map(employee -> new Employee(
                        employee.getFirstName(),
                        employee.getLastName(),
                        employee.getSalary() * 1.10,
                        employee.getProjects()
                )).collect(Collectors.toSet());

        // System.out.println(increasedSal);

        // filter --> filter out some of the data
        // increase the salary whose salary greater than 5000
        List<Employee> filterEmployee = employees.stream()
                .filter(employee -> employee.getSalary() > 5000)
                .map(employee -> new Employee(
                        employee.getFirstName(),
                        employee.getLastName(),
                        employee.getSalary() * 1.10,
                        employee.getProjects()
                )).collect(Collectors.toList());

        //  System.out.println(filterEmployee);

        // findFirst()--> return the first find value
        // find the name of Employee Whose salary increment first
        Employee firstEmployee =
                employees.stream()
                        .filter(employee -> employee.getSalary() > 5000)
                        .map(employee -> new Employee(
                                employee.getFirstName(),
                                employee.getLastName(),
                                employee.getSalary() * 1.10,
                                employee.getProjects()
                        )).findFirst()
                        .orElse(null);

        System.out.println(firstEmployee);

        // flatMap
        // suppose, u have List of String, u need Stream of String instead of Stream of List of String --> use flatMap
        String projects =
                employees
                        .stream()
                        .map(employee -> employee.getProjects())
                        .flatMap(strings -> strings.stream())
                        .collect(Collectors.joining(", "));
        System.out.println("List Of Projects: " + projects);

        // short circuit operation (Limit ur data)
        List<Employee> shortCircuit =
                employees.stream()
                        .skip(1) // first data would be skip
                        .limit(1) // only take one data
                        .collect(Collectors.toList());
        System.out.println(shortCircuit);

        // finite data
        Stream.generate(Math::random)
                .limit(5)
                .forEach(value -> System.out.println(value));


        // sorting
        List<Employee> sortedEmpl =
                employees
                        .stream()
                        .sorted((o1, o2) -> o1.getFirstName().compareToIgnoreCase(o2.getFirstName()))
                        .collect(Collectors.toList());
        System.out.println(sortedEmpl);

        // min or max
        employees
                .stream()
                .max(Comparator.comparing(Employee::getSalary))
                .orElseThrow(NoSuchFieldError::new);

        // reduce -->  reduce() combine elements of a stream and produces a single value
        Double totalSalary = employees
                .stream()
                .map(employee -> employee.getSalary())
                .reduce(0.0, Double::sum);

        System.out.println(totalSalary);
    }
}
