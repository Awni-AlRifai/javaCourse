package org.example;

import org.springframework.stereotype.Component;

@Component
public class BadFortune implements FortuneService {
    public String getFortune(){
     return "you are unlucky";
    }
}
