package org.example.Equipments;

import org.example.Hero.Hero;

public abstract class  Item {
    private String name;
    private int requiredLevel;
    private int weaponDamage;
    private Slot slot;
    private Hero hero;
    private String type;

    public Item(String name, int requiredLevel, int slot) {
        this.name = name;
        this.requiredLevel = requiredLevel;
        this.type = type;
        this.weaponDamage = getWeaponDamage();

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
    public String getType() {
        return type;
    }
    public int getWeaponDamage() {
        return weaponDamage;
    }
    public void setWeaponDamage(int weaponDamage){
        this.weaponDamage = weaponDamage;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", requiredLevel=" + requiredLevel +
                ", slot=" + slot +
                '}';
    }

    public int equip(int heroLevel) {
        System.out.println(heroLevel >= requiredLevel ? "You can not equip the item" : "Item equipped");
     return heroLevel;
    }



}

