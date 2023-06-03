package org.example.hibernate.demo;

import org.example.entity.Instructor;
import org.example.entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetInstructorDetailAndInstructor {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).buildSessionFactory();
        Session session  = factory.getCurrentSession();

        try{
            session.beginTransaction();
            System.out.println("Get Instructor detail ....");
            InstructorDetail instructorDetail = session.get(InstructorDetail.class,2);
            System.out.println(instructorDetail);
            // remove the associated object reference
            // break biDirectional link
            instructorDetail.getInstructor().setInstructorDetail(null);
            session.delete(instructorDetail);
            session.getTransaction().commit();


        } catch (Exception exception){
            System.out.println(exception.toString());
        }
        finally {
            // handle connection leak issue
            session.close();
            factory.close();
        }

    }
}
