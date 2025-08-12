package org.example.Head03_OOPProgramming.AdditionalPractice;

public class SmsNotifier implements Notifier {
    public void send(String message){
        System.out.println("SMS 발송: " + message);
    }
}
