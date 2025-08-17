package org.example.Head02_OOPProgramming2.practice01;

public class Order {

    //payment라는 이름의 공간에는 Payment 인터페이스를 구현한 객체만 들어올 수 있음.
    private Payment payment;

    public Order(Payment payment){
        this.payment = payment;
    }


//    Order 클래스의 책임: '주문'과 관련된 모든 세부적인 절차를 책임집니다.
//    '주문을 처리한다(process)'는 것은 단순히 '결제(pay)'만 의미하는 것이 아닐 수 있다.
//    예를 들어, 아래와 같은 복잡한 절차를 포함할 수 있다.
//
//    1.재고 확인
//    2.쿠폰 적용 및 최종 금액 계산
//    3.결제 시스템 호출 (payment.pay())
//    4.주문 상태를 '결제 완료'로 변경
//    5.결제 완료 이메일 발송
//
//    만약 main 메소드에서 payment.pay()를 직접 호출한다면,
//    main 메소드는 주문을 처리하는 이 모든 복잡한 과정을 직접 알아야 하고,
//    코드가 변경될 때마다 main 메소드도 함께 수정되어야 한다.
//
//    Order.process()라는 메소드를 만들어 그 안에 payment.pay()를 넣어놓음으로써,
//    주문 처리와 관련된 모든 복잡한 절차를 Order 클래스 안에 숨길 수 있다(캡슐화).

//    그리고, 다양한 Payment 구현체들을 외부에서 동일한 방식으로, 즉 order.process()라는
//    단일한 호출로 처리할 수 있도록 하기 위해.
    public void process(double amount){
        payment.pay(amount);
    }

}
