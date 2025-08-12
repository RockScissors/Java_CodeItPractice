package org.example.Head03_OOPProgramming.example01;

public class AccountTransferPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("계좌이체로 " + amount + "언 결제 완료했습니다!");
    }
}
