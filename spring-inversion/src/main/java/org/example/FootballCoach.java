package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{


    private FortuneService fortuneService;
    @Value("${foo.email}")
    private String emailAddress;
    @Value("${foo.team}")
    private String team;


    @Autowired
    public FootballCoach(@Qualifier("fileFortune") FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getTraining(){
        return "Train for 1 min";
    }

    public String getFortune(){
        return fortuneService.getFortune();
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    public void doMyStartupStuff(){
        System.out.println("Startup");
    }

    public void setTeam(String team) {
        this.team = team;
    }
    public String  getEmailAddress(){
        return emailAddress;
    }
    public String getInfo(){
        return String.format("The email is %s and the team is %s",emailAddress,team);
    }
}
