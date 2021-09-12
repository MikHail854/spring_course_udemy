package ru.chigurov.spring_course_udemy.aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {

    private List<Student> students = new ArrayList<>();


    public void addStudents() {
        Student student1 = new Student("Mikhail Chigurov", 4, 7.1);
        Student student2 = new Student("Mary Zvereva", 2, 10);
        Student student3 = new Student("Alexy Puzikov", 1, 2.9);

        students.add(student1);
        students.add(student2);
        students.add(student3);
    }

    public List<Student> getStudents(){
        System.out.println("начало работы метода getStudents");
        //Student student = students.get(5);
        System.out.println("Information from method getStudents");
        System.out.println(students);
        return students;
    }

}
