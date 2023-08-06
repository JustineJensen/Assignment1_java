package org.example.Equipments;

public class Armor extends Item {
    private ArmorType armorType;
    private int armorAttributes;
    public Armor(String name, int requiredLevel, int slot) {
        super(name, requiredLevel, slot);
    }
    public ArmorType getArmorType(){
        return armorType;
    }

    public int  getArmorAttributes() {
        return armorAttributes;
    }
}
