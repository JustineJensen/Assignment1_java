package org.example.Equipments;

public class Armor extends Item {
    private ArmorType armorType;
    private int armorAttributes;

    public Armor(String name, int requiredLevel, Slot slot, int weaponDamage,ArmorType armorType) {
        super(name, requiredLevel, slot);
        this.armorAttributes = armorAttributes;
        this.armorType =armorType;
    }

    /*public Armor(String name, int requiredLevel, Slot slot, int armorAttributes) {
        super(name, requiredLevel, slot);
        this.armorAttributes = armorAttributes;
    }*/

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
        return armorAttributes;
    }

    public void setArmorAttributes(int armorAttributes) {
       this.armorAttributes= armorAttributes;
    }



}
