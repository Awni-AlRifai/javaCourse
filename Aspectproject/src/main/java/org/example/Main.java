package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        ShoppingCart cart = context.getBean(ShoppingCart.class);
        cart.checkout("Canceled");
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(123,"awni rifai", 500.5));
        employees.add(new Employee(456,"yahya", 200));
        employees.add(new Employee(14,"luai", 250));
        Collections.sort(employees);
        for(Employee employee: employees){
            System.out.println(employee.getName());
        }
    }
}