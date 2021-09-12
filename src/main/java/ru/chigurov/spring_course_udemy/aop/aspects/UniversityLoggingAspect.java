package ru.chigurov.spring_course_udemy.aop.aspects;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import ru.chigurov.spring_course_udemy.aop.Student;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

    @Before("execution(* getStudents(..))")
    public void beforeGetStudentsMethodAspect(){
        System.out.println("beforeGetStudentsMethodAspect: логирует получение списка студентов перед методом getStudents");
    }
//
//
//    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
//    public void afterReturningGetStudentsMethodAspect(List<Student> students){
//        Student firstStudent = students.get(0);
//
//        String name = firstStudent.getNameSurName();
//        name = "Mr. " + name;
//        firstStudent.setNameSurName(name);
//
//        double avgGrade = firstStudent.getAvgGrade();
//        avgGrade = avgGrade + 1;
//        firstStudent.setAvgGrade(avgGrade);;
//
//        System.out.println("afterReturningGetStudentsMethodAspect: логируем получение списка студентов после работы метода getStudents");
//    }


//    @AfterThrowing(pointcut = "execution(* ru.chigurov.spring_course_udemy.aop.University.getStudents())",
//    throwing = "exception")
//    public void afterThrowingLoggingAdvice(Throwable exception) {
//        System.out.println("afterThrowingLoggingAdvice: логируем выброс исключения " + exception);
//        System.out.println("-----------------------------------");
//    }

    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice(){
        System.out.println("afterGetStudentsLoggingAdvice: логируем нормальное окончание работы или выброс исключения");
    }


}
