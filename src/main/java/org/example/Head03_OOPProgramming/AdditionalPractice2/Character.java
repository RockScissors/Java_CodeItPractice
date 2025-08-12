package org.example.Head03_OOPProgramming.AdditionalPractice2;

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
