package org.example.Head03_OOPProgramming.practice03;

public class BusinessUser extends User{
    private String company;

    public BusinessUser(String id, String name, String company){
       super(id, name);
       this.company = company;
    }

    public void printUserInfo(){
        super.printUserInfo();
        System.out.println("회사명: " + company);
    }

}
