package org.example.hibernate.demo;

import org.example.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class GetAllStudent {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
        Session session = factory.getCurrentSession();

        try{
            System.out.println("Getting students");
            session.beginTransaction();
            List<Student> allStudents = session.createQuery("from Student s where s.lastName = 'rifai1'  ").getResultList();
            System.out.println("The students are fetched");
            session.getTransaction().commit();
            for(Student student:allStudents){
                System.out.println(student.toString());
            }

        } finally{
            factory.close();
        }
    }
}
