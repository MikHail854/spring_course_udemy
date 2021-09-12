package ru.chigurov.spring_course_udemy.hibernate.hibernate_test2_one_to_one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.chigurov.spring_course_udemy.hibernate.hibernate_test2_one_to_one.entity.Detail;
import ru.chigurov.spring_course_udemy.hibernate.hibernate_test2_one_to_one.entity.Employee;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();


        Session session = null;

        try {
//            Session session = factory.getCurrentSession();
//            Employee employee = new Employee("Mikhail", "Chigurov", "IT", 500);
//            Detail detail = new Detail("NSK", "123456798", "mechigurov@alfaleasing.ru");
//
//            employee.setEmpDetail(detail);
//            session.beginTransaction();
//
//            session.save(employee);
//
//            session.getTransaction().commit();


//            Session session = factory.getCurrentSession();
//            Employee employee = new Employee("Mary", "Zvereva", "saler", 950);
//            Detail detail = new Detail("Sochi", "95132484", "zaika@ya.ru");
//
//            employee.setEmpDetail(detail);
//            session.beginTransaction();
//
//            session.save(employee);
//
//            session.getTransaction().commit();

            session = factory.getCurrentSession();
            session.beginTransaction();

            Employee emp = session.get(Employee.class, 5);
            System.out.println(emp.getEmpDetail());

            session.getTransaction().commit();

            System.out.println("Done!");
        } finally {
            session.close();
            factory.close();
        }
    }
}
