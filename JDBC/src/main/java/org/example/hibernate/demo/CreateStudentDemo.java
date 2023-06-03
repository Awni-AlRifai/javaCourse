package org.example.hibernate.demo;

import org.example.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateStudentDemo {
    public static void main(String[] args) {
        // create session factory
        SessionFactory factory = new Configuration().configure()
                                .addAnnotatedClass(Student.class)
                                 .buildSessionFactory();
        // create session
        Session session = factory.getCurrentSession();

        try{
            System.out.println("Creating new Student");
            Student tempStudent = new Student("awni50","rifai40","awni143.rifai@gmail.com");
            // start transaction
            session.beginTransaction();

            // save student object
            System.out.println("Saving the student..");
            session.save(tempStudent);
            // commit transaction
            session.getTransaction().commit();
            System.out.println("Done");
        } finally {
            factory.close();
        }
    }
}
