package org.example;

import org.springframework.stereotype.Component;

@Component
public class HappyFortune implements FortuneService{
    @Override
    public String getFortune(){
        return "Today is your lucky day";
    }
}
