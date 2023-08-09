package org.example.Hero;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WizardTest {
    @Test
    void testingHero_WizardShouldHaveCorrectArmorType() {
        Hero hero = new Wizard("Wizard");
        assertEquals(null,hero.getArmorType());
    }
    @Test
    void testingDamagingAttributes_WizardShouldReturnCorrectDamagingAttributes() {
        Hero hero = new Wizard("wizzard");
        assertEquals(0,hero.getDamagingAttributes());
    }
    @Test
    void testingHeroDamage_WizardShouldHaveCorrectDamage() {
        Hero hero = new Wizard("Wizzard");
        assertEquals(0,hero.calculateDamage());
    }
    @Test
    void testingHero_WizardShouldHaveCorrectLevelUp() {
        Hero hr = new Wizard("Wizard");
        assertEquals(1,hr.getLevel());
    }
    @Test
    void testingHeroWizard_WizardShouldHaveCorrectName() {
        Hero hero = new Wizard("Wizard");
        assertEquals("Wizard",hero.getName());
    }
}
