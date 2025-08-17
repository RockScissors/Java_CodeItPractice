package org.example.Head02_OOPProgramming2.practice02;

public class AccountTransferPayment extends AbstractPayment {
    @Override
    public void pay(double amount) {
        System.out.println("계좌 이체로 " + amount + "원 결제 완료.");
    }
}
