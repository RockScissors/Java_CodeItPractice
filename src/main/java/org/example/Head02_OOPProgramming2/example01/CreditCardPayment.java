package org.example.Head02_OOPProgramming2.example01;

public class CreditCardPayment implements Payment {
    public void pay(double amount){
        System.out.println("신용카드로 " + amount + "원 결제 완료했습니다!");
    }
}
