package org.example.Equipments;

import org.example.Hero.Hero;
import org.example.Hero.HeroAttribute;

public class Mages extends  Hero {


        public Mages(String name) {
            super(name);

            getValidWeaponType().add(WeaponType.Wand);
            getValidWeaponType().add(WeaponType.Staff);

            setArmorType(ArmorType.Cloth);

        }
        @Override
        protected void levelUpAttributes() {
            levelAttributes.add(new HeroAttribute(3,2,1));

        }
    }
