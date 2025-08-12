package org.example.Head03_OOPProgramming.AdditionalPractice;

public class EmailNotifier implements Notifier {
    public void send(String message){
        System.out.println("이메일 발송: " + message);
    }
}
