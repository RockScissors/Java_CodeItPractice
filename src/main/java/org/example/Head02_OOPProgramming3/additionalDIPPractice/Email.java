package org.example.Head02_OOPProgramming3.additionalDIPPractice;

public class Email implements NotificationSender{
    @Override
    public void send(String message) {
        System.out.println("Email: " + message);
    }
}
