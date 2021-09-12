package ru.chigurov.spring_course_udemy.spring_introduction;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
public class Dog implements Pet {

    String name;

    public Dog() {
        System.out.println("Dog bean is created");
    }

//    @PostConstruct
//    public void init(){
//        System.out.println("Class Dog: init method");
//    }
//
//    @PreDestroy
//    public void destroy(){
//        System.out.println("Class Dog: destroy method");
//    }

    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
