package org.example.Equipments;

import org.example.Equipments.ArmorType;
import org.example.Equipments.WeaponType;
import org.example.Hero.Hero;
import org.example.Hero.HeroAttribute;

public class Warrior extends Hero {

    public Warrior(String name) {
        super(name);

               getValidWeaponType().add(WeaponType.Hatchet);
               getValidWeaponType().add(WeaponType.Mace);
               getValidWeaponType().add(WeaponType.Sword);

              setArmorType(ArmorType.Mail);
              setArmorType(ArmorType.Plate);


    }
    @Override
    protected void levelUpAttributes() {
        levelAttributes.add(new HeroAttribute(3,2,1));

    }
}
