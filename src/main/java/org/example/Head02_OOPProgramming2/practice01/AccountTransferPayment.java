package org.example.Head02_OOPProgramming2.practice01;

public class AccountTransferPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("계좌 이체로 " + amount + "원 결제 완료.");
    }
}
