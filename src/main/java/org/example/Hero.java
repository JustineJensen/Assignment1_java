package org.example;

import java.util.List;

public class Hero {
    protected String name;
    protected  int level =1;
    protected  int levelAttributes;
    protected List<String>equipment;
    protected List<String>validWeaponTypes;
    protected List<String>validArmorTypes;

    public Hero(String name) {
        this.name = name;
    }
    public void levelUp(){
        level ++;
        levelAttributes +=3;
    }
    public void equip(String armor, String weapons){



    }
   /* public int calculateDamage(){

    }
    public double totalAttributes(){

    }*/
    public void displayHeroDetails() {
        System.out.println("Hero" + name +"" + level +"" + levelAttributes );
    }

}
