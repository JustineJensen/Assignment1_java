package org.example.Equipments;

public class    Weapon extends Item {
    private WeaponType weaponType;
    private int weaponAttributes;
    private int weaponDamage;
    public Weapon(String name, int requiredLevel, Slot slot,int weaponDamage, WeaponType weaponType,int weaponAttributes) {
        super(name, requiredLevel, slot);
        this.weaponType =weaponType;
        this.weaponDamage =weaponDamage;
        this.weaponAttributes  = weaponAttributes;

    }
    public WeaponType getWeaponType(){
        return  weaponType;
    }
    public int  getWeaponDamage(){
        return weaponDamage;
    }
    public void setWeaponDamage(int weaponDamage) {
        this.weaponDamage = weaponDamage;
    }

    public int getWeaponAttributes() {
        return weaponAttributes;
    }

    @Override
    public int calculateTotalAttributes() {
        return getWeaponAttributes();
    }



    @Override
    public String toString() {
        return "Weapon{" +
                "weaponType=" + weaponType +
                ", weaponDamage=" + weaponDamage +
                '}';
    }
}
