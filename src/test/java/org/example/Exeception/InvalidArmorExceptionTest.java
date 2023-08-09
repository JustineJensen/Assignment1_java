package org.example.Exeception;

import org.example.Equipments.*;
import org.example.Hero.Archer;
import org.example.Hero.Hero;
import org.example.Hero.HeroAttribute;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvalidArmorExceptionTest {
    @Test
    void HeroShouldBeAbleToEquipArmor_ThrowInvalidException() {
        Hero hero = new Archer("Archer1");
        Armor invalidArmor= new Armor("Worries",1,Slot.Body, ArmorType.Plate, new HeroAttribute(1,0,0));
        String expected = "Invalid armortypePlate";
        // Act & Assert
        Exception ex =assertThrows(InvalidArmorException.class,() -> hero.equipArmor(invalidArmor));
        String actual = ex.getMessage();
      assertEquals(expected,actual);
    }

}