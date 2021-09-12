package ru.chigurov.spring_course_udemy.hibernate.hibernate_test4_one_to_many_uni;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.chigurov.spring_course_udemy.hibernate.hibernate_test4_one_to_many_uni.entity.*;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();


        Session session = null;

        try {
//            session = factory.getCurrentSession();
//
//            Department dep = new Department("HR", 500, 1500);
//
//            Employee emp1 = new Employee("Oleg", "Ivanov", 700);
//            Employee emp2 = new Employee("irina", "Vlasova", 1000);
//
//
//            dep.addEmployeeToDepartment(emp1);
//            dep.addEmployeeToDepartment(emp2);
//
//            session.beginTransaction();
//            session.save(dep);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
//**************************************
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Department department = session.get(Department.class, 1);
//
//            System.out.println(department);
//            System.out.println(department.getEmps());
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

//**********************************************
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Employee employee = session.get(Employee.class, 1);
//
//
//            System.out.println(employee);
//            System.out.println(employee.getDepartment());
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

            session = factory.getCurrentSession();
            session.beginTransaction();

            Employee employee = session.get(Employee.class, 3);
            Employee employee2 = session.get(Employee.class, 4);
            Employee employee3 = session.get(Employee.class, 5);
            Employee employee4 = session.get(Employee.class, 6);
            Employee employee5 = session.get(Employee.class, 7);
            Employee employee6 = session.get(Employee.class, 8);

            session.delete(employee);
            session.delete(employee2);
            session.delete(employee3);
            session.delete(employee4);
            session.delete(employee5);
            session.delete(employee6);
            
            session.getTransaction().commit();
            System.out.println("DONE!");

        } finally {
            session.close();
            factory.close();
        }
    }
}
