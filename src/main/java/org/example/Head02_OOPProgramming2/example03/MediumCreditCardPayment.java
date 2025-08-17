package org.example.Head02_OOPProgramming2.example03;

public class MediumCreditCardPayment implements Payment{
    public void pay(double amount) {
        System.out.println("중간 금액(신용카드) 결제: " + amount + "원");
    }
}
