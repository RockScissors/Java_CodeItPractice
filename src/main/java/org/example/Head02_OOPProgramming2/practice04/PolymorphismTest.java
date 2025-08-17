package org.example.Head02_OOPProgramming2.practice04;

public class PolymorphismTest {
    public static void main(String[] args) {
        OrderService service = new OrderService();
        Payment[] payments = { new CreditCardPayment(), new CreditCardPayment(),
            new AccountTransferPayment(), new CreditCardPayment() };

        double[] paymentAmounts = new double[]{
                30000, 70000
        };

        for(Payment p : payments){
            if(p instanceof CreditCardPayment){
                service.processPayment(p, paymentAmounts[0]);
            } else if(p instanceof AccountTransferPayment){
                service.processPayment(p, paymentAmounts[1]);
            }
        }
    }
}
