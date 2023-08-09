package org.example.Equipments;

import org.example.Hero.Archer;
import org.example.Hero.Hero;
import org.example.Hero.HeroAttribute;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Armortest {
    @Test
    void testingCreateArmor_ShouldHaveCorrectName() {
        Armor armor = new Armor("Chest",1,Slot.Body,ArmorType.Leather,new HeroAttribute(1,0,0));
        assertEquals("Chest",armor.getName());
    }
    @Test
    void testingCreateArmor_ShouldHaveCorrectArmorType() {
        Armor armor = new Armor("Chest",1,Slot.Body,ArmorType.Leather,new HeroAttribute(1,0,0));
        assertEquals(Slot.Body,armor.getSlot());
    }
    @Test
    void testingCreateArmor_ShouldHaveCorrectSlot() {
        Armor armor = new Armor("Chest",1,Slot.Body,ArmorType.Leather,new HeroAttribute(1,0,0));
        assertEquals(ArmorType.Leather,armor.getArmorType());
    }
    @Test
    void testingCreateArmor_ShouldHaveCorrectAttribute() {
        Armor armor = new Armor("Chest",1,Slot.Body,ArmorType.Leather,new HeroAttribute(1,0,0));
        assertEquals("Chest",new HeroAttribute(1,2,0));
    }


}
