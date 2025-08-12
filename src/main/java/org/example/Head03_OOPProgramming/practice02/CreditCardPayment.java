package org.example.Head03_OOPProgramming.practice02;

public class CreditCardPayment extends AbstractPayment {
    public void pay(double amount){
        System.out.println("신용카드로 " + amount + "원 결제 완료.");
    }
}
