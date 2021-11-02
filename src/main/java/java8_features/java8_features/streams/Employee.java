package java8_features.java8_features.streams;

public class Employee {

    private final String name;
    private final Integer age;
    private final Integer salary;
    private final String country;

    public Employee(String name, Integer age, Integer salary, String country) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getSalary() {
        return salary;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", country='" + country + '\'' +
                '}';
    }
}
