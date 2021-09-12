package ru.chigurov.spring_course_udemy.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("Начало работы метода main");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary library = context.getBean("uniLibrary", UniLibrary.class);

        String bookName = library.returnBook();
        System.out.println("Мы вернули в библиотеку книгу " + bookName);


        context.close();

        System.out.println("Конец работы метода main");

    }
}
