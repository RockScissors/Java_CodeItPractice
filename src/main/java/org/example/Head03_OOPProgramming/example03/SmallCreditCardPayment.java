package org.example.Head03_OOPProgramming.example03;

public class SmallCreditCardPayment implements Payment{
    public void pay(double amount) {
        System.out.println("소액(신용카드) 결제: " + amount + "원");
    }
}
