package org.example.InheritanceClassChallenge;

public class Car extends Vehicle{
    private int gear;
    public Car(int speed) {
        super(speed);
        this.gear = 1;
        System.out.println("The car is started on gear 1");
    }
    public void changeGear(){
        if(gear == 4)this.gear = 1;
        this.gear++;
        System.out.println(String.format("The gear is changed to %d",this.gear));
    }
}
