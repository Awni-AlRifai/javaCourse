package org.example.oop.constructos;

public class Account {
    private String number;
    private double balance;
    private String customerName;

    @Override
    public String toString() {
        return "Account{" +
                "number='" + number + '\'' +
                ", balance=" + balance +
                ", customerName='" + customerName + '\'' +
                '}';
    }

    // we can a constructor inside another constructor with default values
    public Account() {
        // should be added first bascule it will raise an error if we call it after sout
        this("1234",508.5,"awni");
        System.out.println("Calling empty constructor");
    }
    public Account(String number, double balance, String customerName) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
    }
}
