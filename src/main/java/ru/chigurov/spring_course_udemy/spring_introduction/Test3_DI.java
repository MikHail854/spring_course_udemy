package ru.chigurov.spring_course_udemy.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3_DI {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //Pet pet = context.getBean("myPet", Pet.class);
        //Person person = new Person(pet);
        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();
        System.out.println(person.getSurName());
        System.out.println(person.getAge());
        context.close();
    }
}
