package org.example.Equipments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {
   // When Weapon is created, it needs to have the correct name, required level, slot, weapon type, and damage
    @Test
    void testingWhenWeaponSwordIsCreated() {
        Item item = new Weapon("Sword",1,Slot.Weapon,1);
        assertEquals("Sword",item.getName());
    }
    @Test
    void testingCreateWeapon_ShouldHaveCorrectWeaponType() {
       Weapon weapon = new Weapon("Hatchets",1,Slot.Weapon,2);
        assertEquals(null,weapon.getWeaponType());
    }
    @Test
    void testingCreateWeapon_ShouldHaveCorrectWeaponDamage() {
        Weapon weapon = new Weapon("Hatchets",1,Slot.Weapon,2);
        assertEquals(2,weapon.getWeaponDamage());
    }
    @Test
    void testingCreateWeapon_ShouldHaveCorrectSlot() {
        Weapon weapon = new Weapon("Staff",1,Slot.Body,1);
        assertEquals(Slot.Body,weapon.getSlot());
    }
    @Test
    void testingCreateWeapon_ShouldHaveCorrectName() {
        Weapon weapon = new Weapon("Daggers",1,Slot.Weapon,1);
        weapon.setWeaponType(WeaponType.Dagger);
        assertEquals("Daggers",weapon.getName());
    }
    //When Armor is created, it needs to have the correct name, required level, slot, armor type, and armor attributes
    @Test
    void testingCreateArmor_ShouldHaveCorrectName() {
        Armor armor = new Armor("Chest",1,Slot.Body,2,ArmorType.Plate);
       assertEquals("Chest",armor.getName());
    }
    @Test
    void testingCreateArmor_ShouldHaveCorrectArmorType() {
        Armor armor = new Armor("Chest",1,Slot.Body,2,ArmorType.Plate);
        assertEquals(Slot.Body,armor.getSlot());
    }
    @Test
    void testingCreateArmor_ShouldHaveCorrectSlot() {
        Armor armor = new Armor("Chest",1,Slot.Body,2,ArmorType.Plate);
        assertEquals(ArmorType.Plate,armor.getArmorType());
    }
    // testing attributes
    @Test
    void testingAttributes_ShouldHaveCorrectAttributes() {
        Armor armor = new Armor("Chest",1,Slot.Body,2,ArmorType.Plate);
        assertEquals(0,armor.getArmorAttributes());
    }

}