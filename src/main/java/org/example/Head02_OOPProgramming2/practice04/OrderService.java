package org.example.Head02_OOPProgramming2.practice04;

public class OrderService {
    public void processPayment(Payment method, double amount){
        method.pay(amount);
    }
}
