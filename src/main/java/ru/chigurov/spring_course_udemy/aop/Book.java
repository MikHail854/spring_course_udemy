package ru.chigurov.spring_course_udemy.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Преступление и наказание")
    private String nameBook;

    @Value("Ф.М.Достоевский")
    private String author;

    @Value("1866")
    private String yearOfPublication;


    public String getNameBook() {
        return nameBook;
    }

    public String getAuthor() {
        return author;
    }

    public String getYearOfPublication() {
        return yearOfPublication;
    }
}
