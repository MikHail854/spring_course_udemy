package ru.chigurov.spring_course_udemy.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary {

    public void getBook(){
        System.out.println("Мы звяли книгу из UniLibrary");
        System.out.println("-----------------------------------");
    }

    public void getMagazine(){
        System.out.println("Мы звяли журнал из UniLibrary");
        System.out.println("-----------------------------------");
    }

    public String returnBook(){
        int a = 10/0;
        System.out.println("Мы вернули книгу в UniLibrary");
        return "Война и мир";
    }

    public void returnMagazine(){
        System.out.println("Мы вернули журнал в UniLibrary");
        System.out.println("-----------------------------------");
    }

    public void addBook(String name, Book book){
        System.out.println("Мы добавили книгу в UniLibrary");
        System.out.println("-----------------------------------");
    }

    public void addMagazine(){
        System.out.println("Мы давалили журнал в UniLibrary");
        System.out.println("-----------------------------------");
    }


}
