package org.example.Head02_OOPProgramming2.AdditionalPractice;

public class EmailNotifier implements Notifier {
    public void send(String message){
        System.out.println("이메일 발송: " + message);
    }
}
