package org.example.Head03_OOPProgramming.practice;

public class Order {
    private Payment payment;

    public Order(Payment payment){
        this.payment = payment;
    }

    public void process(double amount){
        payment.pay(amount);
    }
}
