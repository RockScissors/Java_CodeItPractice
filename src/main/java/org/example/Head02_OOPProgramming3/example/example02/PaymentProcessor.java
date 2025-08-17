package org.example.Head02_OOPProgramming3.example.example02;


//OCP(Open-Closed Principle: 개방-폐쇄 원칙)
//확장에는 열려 있으나 변경에는 닫혀 있어야 한다.
public class PaymentProcessor {
    public void pay(String paymentType, double amount){
        if(paymentType.equals("creditCard")){
            //신용카드 결제 로직
        }else if(paymentType.equals("accountTransfer")){
            //계좌이체 결제 로직
        }else if(paymentType.equals("mobilePay")){
            //모바일 결제 로직
        }
        //결제 로직이 추가될 때마다 else if 블록을 계속 늘려가야 함
    }
}
