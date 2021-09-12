package ru.chigurov.spring_course_udemy.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import ru.chigurov.spring_course_udemy.aop.Book;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

//    @Pointcut("execution(* *(..))")
//    public void getAllMethodsFromUnitLibrary(){}
//
//    @Pointcut("execution(public void addBook())")
//    public void getAddBook(){}
//
//    @Before("getAllMethodsFromUnitLibrary() && !getAddBook()")
//    public void beforeGetAllMethodsFromUnitLibraryNotAddBookAdvice(){
//        System.out.println("beforeGetAllMethodsFromUnitLibrary: log #1");
//    }
//
//    @Before("getAllMethodsFromUnitLibrary()")
//    public void beforeGetAllMethodsFromUnitLibraryAdvice(){
//        System.out.println("beforeGetAllMethodsFromUnitLibrary: log #3");
//    }
//
//    @Before("getAddBook()")
//    public void beforeGetAddBookAdvice(){
//        System.out.println("beforeGetAddBook: log #2");
//    }


    @Before("ru.chigurov.spring_course_udemy.aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature.getMethod() = " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() = " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName() = " + methodSignature.getName());

        if (methodSignature.getName().equals("addBook")) {
            Object[] arguments = joinPoint.getArgs();
            for (Object obj : arguments) {

                if (obj instanceof Book) {
                    Book myBook = (Book) obj;
                    System.out.println("Информация о книге: название книги - " + myBook.getNameBook() +
                            ", автор - " + myBook.getAuthor() + ", год издания - " + myBook.getYearOfPublication());
                } else if (obj instanceof String) {
                    System.out.println("книгу в библиотеку добавляет " + obj);
                }
            }
        }


        System.out.println("beforeGetLoggingAdvice: логирование попытки взять книгу/журнал");
        System.out.println("-----------------------------------");
    }




}
