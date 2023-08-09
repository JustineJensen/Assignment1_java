package org.example.Hero;

import org.example.Equipments.Armor;
import org.example.Equipments.ArmorType;
import org.example.Equipments.Slot;
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
    void testLevelUpAttributesSwashBucklerForStrength_ShouldReturnCollectLevel() {
        SwashBuckler sh = new SwashBuckler("SwashBuckler");
        HeroAttribute initialAttributes = sh.getTotalAttributes();
        sh.levelUp();
        assertEquals(2, sh .getLevel());
        assertEquals(2, initialAttributes.getStrength());
    }
    @Test
    void testLevelUpAttributesSwashBucklerForDexterity_ShouldReturnCollectLevel() {
        SwashBuckler sh = new SwashBuckler("SwashBuckler");
        HeroAttribute initialAttributes = sh .getTotalAttributes();
        sh.levelUp();
        assertEquals(2, sh .getLevel());
        assertEquals(6, initialAttributes.getDexterity());

    }
    @Test
    void testLevelUpAttributesSwashBucklerForIntelligence_ShouldReturnCollectLevel() {
        SwashBuckler sh = new SwashBuckler("SwashBuckler");
        HeroAttribute initialAttributes = sh .getTotalAttributes();
        sh.levelUp();
        assertEquals(2, sh .getLevel());
        assertEquals(1, initialAttributes.getIntelligence());
    }
    @Test
    void testSwashBucklerShouldHaveCorrectAttributesForStrength_returnCollectAttributes(){
        SwashBuckler sh = new SwashBuckler("SwashBuckler");
        HeroAttribute actualAttributes = sh.getTotalAttributes();
        assertEquals(2, actualAttributes.getStrength());

    }
    @Test
    void testSwashBucklerShouldHaveCorrectAttributesForDexterity_returnCollectAttributes(){
        SwashBuckler sh = new SwashBuckler("SwashBuckler");
        HeroAttribute actualAttributes = sh.getTotalAttributes();
        assertEquals(6, actualAttributes.getDexterity());
    }
    @Test
    void testSwashBucklerShouldHaveCorrectAttributesForIntelligence_returnCollectAttributes(){
        SwashBuckler sh = new SwashBuckler("SwashBuckler");
        HeroAttribute actualAttributes = sh.getTotalAttributes();
        assertEquals(1, actualAttributes.getIntelligence());

    }

    @Test
    void testTotalAttributesWithOnePieceArmor_shouldReturnCorrectArmor()  {
        SwashBuckler sh = new SwashBuckler("SwashBuckler");
        int expectedStrength = 2;
        Armor armor = new Armor("Mages",1, Slot.Body, ArmorType.Cloth,new HeroAttribute(1,0,0));
        sh.equipArmor(armor);
        assertEquals(expectedStrength, sh.getTotalAttributes().getStrength());
        assertEquals(5,armor.getArmorAttributes());
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

