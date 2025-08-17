package org.example.Head02_OOPProgramming2.example02;

public abstract class AbstractPayment {

    protected void validatePayment(double amount){
        if(amount <= 0){
            throw new IllegalArgumentException("결제 금액이 유효하지 않습니다.");
        }
    }

    protected void validateCancel(double amount){
        if(amount <= 0){
            throw new IllegalArgumentException("취소 금액이 유효하지 않습니다.");
        }
    }

    //추상 메소드: 구체 클래스가 구현해야 한다.
    public abstract void pay(double amount);
    public abstract void cancel(double amount);
}


