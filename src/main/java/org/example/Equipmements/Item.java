package org.example.Equipmements;

import org.example.Hero.Hero;

public abstract class  Item {
    private String name;
    private int requiredLevel;
    private int slot;
    private Hero hero;

    public Item(String name, int requiredLevel, int slot) {
        this.name = name;
        this.requiredLevel = requiredLevel;
        this.slot = slot;
    }

    public String getName() {
        return name;
    }

    public int getRequiredLevel() {
        return requiredLevel;
    }

    public int getSlot() {
        return slot;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", requiredLevel=" + requiredLevel +
                ", slot=" + slot +
                '}';
    }
    public boolean equip(int heroLevel){
        if(heroLevel >= requiredLevel){
            return false;
        }
        return true;
    }

    // method to add two instances
    public int totalAttributes(int a, int b){
        int total = a + b;
        return total;
    }


    }

