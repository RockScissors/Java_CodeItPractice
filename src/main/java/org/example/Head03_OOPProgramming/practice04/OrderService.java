package org.example.Head03_OOPProgramming.practice04;

public class OrderService {
    public void processPayment(Payment method, double amount){
        method.pay(amount);
    }
}
