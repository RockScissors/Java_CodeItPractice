package org.example.Head02_OOPProgramming3.example.example02_Advanced;

public class PaymentProcessorTest {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        //Payment 인터페이스를 구현하는 클래스 객체들의 배열
        Payment[] payments = {
          new CreditCardPayment(), new AccountTransferPayment(),
          new MobilePayment()
        };

        double[] amounts = {
          10000, 25000, 12000
        };

        int amountIndex = 0;
        for(Payment payment : payments){
            paymentProcessor.pay(payment, amounts[amountIndex++]);
        }

    }
}