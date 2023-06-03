package org.example.hibernate.demo;

import org.example.entity.Course;
import org.example.entity.Instructor;
import org.example.entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class DeleteCourse {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(Course.class)
                .addAnnotatedClass(InstructorDetail.class )
                .buildSessionFactory();
        Session session = factory.getCurrentSession();

        try{
            session.beginTransaction();
            Course course = session.get(Course.class,2);
            session.delete(course);
            session.getTransaction().commit();

        } catch (Exception exception){
            exception.printStackTrace();
        } finally {
            session.close();
            factory.close();
        }
    }
}
