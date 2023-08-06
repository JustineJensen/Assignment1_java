package org.example.Equipments;

import org.example.Hero.Hero;
import org.example.Hero.HeroAttribute;

public class Rogues extends Hero {
    public Rogues(String name) {
        super(name);
        getValidWeaponType().add(WeaponType.Dagger);
        getValidWeaponType().add(WeaponType.Sword);

        setArmorType(ArmorType.Mail);
        setArmorType(ArmorType.Leather);

    }
    @Override
    protected void levelUpAttributes() {
        levelAttributes.add(new HeroAttribute(3,2,1));

    }
}
