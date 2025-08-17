package org.example.Head02_OOPProgramming2.AdditionalPractice;

public class SmsNotifier implements Notifier {
    public void send(String message){
        System.out.println("SMS 발송: " + message);
    }
}
