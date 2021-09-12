package ru.chigurov.spring_course_udemy.aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {
    @Pointcut("execution(* abc*(..))")
    public void allAddMethods(){}
}
