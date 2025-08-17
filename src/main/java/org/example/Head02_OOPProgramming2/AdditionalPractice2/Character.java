package org.example.Head02_OOPProgramming2.AdditionalPractice2;

public class Character {
    private Weapon weapon;

    public Character(Weapon weapon){
        this.weapon = weapon;
    }

    public void attack(){
        weapon.attack();
    }

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }
}
