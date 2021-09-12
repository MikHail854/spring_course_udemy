package ru.chigurov.spring_course_udemy.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test6_scope_annotation {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");

        Dog myDog = context.getBean("dog", Dog.class);
        Dog yourDog = context.getBean("dog", Dog.class);

        System.out.println("Обяъкты ссылаются на одну ячейку памяти? " +
                (myDog==yourDog));

        System.out.println(myDog);
        System.out.println(yourDog);



    }
}
