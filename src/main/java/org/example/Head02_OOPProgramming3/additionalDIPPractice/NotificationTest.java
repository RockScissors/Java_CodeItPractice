package org.example.Head02_OOPProgramming3.additionalDIPPractice;

public class NotificationTest {
    public static void main(String[] args) {
        NotificationSendProcessor notificationSendProcessor
                = new NotificationSendProcessor();

        NotificationSender[] notificationSenders = {
          new Kakaotalk(), new Email(), new Sms()
        };

        for(NotificationSender notificationSender : notificationSenders){
            notificationSendProcessor.send(notificationSender, "가리야 안녕!");
        }
    }
}
