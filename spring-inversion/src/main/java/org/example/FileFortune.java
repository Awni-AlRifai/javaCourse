package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

@Component
@Scope(" ")
public class FileFortune implements FortuneService{
    private List<String> fortunes;

    public FileFortune() {
        getFortuneFromFile();
    }

    private void getFortuneFromFile(){
        fortunes = new ArrayList<>();
        try{
            ClassPathResource resource = new ClassPathResource("fortune.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(resource.getInputStream()));
            String line;
            while((line = reader.readLine()) != null){
                if(!StringUtils.isEmpty(line)){
                    fortunes.add(line);
                }
            }
            reader.close();
        } catch (IOException e){
            e.printStackTrace();
        }

    }
    public String getFortune(){
        int index = (int)(Math.random()*fortunes.size());
        return fortunes.get(index);
    }
}
