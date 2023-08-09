package org.example.Hero;

import org.example.Equipments.Item;
import org.example.Equipments.Slot;

public class Barbarian extends Hero {
    public Barbarian(String name) {
        super(name);
        this.levelAttributes = new HeroAttribute(5, 2, 1);
    }
    public String getName() {
        return super.getName();
    }

    /*public int getLevel() {
        return super.getLevel();
    }*/

    @Override
    public void levelUpAttributes() {
        levelAttributes.add(new HeroAttribute(3,2,1));
    }

    }


