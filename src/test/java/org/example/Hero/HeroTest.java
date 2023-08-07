package org.example.Hero;

import org.example.Hero.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class HeroTest {

    //Testing for get name method
    @Test
    void testingHeroWizard_WizardShouldHaveCorrectName() {
        Hero hero = new Wizard("Wizard");
        assertEquals("Wizard",hero.getName());
    }
    @Test
    void testingHeroWizard_ArcherShouldHaveCorrectName() {
        Hero hero = new Wizard("Archer");
        assertEquals("Archer",hero.getName());
    }
    @Test
    void testingHeroWizard_SwashBucklerShouldHaveCorrectName() {
        Hero hero = new Wizard("Swashbuckler");
        assertEquals("Swashbuckler",hero.getName());
    }
    @Test
    void testingHeroWizard_BarbarianShouldHaveCorrectName() {
        Hero hero = new Wizard("Barbarian");
        assertEquals("Barbarian",hero.getName());
    }
    //Testing for levelUp method for all the HEROS
    @Test
    void testingHero_SwashBucklerShouldHaveCorrectStartToLevelUp() {
        Hero hr = new SwashBuckler("SwashBuckler");
        assertEquals(1,hr.getLevel());

    }
    @Test
    void testingHero_WizardShouldHaveCorrectStartToLevelUp() {
        Hero hr = new Wizard("Wizard");
        assertEquals(1,hr.getLevel());
    }
    @Test
    void testingHero_BarbarianShouldHaveCorrectStartToLevelUp() {
        Hero hr = new Barbarian("Barbarian");
        assertEquals(1,hr.getLevel());
    }
    @Test
    void testingHero_ArcherShouldHaveCorrectStartToLevelUp() {
        Hero hr = new Archer(" Archer");
        assertEquals(1,hr.getLevel());
    }
    //testing for attributes
    @Test
    void getArmorType() {
        Hero hero = new Wizard("Wizard");
        assertEquals(null,hero.getArmorType());
    }
    @Test
    void hasWeaponEquipped() {
        Hero  hero = new Archer("Archer1");
        assertFalse(hero.isWeaponEquipped);
    }
    @Test
    void getDamagingAttributes() {
        Hero hero = new Wizard("wizzard");
        assertEquals(0,hero.getDamagingAttributes());
    }
    @Test
    void testingTheCalculateDamage() {
        Hero hero = new Wizard("Wizzard");
        assertEquals(0,hero.calculateDamage());
    }

}