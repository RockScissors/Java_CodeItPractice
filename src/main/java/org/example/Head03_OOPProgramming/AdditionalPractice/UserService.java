package org.example.Head03_OOPProgramming.AdditionalPractice;

public class UserService {
    private Notifier notifier;

    public UserService(Notifier notifier){
        this.notifier = notifier;
    }

    public void registerUser(String name){
        //UserService는 알림을 어떻게 보내는지 모르고,
        //단지 notifier의 send 메소드를 호출할 뿐입니다.
        notifier.send("환영합니다, " + name + "님!");
    }
}
