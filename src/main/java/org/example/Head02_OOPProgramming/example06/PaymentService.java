package org.example.Head02_OOPProgramming.example06;

import org.example.Head02_OOPProgramming.example03_CRY.Order; //Order class import

//[싱글톤] : 스스로를 딱 한 번만 만들고, 외부에서는 더 못 만들게 잠근 다음,
//정해진 통로로만 자신을 나눠준다.

public class PaymentService{


//    'final'을 붙여서 public static final PaymentService INSTANCE 라고 선언하는 순간,
//    INSTANCE 변수는 맨 처음에 만들어진 그 PaymentService 객체의 주소값을 영원히 간직하게 됨.
//    누구도 INSTANCE = null 이나 INSTANCE = 다른객체 와 같은 코드로 INSTANCE의 값을 바꿀 수 없게 됨.
    public static final PaymentService INSTANCE = new PaymentService();

    private PaymentService(){
        //외부 인스턴스 생성을 막음
        //생성자를 private으로 잠가버리면, 이 클래스 외부에서는
        //new PaymentService()를 호출하는 게 아예 불가능해짐.
        //아무나 새로 만들어낼 수 없게 원천 봉쇄하는 것.
    }

    public static PaymentService getInstance(){
        return INSTANCE;
        //만들어진 생성자 하나를 오직 이곳을 통해 받아가도록 함
    }

    public boolean pay(Order order, double amount){
        return true;
    }
}