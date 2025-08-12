package org.example.Head03_OOPProgramming.AdditionalPractice;

//SmsNotifier를 사용하는 UserService 만들어서 실행하고,
//EmailNotifier를 사용하는 UserService도 만들어 실행해본다.
//UserService 코드는 전혀 바꾸지 않고도 알림 방식이 바뀌는 것을 확인하는 것이 핵심.
public class Main {
    public static void main(String[] args) {
        Notifier n1 = new EmailNotifier();
        Notifier n2 = new SmsNotifier();

        UserService u1 = new UserService(n1);
        UserService u2 = new UserService(n2);

        u1.registerUser("가리");
        u2.registerUser("가리");
    }
}
