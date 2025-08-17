package org.example.Head02_OOPProgramming2.example01;

public class AccountTransferPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("계좌이체로 " + amount + "언 결제 완료했습니다!");
    }
}
