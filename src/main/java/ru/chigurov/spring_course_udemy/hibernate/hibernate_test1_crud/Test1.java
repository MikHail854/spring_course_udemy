package ru.chigurov.spring_course_udemy.hibernate.hibernate_test1_crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.chigurov.spring_course_udemy.hibernate.hibernate_test1_crud.entity.Employee;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            Employee emp = new Employee("Alexy", "Pyzilov", "HR", 700);
            session.beginTransaction();
            session.save(emp);
            session.getTransaction().commit();
            System.out.println("DONE!");
        } finally {
            factory.close();
        }

    }
}
