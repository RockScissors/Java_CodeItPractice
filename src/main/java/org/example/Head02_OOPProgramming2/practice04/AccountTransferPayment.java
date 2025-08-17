package org.example.Head02_OOPProgramming2.practice04;

public class AccountTransferPayment implements Payment{
    @Override

    public void pay(double amount) {
        System.out.println("계좌이체: " + amount + "원 결제 처리!");
    }

}
