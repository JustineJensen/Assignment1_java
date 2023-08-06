package org.example.Equipments;

import org.example.Hero.Hero;
import org.example.Hero.HeroAttribute;

public class Rangers extends Hero {
    public Rangers(String name) {
        super(name);
        getValidWeaponType().add(WeaponType.Bow);

        setArmorType(ArmorType.Mail);
        setArmorType(ArmorType.Leather);

    }
    @Override
    protected void levelUpAttributes() {
        levelAttributes.add(new HeroAttribute(3,2,1));

    }
}
