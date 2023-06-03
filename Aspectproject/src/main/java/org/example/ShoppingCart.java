package org.example;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
    public void checkout(String message){
        //Logging (Aspect)
        // Authentication and authorization (aspect)
        // Sanitize the data (Aspect)
        System.out.println(String.format("The shopping cart was %s", message));
    }

}
