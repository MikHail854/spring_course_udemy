package ru.chigurov.spring_course_udemy.hibernate.hibernate_test1_crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.chigurov.spring_course_udemy.hibernate.hibernate_test1_crud.entity.Employee;

public class Test4_update {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try{
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            //Employee emp = session.get(Employee.class, 5);
            //emp.setSalary(350);
            session.createQuery("update Employee set  salary = 1000 where name = 'Mikhail'").executeUpdate();
            session.getTransaction().commit();

        } finally {
            factory.close();
        }
    }
}
