package org.example.Equipmements;

import org.example.Hero.Hero;

public class  Item {
    private String name;
    private int requiredLevel;
    private int slot;
    private Hero hero;

    public Item(String name, int requiredLevel, int slot) {
        this.name = name;
        this.requiredLevel = requiredLevel;
        this.slot = slot;
    }
    /*public void requiredLevel(int requiredLevel){
        if(hero < requiredLevel){
            System.out.println( "You cannot equit item");
        }
        */
    }

