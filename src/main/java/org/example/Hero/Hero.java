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

    @Override
    public String toString() {
        return "name='" + name + '\'';
    }
}
