package org.example.Head02_OOPProgramming2.practice01;

public class Topic03ExampleMain {
    public static void main(String[] args) {
        Order o1 = new Order(new CreditCardPayment());
        o1.process(50000);

        Order o2 = new Order(new AccountTransferPayment());
        o2.process(30000);

        Order o3 = new Order(new CryptoPayment());
        o3.process(10000);
    }
}
