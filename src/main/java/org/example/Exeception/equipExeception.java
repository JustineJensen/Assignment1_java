package org.example.Exeception;

import org.example.Equipments.Armor;
import org.example.Equipments.Item;
import org.example.Equipments.Weapon;

public class equipExeception {
    public void equipWeapon(Item item) throws IllegalAccessException {
        if(!(item instanceof Weapon)){
            throw  new IllegalAccessException("Wrong type, only weapons can be equipped");
        }
    }
    public void equipArmor(Item item) throws IllegalAccessException{
        if(!(item instanceof Armor)){
            throw  new IllegalAccessException("Wrong type, only armor can be equipped");
        }

    }
}
