package org.example.Head02_OOPProgramming3.example.example02_Advanced;

public class PaymentProcessor {
    public void pay(Payment payment, double amount){
        //이 클래스의 필요성
        //공통 로직의 중앙 관리: 예를 들어 "결제 전 사용자 잔액을 확인하는 로직"을
        //추가해야 한다면, 코드를 사용하는 모든 곳을 찾아다니며 일일이 수정해야 한다.
        //하나라도 빼먹으면 버그가 된다.
        //PaymentProcessor를 사용하면, 모든 공통 로직을 PaymentProcessor 안에
        //모아둘 수 있다.
        payment.pay(amount);
    }
}
