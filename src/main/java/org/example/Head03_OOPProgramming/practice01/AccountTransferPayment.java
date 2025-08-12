package org.example.Head03_OOPProgramming.practice;

public class AccountTransferPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("계좌 이체로 " + amount + "원 결제 완료.");
    }
}
