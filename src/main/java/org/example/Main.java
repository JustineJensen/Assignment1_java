package org.example;

import org.example.Equipments.*;
import org.example.Exeception.InvalidArmorException;
import org.example.Exeception.InvalidWeaponException;
import org.example.Hero.*;

import static org.example.Equipments.Slot.Weapon;

public class Main {
    public static void main(String[] args)  {

        Barbarian barbarian = new Barbarian("Conan");
        barbarian.getValidWeaponType().add(WeaponType.Staff);
        barbarian.getValidArmorType().add(ArmorType.Plate);
        System.out.println("******************************************************");
        barbarian.displayHero();
        barbarian.levelUp();
        barbarian.levelUp();
        barbarian.levelUp();
        barbarian.displayHero();
        System.out.println("******************************************************");
        //Testing weapon
        Weapon validWeapon = new Weapon("Hachet",1, Weapon,2,WeaponType.Staff);
        barbarian.equipWeapon(validWeapon);
        barbarian.displayHero();

        System.out.println("******************************************************");
        //Testing armor
        Armor validArmor = new Armor("Common Plate Chest",1,Slot.Body,ArmorType.Plate,new HeroAttribute(1,0,0));
        barbarian.equipArmor(validArmor);
        barbarian.displayHero();

        int damage = barbarian.calculateDamage();
        //System.out.println(damage);

            /*wizard.levelUp();
            archer.levelUp();
            swashBuckler.levelUp();

            // Display hero information and calculated damage
            barbarian.displayHero();
            wizard.displayHero();
            archer.displayHero();
            swashBuckler.displayHero();*/

        /*
        Wizard wizard = new Wizard("Gandalf");
        Archer archer = new Archer("Legolas");
        SwashBuckler swashBuckler = new SwashBuckler("Jack");

        //testing armor
        Armor plate = new Armor("Common Plate Chest",1,Slot.Body,ArmorType.Plate,new HeroAttribute(1,0,0));
        plate.setArmorType(ArmorType.Leather);
        plate.getArmorType();

        wizard.getValidWeaponType().add(WeaponType.Sword);*/

        // Check exception error armor
        //Armor checkArmor = new Armor("Leather",1,Slot.Body,ArmorType.Plate,new HeroAttribute(1,0,0));
























    }
}
