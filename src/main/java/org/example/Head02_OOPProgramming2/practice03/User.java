package org.example.Head02_OOPProgramming2.practice03;

public class User {
    protected String userId;
    protected String name;

    public User(String userId, String name){
        this.userId = userId;
        this.name = name;
    }

    public void printUserInfo(){
        System.out.println("ID: " + userId + ", 이름: " + name);
    }
}
