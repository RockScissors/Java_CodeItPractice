package org.example.Head02_OOPProgramming2.practice03;

public class PersonalUser extends User{
    private String email;

    public PersonalUser(String id, String name, String email){
        super(id, name);
        this.email = email;
    }

    public void printUserInfo(){
        super.printUserInfo();
        System.out.println("이메일: " + email);
    }
}
