package ru.chigurov.spring_course_udemy.spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("personBean")
public class Person {
    private Pet pet;
    @Value("${person.surName}")
    private String surName;
    @Value("${person.age}")
    private String age;


    /*@Autowired
    public Person(@Qualifier("cat") Pet pet) {
        System.out.println("Person bean created");
        this.pet = pet;
    }*/

    public Person(Pet pet) {
        System.out.println("Person bean created");
        this.pet = pet;
    }


//    public Person() {
//        System.out.println("Person bean created");
//    }

    //@Autowired
    public void setPet(Pet pet) {
        System.out.println("Class Person: set pet");
        this.pet = pet;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely pet!");
        pet.say();
    }
}
