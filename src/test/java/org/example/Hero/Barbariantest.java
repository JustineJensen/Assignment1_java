package org.example.Hero;

import org.example.Equipments.Armor;
import org.example.Equipments.ArmorType;
import org.example.Equipments.Armortest;
import org.example.Equipments.Slot;
import org.example.Exeception.InvalidArmorException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Barbariantest {
    @Test
    void testingHero_BarbarianShouldHaveCorrectStartToLevelUp() {
        Barbarian br = new Barbarian("Barbarian");
        br.levelUp();
        assertEquals(2,br.getLevel());
    }
    @Test
    void testingHeroWizard_BarbarianShouldHaveCorrectName() {
        Barbarian barbarian = new Barbarian("Barbarian");
        assertEquals("Barbarian",barbarian.getName());
    }
    @Test
    void testingHero_BarbarianShouldHaveCorrectArmorType() {
        Barbarian barbarian = new Barbarian("Barbarian");
        assertEquals(null,barbarian.getArmorType());
    }
    @Test
    void testLevelUpAttributesBarbarianForStrength_ShouldReturnCollectLevel() {
        Barbarian barbarian = new Barbarian("Barbarian");
        HeroAttribute initialAttributes = barbarian .getTotalAttributes();
        barbarian.levelUp();
        assertEquals(2, barbarian .getLevel());
        assertEquals(5, initialAttributes.getStrength());
    }
    @Test
    void testLevelUpAttributesBarbarianForDexterity_ShouldReturnCollectLevel() {
        Barbarian barbarian = new Barbarian("Barbarian");
        HeroAttribute initialAttributes = barbarian .getTotalAttributes();
        barbarian.levelUp();
        assertEquals(2, barbarian .getLevel());
        assertEquals(2, initialAttributes.getDexterity());

    }
    @Test
    void testLevelUpAttributesBarbarianForIntelligence_ShouldReturnCollectLevel() {
        Barbarian barbarian = new Barbarian("Barbarian");
        HeroAttribute initialAttributes = barbarian .getTotalAttributes();
        barbarian.levelUp();
        assertEquals(2, barbarian .getLevel());
        assertEquals(1, initialAttributes.getIntelligence());

    }

    @Test
    void testBarbarianShouldHaveCorrectAttributesForStrength_returnCollectAttributes(){
        Barbarian barbarian = new Barbarian("Barbarian");
        HeroAttribute actualAttributes = barbarian.getTotalAttributes();
        assertEquals(5, actualAttributes.getStrength());

    }
    @Test
    void testBarbarianShouldHaveCorrectAttributesForDexterity_returnCollectAttributes(){
        Barbarian barbarian = new Barbarian("Barbarian");
        HeroAttribute actualAttributes = barbarian.getTotalAttributes();
        assertEquals(2, actualAttributes.getDexterity());
    }
    @Test
    void testBarbarianShouldHaveCorrectAttributesForIntelligence_returnCollectAttributes(){
        Barbarian barbarian = new Barbarian("Barbarian");
        HeroAttribute actualAttributes = barbarian.getTotalAttributes();
        assertEquals(1, actualAttributes.getIntelligence());

    }
    @Test
    void testHeroAttributesAfterLevelUpForStrength(){
        Barbarian barbarian = new Barbarian("Barbarian");
        barbarian.levelUp();
        HeroAttribute actualAttributes = barbarian.getTotalAttributes();
        assertEquals(8, actualAttributes.getStrength());

    }
    @Test
    void testHeroAttributesAfterLevelUpForIntelligence(){
        Barbarian barbarian = new Barbarian("Barbarian");
        barbarian.levelUp();
        HeroAttribute actualAttributes = barbarian.getTotalAttributes();
        assertEquals(2, actualAttributes.getIntelligence());
    }
    @Test
    void testHeroAttributesAfterLevelUpForDexterity(){
        Barbarian barbarian = new Barbarian("Barbarian");
        barbarian.levelUp();
        HeroAttribute actualAttributes = barbarian.getTotalAttributes();
        assertEquals(4, actualAttributes.getDexterity());
    }

    @Test
    void testTotalAttributesWithOnePieceArmor_shouldReturnCorrectArmor()  {
       Barbarian barbarian= new Barbarian("Barbarian");
        int expectedStrength = 5;
        Armor armor = new Armor("Mages",1,Slot.Body,ArmorType.Cloth,new HeroAttribute(1,0,0));
        barbarian.equipArmor(armor);
        assertEquals(expectedStrength, barbarian.getTotalAttributes().getStrength());
        assertEquals(5,armor.getArmorAttributes());
    }


}
