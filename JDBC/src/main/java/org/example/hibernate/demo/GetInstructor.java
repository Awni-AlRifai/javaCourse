package org.example.hibernate.demo;

import org.example.entity.Course;
import org.example.entity.Instructor;
import org.example.entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class GetInstructor {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(Course.class)
                .addAnnotatedClass(InstructorDetail.class )
                .buildSessionFactory();
        Session session = factory.getCurrentSession();

        try{
            session.beginTransaction();
            Instructor instructor= (Instructor) session.createQuery("FROM Instructor where id = 6").getSingleResult();
            List<Course> courses =instructor.getCourses();
            System.out.println(courses.get(0).toString());

            session.getTransaction().commit();

        } catch (Exception exception){
            exception.printStackTrace();
        } finally {
            session.close();
            factory.close();
        }

    }
}
