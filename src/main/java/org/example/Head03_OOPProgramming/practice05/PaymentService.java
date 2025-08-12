package org.example.Head03_OOPProgramming.practice05;

//서비스 클래스
public class PaymentService {

    //결제 서비스 - 계좌에서 출금 + 결제완료 메시지와 잔액 출력
    public void processPayment(UserAccount acc, double amount){
        acc.withdraw(amount);
        System.out.println("결제 완료. 잔액: " + acc.getBalance());
    }

    //환불 서비스 - 계좌에 입금 + 환불완료 메시지와 잔액 출력
    public void processRefund(UserAccount acc, double amount){
        acc.deposit(amount);
        System.out.println("환불 완료. 잔액: " + acc.getBalance());
    }
}
