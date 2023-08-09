package org.example.Hero;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SwashBucklerTest {
    @Test
    void testingHeroWizard_SwashBucklerShouldHaveCorrectName() {
        Hero hero = new Wizard("Swashbuckler");
        assertEquals("Swashbuckler", hero.getName());
    }

    @Test
    void testingHero_SwashBucklerShouldHaveCorrectStartToLevelUp() {
        SwashBuckler sh = new SwashBuckler("SwashBuckler");
        sh.levelUp();
        assertEquals(2, sh.getLevel());
    }
    @Test
    void testingHero_ShouldHaveCorrectArmorType() {
        SwashBuckler sh = new SwashBuckler("SwashBuckler");
        assertEquals(null,sh.getArmorType());
    }
    @Test
    void testingDamagingAttributes_ShouldReturnCorrectDamagingAttributes() {
        SwashBuckler sh = new SwashBuckler("SwashBuckler");
        assertEquals(0,sh.getDamagingAttributes());
    }
    @Test
    void testingHeroDamage_ShouldHaveCorrectDamage() {
        SwashBuckler sh = new SwashBuckler("SwashBuckler");
        assertEquals(0,sh.calculateDamage());
    }
    @Test
    void testingHero_ShouldHaveCorrectLevelUp() {
        SwashBuckler sh = new SwashBuckler("SwashBuckler");
        assertEquals(1,sh.getLevel());
    }

}

