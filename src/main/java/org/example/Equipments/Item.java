package org.example.Equipments;

import org.example.Hero.Hero;

public abstract class  Item {
    private String name;
    private int requiredLevel;
    private int weaponDamage;
    private Slot slot;
    private String itemType;

    public Item(String name, int requiredLevel, Slot slot) {
        this.name = name;
        this.requiredLevel = requiredLevel;
        this.itemType = itemType;
        this.weaponDamage = getWeaponDamage();
        this.slot = slot;

    }

    public String getName() {
        return name;
    }

    public int getRequiredLevel() {
        return requiredLevel;
    }

    public Slot getSlot() {
        return slot;
    }
    public String getItemType() {
        return itemType;
    }
    public int getWeaponDamage() {
        return weaponDamage;
    }
    public void setWeaponDamage(int weaponDamage){
        this.weaponDamage = weaponDamage;
    }
    public abstract  int calculateTotalAttributes();

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", requiredLevel=" + requiredLevel +
                ", slot=" + slot +
                '}';
    }





}

