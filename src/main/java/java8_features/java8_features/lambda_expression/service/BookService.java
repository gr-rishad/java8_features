package java8_features.java8_features.lambda_expression.service;

import java8_features.java8_features.lambda_expression.dao.BookDao;
import java8_features.java8_features.lambda_expression.model.Book;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {

    public List<Book> getBooksInSort() {
        List<Book> books = new BookDao().getBooks();
//        Collections.sort(books, new Comparator<Book>() {
//            @Override
//            public int compare(Book o1, Book o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });

        // using Lambda Expression
        Collections.sort(books,(a,b)->a.getName().compareTo(b.getName()));
        return books;
    }

    public static void main(String[] args) {
        System.out.println(new BookService().getBooksInSort());
    }
}

//class MyComparator implements Comparator<Book>{
//
//    @Override
//    public int compare(Book o1, Book o2) {
//        return o1.getName().compareTo(o2.getName());
//    }
//}
