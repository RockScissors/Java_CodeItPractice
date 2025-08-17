package org.example.Head02_OOPProgramming3.additionalDIPPractice;

public interface NotificationSender {
    //인터페이스는 '계약서'이다. 메소드 이름뿐만 아니라,
    //메소드의 파라미터와 리턴 타입까지 모두 포함해 하나의 완전한 계약이다.
    //인터페이스 메소드에는 파라미터를 지정해야 한다.
    public void send(String message);
}
