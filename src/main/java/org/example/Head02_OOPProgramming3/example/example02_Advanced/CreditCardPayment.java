package org.example.Head02_OOPProgramming3.example.example02_Advanced;

public class CreditCardPayment implements Payment{

    @Override
    public void pay(double amount) {
        System.out.println("신용카드 결제: " + amount + "원");
    }
}
