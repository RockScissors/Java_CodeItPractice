package org.example.Head02_OOPProgramming2.practice05;

//계좌 클래스
public class UserAccount {
    private final String accountId; //계좌 아이디 - 생성된 이후 변동 X (final 선언)
    private double balance; //잔액

    public UserAccount(String accountId){
        this.accountId = accountId;
        this.balance = 0;
    }

    public void deposit(double amount){ //입금
        if(amount <= 0) throw new IllegalArgumentException("0보다 커야 합니다."); //입금액 <= 0
        balance += amount;
    }

    public void withdraw(double amount){ //출금
        if(amount <= 0 || balance < amount) throw new IllegalArgumentException("출금 오류");
        balance -= amount;
    }

    public double getBalance(){ //잔액
        return balance;
    }
}
