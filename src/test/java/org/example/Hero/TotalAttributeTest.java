package org.example.Hero;

import org.example.Equipments.Armor;
import org.example.Equipments.ArmorType;
import org.example.Equipments.Slot;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TotalAttributeTest {
    @Test
    void testingTotalAttributesWithNoEquipmentForStrength_shouldReturnCorrectAttributes() {
        Archer archer = new Archer("Archer");
        int expectedStrength = 1;
        assertEquals(expectedStrength, archer.getTotalAttributes().getStrength());
    }

    @Test
    void testingTotalAttributesWithNoEquipmentForDexterity_shouldReturnCorrectAttributes() {
        Archer archer = new Archer("Archer");
        int expectedDexterity = 7;
        assertEquals(expectedDexterity, archer.getTotalAttributes().getDexterity());
    }

    @Test
    void testingTotalAttributesWithNoEquipmentForIntelligence_shouldReturnCorrectAttributes() {
        Archer archer = new Archer("Archer");
        int expectedIntelligence = 1;
        assertEquals(expectedIntelligence, archer.getTotalAttributes().getIntelligence());
    }

    @Test
    void testingTotalAttributesWithOnePieceEquipmentForIntelligence_shouldReturnCorrectEquipmnet() {
        Archer archer = new Archer("Archer");
        int expectedIntelligence = 7;
        Armor armor = new Armor("Mages", 1, Slot.Body, ArmorType.Cloth, new HeroAttribute(0, 0, 1));
        archer.equipArmor(armor);
        assertEquals(expectedIntelligence, archer.getTotalAttributes().getDexterity());
        assertEquals(5, armor.getArmorAttributes());
    }

    @Test
    void testingTotalAttributesWithOnePieceEquipmentForStrength_shouldReturnCorrectEquipmnet() {
        Archer archer = new Archer("Archer");
        int expectedStrength = 1;
        Armor armor = new Armor("Mages", 1, Slot.Body, ArmorType.Cloth, new HeroAttribute(1, 0, 0));
        archer.equipArmor(armor);
        assertEquals(expectedStrength, archer.getTotalAttributes().getStrength());
        assertEquals(5, armor.getArmorAttributes());
    }

    @Test
    void testingTotalAttributesWithOnePieceEquipmentForDexterity_shouldReturnCorrectEquipmnet() {
        Archer archer = new Archer("Archer");
        int expectedDexterity = 7;
        Armor armor = new Armor("Mages", 1, Slot.Body, ArmorType.Cloth, new HeroAttribute(0, 1, 0));
        archer.equipArmor(armor);
        assertEquals(expectedDexterity, archer.getTotalAttributes().getDexterity());
        assertEquals(5, armor.getArmorAttributes());
    }

    @Test
    void testingTotalAttributesWithTwoPieceEquipmentForDexterity() {
        Archer archer = new Archer("Archer");
        int expectedDexterity = 7;
        Armor armor = new Armor("Mages", 1, Slot.Body, ArmorType.Cloth, new HeroAttribute(0, 7, 0));
        Armor armor2 = new Armor("Mages", 1, Slot.Body, ArmorType.Cloth, new HeroAttribute(0, 7, 0));
        archer.equipArmor(armor);
        archer.equipArmor(armor2);
        assertEquals(expectedDexterity, archer.getTotalAttributes().getDexterity());
        assertEquals(5, armor.getArmorAttributes());
    }

    @Test
    void testingTotalAttributesWithTwoPieceEquipmentForIntelligence() {
        Archer archer = new Archer("Archer");
        int expectedIntelligence = 1;
        Armor armor = new Armor("Mages", 1, Slot.Body, ArmorType.Cloth, new HeroAttribute(0, 0, 1));
        Armor armor2 = new Armor("Mages", 1, Slot.Body, ArmorType.Cloth, new HeroAttribute(1, 0, 0));
        archer.equipArmor(armor);
        archer.equipArmor(armor2);
        assertEquals(expectedIntelligence, archer.getTotalAttributes().getIntelligence());
        assertEquals(5, armor.getArmorAttributes());
    }

    @Test
    void testingTotalAttributesWithTwoPieceEquipmentForStrength() {
        Archer archer = new Archer("Archer");
        int expectedStrength = 1;
        Armor armor = new Armor("Mages", 1, Slot.Body, ArmorType.Cloth, new HeroAttribute(1, 0, 0));
        Armor armor2 = new Armor("Mages", 1, Slot.Body, ArmorType.Cloth, new HeroAttribute(1, 0, 0));
        archer.equipArmor(armor);
        archer.equipArmor(armor2);
        assertEquals(expectedStrength, archer.getTotalAttributes().getStrength());
        assertEquals(5, armor.getArmorAttributes());
    }

    @Test
    public void testTotalAttributesWithReplacedArmorForStrength() {
        Archer archer = new Archer("Archer");
        Armor armor = new Armor("Mages", 1, Slot.Body, ArmorType.Cloth, new HeroAttribute(1, 0, 0));
        Armor armor2 = new Armor("Mages", 1, Slot.Body, ArmorType.Cloth, new HeroAttribute(1, 0, 0));

        archer.equipArmor(armor);
        assertEquals(new HeroAttribute(1 + armor.getArmorAttributes(), 0, 0), archer.getTotalAttributes());

        archer.equipArmor(armor2);
        assertEquals(new HeroAttribute(2 + armor.getArmorAttributes(), 0, 0), archer.getTotalAttributes());

        archer.equipArmor(armor);
        assertEquals(new HeroAttribute(1 + armor.getArmorAttributes(), 0, 0), archer.getTotalAttributes());
    }
    @Test
    public void testTotalAttributesWithReplacedArmorForIntelligence() {
        Archer archer = new Archer("Archer");
        Armor armor = new Armor("Mages", 1, Slot.Body, ArmorType.Cloth, new HeroAttribute(1, 0, 0));
        Armor newArmor = new Armor("New Mages", 1, Slot.Body, ArmorType.Cloth, new HeroAttribute(2, 0, 0)); // Replace with new armor

        archer.equipArmor(armor);
        assertEquals(new HeroAttribute(1 + armor.getArmorAttributes(), 0, 0), archer.getTotalAttributes());

        archer.equipArmor(newArmor);
        assertEquals(new HeroAttribute(2 + newArmor.getArmorAttributes(), 0, 0), archer.getTotalAttributes());

        archer.equipArmor(armor);
        assertEquals(new HeroAttribute(1 + armor.getArmorAttributes(), 0, 0), archer.getTotalAttributes());
    }
}
