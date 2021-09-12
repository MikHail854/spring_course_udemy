package ru.chigurov.spring_course_udemy.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class ExceptionHandlingAspect {


    @Before("ru.chigurov.spring_course_udemy.aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddExceptionHandlingAspect(){
        System.out.println("beforeGetExceptionHandlingAspect: попытка отловить/обработать исключние");
        System.out.println("-----------------------------------");
    }

}
