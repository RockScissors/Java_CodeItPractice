package org.example.Head02_OOPProgramming3.example.example02_Advanced;

public class AccountTransferPayment implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("계좌이체 결제: " + amount + "원");
    }
}
