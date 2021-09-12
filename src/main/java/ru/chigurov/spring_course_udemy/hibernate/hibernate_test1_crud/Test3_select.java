package ru.chigurov.spring_course_udemy.hibernate.hibernate_test1_crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.chigurov.spring_course_udemy.hibernate.hibernate_test1_crud.entity.Employee;

import java.util.List;

public class Test3_select {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            List<Employee> employees = session.createQuery("from Employee where name = 'Mikhail'").getResultList();
            session.getTransaction().commit();
            for (Employee emp : employees) {
                System.out.println(emp);
            }
            System.out.println("DONE!");
        } finally {
            factory.close();
        }
    }
}
