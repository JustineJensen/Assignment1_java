package org.example.Equipments;

public class    Weapon extends Item {
    private WeaponType weaponType;
    private int weaponDamage;
    public Weapon(String name, int requiredLevel, int slot, WeaponType weaponType) {
        super(name, requiredLevel, slot);
        this.weaponType =weaponType;

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
    @Override
    public String toString() {
        return "Weapon{" +
                "weaponType=" + weaponType +
                ", weaponDamage=" + weaponDamage +
                '}';
    }
}
