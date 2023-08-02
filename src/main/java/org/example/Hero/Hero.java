package org.example.Hero;

import org.example.HeroAttribute;

import java.util.ArrayList;
import java.util.List;

public  abstract class Hero {
    private String name;
    protected HeroAttribute attributes;
    private int level =1;
    private List<String> validWeapon = new ArrayList<>();
    private List<String> validArmor = new ArrayList<>();
    private  List<String>equip = new ArrayList<>();

    public Hero(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void levelUp(){
        level++;
    }
    public void setLevelUp(int level){
        this.level = level;
    }
    public void getLevel(){

    }
    public void displayHero(){
        System.out.println("Hero name:" +" " + name + "\n" +
                "Leve: " + level + "\n"+ "Total strength:"
                + "\n"  +"Total dexterity:" + "\n"  +"Damage"
                + "\n" + "Total intelligence:");
    }

}
