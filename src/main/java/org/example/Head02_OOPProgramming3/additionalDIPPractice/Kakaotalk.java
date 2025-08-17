package org.example.Head02_OOPProgramming3.additionalDIPPractice;

public class Kakaotalk implements NotificationSender{

    @Override
    public void send(String message) {
        System.out.println("kakaotalk: " + message);
    }
}
