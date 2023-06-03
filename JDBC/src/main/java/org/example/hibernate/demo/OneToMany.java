package org.example.hibernate.demo;

import org.example.entity.Course;
import org.example.entity.Instructor;
import org.example.entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OneToMany {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(Course.class)
                .addAnnotatedClass(InstructorDetail.class )
                .buildSessionFactory();
        Session session = factory.getCurrentSession();

        // create our objects
        Instructor instructor = new Instructor("john", "wick","john@gmail.com");
        Course course = new Course("Java");
        Course course1 = new Course("javaScript");
        instructor.addCourse(course);
        instructor.addCourse(course1);
        try{
            session.beginTransaction();
            System.out.println("Saving constructors...");
            session.save(instructor);
            session.save(course);
            session.save(course1);
            session.getTransaction().commit();


        } catch(Exception exception){
            exception.printStackTrace();
        } finally{
            session.close();
            factory.close();
        }
    }
}
