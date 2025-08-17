package org.example.Head02_OOPProgramming3.additionalDIPPractice;

public class Sms implements NotificationSender{
    public void send(String message) {
        System.out.println("Sms: " + message);
    }
}
