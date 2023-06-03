package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
       // Load spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        // retrieve the bean from the container
        Coach theCoach = context.getBean("footballCoach",Coach.class);
        // call methods
        System.out.println(theCoach.getFortune());
        System.out.println(theCoach.getEmailAddress());
        // close the context
        context.close();
    }

}