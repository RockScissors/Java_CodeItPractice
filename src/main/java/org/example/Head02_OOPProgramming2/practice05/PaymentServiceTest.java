package org.example.Head02_OOPProgramming2.practice05;

public class PaymentServiceTest {
    public static void main(String[] args){
        UserAccount u = new UserAccount("U001");
        PaymentService service = new PaymentService();

        u.deposit(10000);
        System.out.println("잔액은 " + u.getBalance());

        try{
            u.deposit(-5000);
        } catch(IllegalArgumentException e){
            System.out.println("예외 발생 (음수 입금): " + e.getMessage());
        }

        try{
            u.withdraw(-5000);
        } catch(IllegalArgumentException e){
            System.out.println("예외 발생 (음수 출금): " + e.getMessage());
        }

        //결제 + 환불
        service.processPayment(u, 10000);
        service.processRefund(u, 10000);
    }
}
