package org.example.hibernate.demo;

import org.example.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetStudentDemo {
    public static void main(String[] args) {
        // create session factory
        SessionFactory factory = new Configuration().configure()
                                .addAnnotatedClass(Student.class)
                                .buildSessionFactory();
        // create session
        Session session = factory.getCurrentSession();

        try{
            System.out.println("Getting the student with ID:");
            session.beginTransaction();
            Student student = session.get(Student.class, 2);
            System.out.println("Get Complete:" + student);

            session.getTransaction().commit();
            System.out.println("Done");

        } finally {
            factory.close();
        }
    }
}
