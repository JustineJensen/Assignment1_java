package org.example.Equipments;

import org.example.Hero.HeroAttribute;

public class Armor extends Item {
    private ArmorType armorType;
    private HeroAttribute heroAttribute;
    private int armorAttributes;

    public Armor(String name, int requiredLevel, Slot slot, ArmorType armorType, HeroAttribute heroAttribute) {
        super(name, requiredLevel, slot);
        this.armorType =armorType;
        this.heroAttribute = heroAttribute;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public Slot getSlot() {
        return super.getSlot();
    }

    public void setArmorType(ArmorType armorType) {
        this.armorType = armorType;
    }

    public ArmorType getArmorType(){
        return armorType;
    }

    public int  getArmorAttributes() {
        int totalAttributes = 0;
        if (armorType == ArmorType.Cloth) {
            totalAttributes += getRequiredLevel() * 5;
        } else if (armorType == ArmorType.Leather) {
            totalAttributes += getRequiredLevel() * 8;
        } else if (armorType == ArmorType.Mail) {
            totalAttributes += getRequiredLevel() * 10;
        } else if (armorType == ArmorType.Plate) {
            totalAttributes += getRequiredLevel() * 12;
        }
        return totalAttributes;
    }

    public void setArmorAttributes(int armorAttributes) {
       this.armorAttributes= armorAttributes;
    }



}
