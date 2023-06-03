package org.example;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortune implements FortuneService{
    private String[] data = {"Awin Rifai","Yahya Rifai","Awni Luai"};
    private Random myRandom = new Random();
    @Override
    public String getFortune(){
        int index = myRandom.nextInt(data.length);
        return data[index];
    }
}
