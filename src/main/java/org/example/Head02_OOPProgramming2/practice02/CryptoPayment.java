package org.example.Head02_OOPProgramming2.practice02;

public class CryptoPayment extends AbstractPayment {
    @Override
    public void pay(double amount) {

        System.out.println("암호화폐로 " + amount + "원 결제완료.");
    }
}
