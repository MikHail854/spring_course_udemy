package ru.chigurov.spring_course_udemy.hibernate_test2_one_to_one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.chigurov.spring_course_udemy.hibernate_test2_one_to_one.entity.Detail;
import ru.chigurov.spring_course_udemy.hibernate_test2_one_to_one.entity.Employee;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();


        Session session = null;

        try {
            session = factory.getCurrentSession();

            //Employee employee = new Employee("Kirill", "Rostov", "HR", 630);
            //Detail detail = new Detail("Barnaul", "9465", "kirill95@gmail.ru");

            session.beginTransaction();
            Detail detail = session.get(Detail.class, 1);

            detail.getEmployee().setEmpDetail(null);
            session.delete(detail);

            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            session.close();
            factory.close();
        }
    }
}
