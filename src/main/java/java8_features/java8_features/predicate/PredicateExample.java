package java8_features.java8_features.predicate;

import java8_features.java8_features.lambda_expression.model.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book(1, "Basic Java", 100));
        books.add(new Book(2, "Algorithm", 130));
        books.add(new Book(3, "C++", 90));
        books.add(new Book(4, "Spring Boot", 171));
        books.add(new Book(5, "Advanced java", 600));


//        Predicate<Book> object = b -> b.getPage() % 2 == 0;
//        for (Book book : books) {
//            if (object.test(book)) {
//                System.out.println(book.getId() + " " + book.getName());
//            }
//        }


        List<Book> bookList=books.stream().filter(book -> book.getPage()%2==0).collect(Collectors.toList());
        System.out.println(bookList);

    }


}
