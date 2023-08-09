package org.example.Equipments;

import org.example.Hero.Archer;
import org.example.Hero.Barbarian;
import org.example.Hero.Hero;
import org.example.Hero.HeroAttribute;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.testng.TestNGUtils;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeaponTest {
    @Test
    void testingWhenWeaponSwordIsCreated() {
        Item item = new Weapon("Sword", 1, Slot.Weapon, 1, WeaponType.Hatchet);
        assertEquals("Sword", item.getName());
    }

    @Test
    void testingCreateWeapon_ShouldHaveCorrectWeaponType() {
        Weapon weapon = new Weapon("Hatchets", 1, Slot.Weapon, 2, WeaponType.Hatchet);
        assertEquals(WeaponType.Hatchet, weapon.getWeaponType());
    }

    @Test
    void testingCreateWeapon_ShouldHaveCorrectSlot() {
        Weapon weapon = new Weapon("Hachets", 1, Slot.Body, 2, WeaponType.Hatchet);
        assertEquals(Slot.Body, weapon.getSlot());
    }

    @Test
    void testingCreateWeapon_ShouldHaveCorrectName() {
        Weapon weapon = new Weapon("Daggers", 1, Slot.Weapon, 1, WeaponType.Hatchet);
        assertEquals("Daggers", weapon.getName());
    }

    @Test
    void testCalculateDamageWithWeapon() {
        Weapon weapon = new Weapon("Hatchets", 1, Slot.Weapon, 2, WeaponType.Hatchet);
        assertEquals(10, weapon.getWeaponDamage());
    }

    @Test
    public void testCalculateDamageWithReplacedWeapon() {
        Weapon oldWeapon = new Weapon("Old Sword", 1, Slot.Weapon, 5, WeaponType.Sword);
        Weapon newWeapon = new Weapon("New Sword", 1, Slot.Weapon, 15, WeaponType.Sword);

        Archer archer = new Archer("Archer");
        archer.equipWeapon(oldWeapon);
        assertEquals(0, archer.calculateDamage());

        archer.equipWeapon(newWeapon);
        assertEquals(0, archer.calculateDamage());

    }

    @Test
    void testCalculateDamageWithWeaponAndArmor() {
        Weapon weapon = new Weapon("Sword", 1, Slot.Weapon, 10, WeaponType.Sword);
        Armor armor = new Armor("Cloth Armor", 1, Slot.Body, ArmorType.Cloth, new HeroAttribute(1, 0, 0));

        Archer hero = new Archer("Archer");
        hero.equipWeapon(weapon);
        hero.equipArmor(armor);

        assertEquals(0, hero.calculateDamage());
    }

    @Test
     void testDisplayHeroState_ShouldDisplayCorrectInformation() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        Archer hero = new Archer("Archer");
        hero.levelUp();
        Armor armor = new Armor("Cloth Armor", 1, Slot.Body, ArmorType.Cloth, new HeroAttribute(1, 2, 3));
        Weapon weapon = new Weapon("Sword", 1, Slot.Weapon, 10, WeaponType.Sword);

        hero.equipArmor(armor);
        hero.equipWeapon(weapon);

        hero.displayHero();

        System.setOut(originalOut);

        String expectedOutput = "Hello name : Archer\n" +
                "Level :2\n" +
                "Total strength :2\n" +
                "Total dexterity :12\n" +
                "Total intelligence :2\n" +
                "Damage :0\n";

        String actualOutput = outputStream.toString();
        System.out.println("Expected Output:");
        System.out.println(expectedOutput);
        System.out.println("Actual Output:");
        System.out.println(actualOutput);

        assertEquals(expectedOutput.trim(), actualOutput.trim());
    }
    }



