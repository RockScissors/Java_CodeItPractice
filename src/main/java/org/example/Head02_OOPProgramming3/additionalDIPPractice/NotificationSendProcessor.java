package org.example.Head02_OOPProgramming3.additionalDIPPractice;

public class NotificationSendProcessor {

    public void send(NotificationSender notificationSender, String message){
        notificationSender.send(message);
    }


    //개선된 코드
//    private final NotificationSender notificationSender;
//
//    public NotificationSendProcessor(NotificationSender notificationSender){
//        this.notificationSender = notificationSender;
//    } 추가!

    //'부품'을 고정시켜 놓는 것.
    //이것이 아니라 위의 방식대로 설계했을 경우, 클라이언트가 구체적인 구현 클래스에
    //직접 의존하게 된다. "나는 알림만 보내고 싶어" 가 아닌, "나는 '이메일 방식'으로
    //알림을 보내고 싶어"라고 구체적인 방법을 지정해야 함. 이는 유연성을 크게 떨어뜨림.

    //멤버 변수가 필요 없는 경우: '도구'가 다른 '도구'의 도움 없이, 혼자서 모든 일을
    //처리할 수 있을 때.
    //멤버 변수가 필요한 경우: '도구'가 자신의 책임을 완수하기 위해, 다른 '도구'의 도움이
    //반드시 필요할 때. (ex. OrderService는 PaymentService와 InventoryService라는
    //부품 없이는 주문을 처리할 수 X.
}
