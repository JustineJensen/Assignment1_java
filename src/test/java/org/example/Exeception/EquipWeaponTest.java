package org.example.Exeception;

import org.example.Equipments.Slot;
import org.example.Equipments.Weapon;
import org.example.Equipments.WeaponType;
import org.example.Hero.Archer;
import org.example.Hero.Hero;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EquipWeaponTest {
    @Test
    void HeroShouldBeAbleToEquipAWeapon_ThrowInvalidException() {
        Hero hero = new Archer("Archer1");
        Weapon invalidWeapon= new Weapon("Sword",1,Slot.Body,0, WeaponType.Hatchet);
        String expected = "Invalid weapon type";
        // Act & Assert
       assertThrows(InvalidWeaponException.class,() -> hero.equipWeapon(invalidWeapon));
    }
}
