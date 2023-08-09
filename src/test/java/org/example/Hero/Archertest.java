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
    @Test
    void testLevelUpAttributesArcherForStrength_ShouldReturnCollectLevel() {
        Archer archer = new Archer("Archer");
        HeroAttribute initialAttributes = archer.getTotalAttributes();
        archer.levelUp();
        assertEquals(2, archer .getLevel());
        assertEquals(1, initialAttributes.getStrength());
    }
    @Test
    void testLevelUpAttributesArcherForDexterity_ShouldReturnCollectLevel() {
        Archer archer = new Archer("Archer");
        HeroAttribute initialAttributes = archer .getTotalAttributes();
        archer.levelUp();
        assertEquals(2, archer .getLevel());
        assertEquals(7, initialAttributes.getDexterity());

    }
    @Test
    void testLevelUpAttributesArcherForIntelligence_ShouldReturnCollectLevel() {
        Archer archer = new Archer("Archer");
        HeroAttribute initialAttributes = archer .getTotalAttributes();
        archer.levelUp();
        assertEquals(2, archer .getLevel());
        assertEquals(1, initialAttributes.getIntelligence());

    }
    @Test
    void testArcherShouldHaveCorrectAttributes_returnCollectAttributes(){
        Archer archer = new Archer("Archer");
        HeroAttribute actualAttributes = archer.getTotalAttributes();
        assertEquals(1, actualAttributes.getStrength());
    }
    @Test
    void testArcherShouldHaveCorrectAttributesForDexterity_returnCollectAttributes(){
        Archer archer = new Archer("Archer");
        HeroAttribute actualAttributes = archer.getTotalAttributes();
        assertEquals(7, actualAttributes.getDexterity());
    }
    @Test
    void testArcherShouldHaveCorrectAttributesForIntelligence_returnCollectAttributes(){
        Archer archer = new Archer("Archer");
        HeroAttribute actualAttributes = archer.getTotalAttributes();
        assertEquals(1, actualAttributes.getIntelligence());

    }

    @Test
    void estHeroAttributesAfterLevelUpForStrength(){
        Archer archer = new Archer("Archer");
        archer.levelUp();
        HeroAttribute actualAttributes = archer.getTotalAttributes();
        assertEquals(2, actualAttributes.getStrength());

    }
    @Test
    void estHeroAttributesAfterLevelUpForIntelligence(){
        Archer archer = new Archer("Archer");
        archer.levelUp();
        HeroAttribute actualAttributes = archer.getTotalAttributes();
        assertEquals(2, actualAttributes.getIntelligence());
    }
    @Test
    void estHeroAttributesAfterLevelUpForDexterity(){
        Archer archer = new Archer("Archer");
        archer.levelUp();
        HeroAttribute actualAttributes = archer.getTotalAttributes();
        assertEquals(12, actualAttributes.getDexterity());
    }


}



