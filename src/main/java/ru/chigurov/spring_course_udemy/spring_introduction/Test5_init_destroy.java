package ru.chigurov.spring_course_udemy.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5_init_destroy {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");

        Dog myDog = context.getBean("myPet", Dog.class);
        myDog.say();

        Dog yourDog = context.getBean("myPet", Dog.class);
        yourDog.say();

        context.close();

    }
}
