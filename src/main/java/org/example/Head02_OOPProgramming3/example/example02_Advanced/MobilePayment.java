package org.example.Head02_OOPProgramming3.example.example02_Advanced;

public class MobilePayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("모바일 결제: " + amount + "원");
    }
}
