package ru.chigurov.spring_course_udemy.aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspects {

    @Around("execution(* returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice: попытка логировать возвращаемую книгу");
        Object book = null;
        try {
            book = proceedingJoinPoint.proceed();
        } catch (Exception e) {
            System.out.println("aroundReturnBookLoggingAdvice: Исключение поймано, но не обработано");
            throw e;
        }
        System.out.println("aroundReturnBookLoggingAdvice: логируем возвращаемую книгу");
        return book;
    }

}
