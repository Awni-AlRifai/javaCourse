package org.example.hibernate.demo;

import org.example.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteStudent {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
        Session session = factory.getCurrentSession();

        try{
            session.beginTransaction();
            Student student =session.get(Student.class, 2);
            session.delete(student);
            session.getTransaction().commit();

        } finally{
            factory.close();
        }
    }

}
