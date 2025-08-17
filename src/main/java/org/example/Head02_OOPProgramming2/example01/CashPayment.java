package org.example.Head02_OOPProgramming2.example01;

public class CashPayment implements Payment {
    public void pay(double amount){
        System.out.println("현금으로 " + amount + "원 결제 완료했습니다!");
    }
}
