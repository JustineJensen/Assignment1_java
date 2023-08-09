package org.example.Hero;

import org.example.Equipments.Armor;
import org.example.Equipments.ArmorType;
import org.example.Equipments.Slot;
import org.example.Exeception.InvalidArmorException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class Archertest {
    @Test
    void checkingHeroName_ShouldReturnCorrectName() {
        Hero hero = new Wizard("Archer");
        assertEquals("Archer", hero.getName());
    }

    @Test
    void testingHero_ShouldReturnCorrectLevelUp() {
        Archer archer = new Archer(" Archer");
        assertEquals(1, archer.getLevel());
    }
    @Test
    void testingHero_ArcherShouldHaveCorrectArmorType() {
        Archer archer = new Archer("Archer");
        assertEquals(null,archer.getArmorType());
    }


    }

