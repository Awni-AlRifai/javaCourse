package org.example.hibernate.demo;

import org.example.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateStudent {
    public static void main(String[] args) {

//        updateStudent();
//        updateAllStudents();
    }

    private static void updateAllStudents() {
        SessionFactory factory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
        Session session = factory.getCurrentSession();

        try{
            session.beginTransaction();
            session.createQuery("update Student set email = 'awniawni@gmail.com'").executeUpdate();
            session.getTransaction().commit();

        } finally{
            factory.close();
        }
    }

    private static void updateStudent() {
        SessionFactory factory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
        Session session = factory.getCurrentSession();

        try{
            session.beginTransaction();
            Student student = session.get(Student.class, 2);
            student.setEmail("Ahmed@gmail.com");
            session.getTransaction().commit();

        } finally{
            factory.close();
        }
    }
}




