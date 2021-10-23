package java8_features.java8_features.lambda_expression.dao;

import java8_features.java8_features.lambda_expression.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookDao {

    public List<Book> getBooks() {
        List<Book> books = new ArrayList<>();
        books.add(new Book(101, "Core Java", 400));
        books.add(new Book(363, "Hibernet", 180));
        books.add(new Book(275, "Spring", 200));
        books.add(new Book(893, "Web Service", 300));
        books.add(new Book(104, "JPA ", 800));

        return books;
    }
}
