package org.example;

import org.example.Equipments.Item;
import org.example.Equipments.Slot;
import org.example.Equipments.Weapon;
import org.example.Equipments.WeaponType;
import org.example.Hero.*;

import static org.example.Equipments.Slot.Weapon;

public class Main {
    public static void main(String[] args) {

        Hero archer1 = new Archer("Archer1");
        Hero archer2 = new Archer("Archer2");

        archer1.levelUp();
        archer2.levelUp();

        archer1.displayHero();
        System.out.println("************************");
        archer1.displayHero();














    }
}
