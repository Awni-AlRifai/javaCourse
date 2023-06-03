package org.example.InheritanceClassChallenge;

public class Vehicle {
    private int speed;

    public Vehicle(int speed) {
        this.speed = speed;
    }

    public void accelerate(){
        System.out.println("Increasing the speed");
        this.speed += 10;
        System.out.println(String.format("The speed is increased to %d",this.speed));
    }
    public void decreaseSpeed(){
        if(this.speed == 0){
            System.out.println("Cannot decrease the speed anymore");
        }
        else{
            System.out.println("Decreasing the speed");
            this.speed -= 10;
            System.out.println(String.format("The speed is decreased to %d",this.speed));
        }
    }
}

