package ru.chigurov.spring_course_udemy.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("ru.chigurov.spring_course_udemy.aop")
@EnableAspectJAutoProxy
public class MyConfig {
}
