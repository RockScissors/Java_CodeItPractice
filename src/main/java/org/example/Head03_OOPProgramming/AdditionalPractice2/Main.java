package org.example.Head03_OOPProgramming.AdditionalPractice2;

public class Main {
    public static void main(String[] args) {
        Character 가리 = new Character(new Sword());
        가리.attack();
        가리.setWeapon(new Bow());
        가리.attack();
    }
}
