package org.example.Head03_OOPProgramming.practice01;

public class CryptoPayment implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("암호화폐로 " + amount + "원 결제완료.");
    }
}
