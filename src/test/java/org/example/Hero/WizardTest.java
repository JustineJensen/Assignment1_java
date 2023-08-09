package org.example.Hero;

import org.example.Equipments.Armor;
import org.example.Equipments.ArmorType;
import org.example.Equipments.Slot;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WizardTest {
    @Test
    void testingHero_WizardShouldHaveCorrectArmorType() {
        Wizard wizard = new Wizard("Wizard");
        assertEquals(null,wizard.getArmorType());
    }
    @Test
    void testingDamagingAttributes_WizardShouldReturnCorrectDamagingAttributes() {
        Wizard wizard = new Wizard("Wizard");
        assertEquals(0,wizard.getDamagingAttributes());
    }
    @Test
    void testingHeroDamage_WizardShouldHaveCorrectDamage() {
        Wizard wizard = new Wizard("Wizard");
        assertEquals(0,wizard.calculateDamage());
    }
    @Test
    void testingHero_WizardShouldHaveCorrectLevel() {
        Wizard wizard = new Wizard("Wizard");
        assertEquals(1,wizard.getLevel());
    }
    @Test
    void testingHeroWizard_WizardShouldHaveCorrectName() {
        Wizard wizard = new Wizard("Wizard");
        assertEquals("Wizard",wizard.getName());
    }

    @Test
    void testLevelUpAttributesWizardForStrength_ShouldReturnCollectLevel() {
        Wizard wizard = new Wizard("Wizard");
        HeroAttribute initialAttributes = wizard.getTotalAttributes();
        wizard.levelUp();
        assertEquals(2, wizard.getLevel());
        assertEquals(1, initialAttributes.getStrength());
    }
    @Test
    void testLevelUpAttributesWizardForDexterity_ShouldReturnCollectLevel() {
        Wizard wizard = new Wizard("Wizard");
        HeroAttribute initialAttributes = wizard .getTotalAttributes();
        wizard.levelUp();
        assertEquals(2, wizard.getLevel());
        assertEquals(1, initialAttributes.getDexterity());

    }
    @Test
    void testLevelUpAttributesWizardForIntelligence_ShouldReturnCollectLevel() {
        Wizard wizard = new Wizard("Wizard");
        HeroAttribute initialAttributes = wizard.getTotalAttributes();
        wizard.levelUp();
        assertEquals(2, wizard .getLevel());
        assertEquals(8, initialAttributes.getIntelligence());
    }
    @Test
    void testWizardShouldHaveCorrectAttributesForStrength_returnCollectAttributes(){
        Wizard wizard = new Wizard("Wizard");
        HeroAttribute actualAttributes = wizard.getTotalAttributes();
        assertEquals(1, actualAttributes.getStrength());

    }
    @Test
    void testWizardShouldHaveCorrectAttributesForDexterity_returnCollectAttributes(){
        Wizard wizard = new Wizard("Wizard");
        HeroAttribute actualAttributes = wizard.getTotalAttributes();
        assertEquals(1, actualAttributes.getDexterity());
    }
    @Test
    void testWizardShouldHaveCorrectAttributesForIntelligence_returnCollectAttributes(){
        Wizard wizard = new Wizard("Wizard");
        HeroAttribute actualAttributes = wizard.getTotalAttributes();
        assertEquals(8, actualAttributes.getIntelligence());

    }
    @Test
    void testTotalAttributesWithOnePieceArmor_shouldReturnCorrectArmor()  {
        Wizard wizard = new Wizard("Wizard");
        int expectedStrength = 1;
        Armor armor = new Armor("Mages",1, Slot.Body, ArmorType.Cloth,new HeroAttribute(1,0,0));
        wizard.equipArmor(armor);
        assertEquals(expectedStrength, wizard.getTotalAttributes().getStrength());
        assertEquals(5,armor.getArmorAttributes());
    }
    @Test
    void testingDamagingAttributes_ShouldReturnCorrectDamagingAttributes() {
        Wizard wizard = new Wizard("Wizard");
        assertEquals(0,wizard.getDamagingAttributes());
    }
    @Test
    void testingHeroDamage_ShouldHaveCorrectDamage() {
        Wizard wizard = new Wizard("Wizard");
        assertEquals(0,wizard.calculateDamage());
    }
    @Test
    void testHeroAttributesAfterLevelUpForStrength(){
        Wizard wizard = new Wizard("Wizard");
        wizard.levelUp();
        HeroAttribute actualAttributes = wizard.getTotalAttributes();
        assertEquals(2, actualAttributes.getStrength());

    }
    @Test
    void testHeroAttributesAfterLevelUpForIntelligence(){
        Wizard wizard = new Wizard("Wizard");
        wizard.levelUp();
        HeroAttribute actualAttributes = wizard.getTotalAttributes();
        assertEquals(13, actualAttributes.getIntelligence());
    }
    @Test
    void testHeroAttributesAfterLevelUpForDexterity(){
        Wizard wizard = new Wizard("Wizard");
        wizard.levelUp();
        HeroAttribute actualAttributes = wizard.getTotalAttributes();
        assertEquals(2, actualAttributes.getDexterity());
    }


}

