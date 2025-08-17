package org.example.Head02_OOPProgramming2.practice02;

public abstract class AbstractPayment {
    public abstract void pay(double amount);
    public void cancel(double amount){
        System.out.println("결제 취소: " + amount + "원");
    };

    //인터페이스로 구현한다면,
//    public interface Payment{
//        void pay(double amount);
//        default void cancel(double amount){
//            System.out.println("결제 취소: " + amount + "원");
//        }
//    }
}
