package org.example;

import org.example.Equipments.*;
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

       /* Weapon sword = new Weapon("Iron Sword", 1, Slot.Weapon, 10, WeaponType.Sword, 5);
        Weapon bow = new Weapon("Longbow", 2, Slot.Weapon, 15, WeaponType.Bow, 3);

        // Display weapon attributes and damage
        System.out.println("Sword: " + sword.toString());
        System.out.println("Bow: " + bow.toString());


        System.out.println("Sword Damage: " + sword.getWeaponDamage());
        System.out.println("Bow Type: " + bow.getWeaponType());
        System.out.println("Bow Total Attributes: " + bow.calculateTotalAttributes());*/














    }
}
