package org.example.hibernate.demo;

import org.example.entity.Instructor;
import org.example.entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OneToONe {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).buildSessionFactory();
        Session session  = factory.getCurrentSession();

        Instructor tempInstructor = new Instructor("awni","rifai","awni@gmail.com");
        InstructorDetail tempInstructorDetail = new InstructorDetail("youtube.com","loves code");


        try{
            // associate the objects
            tempInstructor.setInstructorDetail(tempInstructorDetail);

            // start the transaction
            session.beginTransaction();

            session.save(tempInstructor);
            session.getTransaction().commit();


        }finally {
            factory.close();
        }

    }
}
