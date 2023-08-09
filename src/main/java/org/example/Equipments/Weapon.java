package org.example.Equipments;

public class    Weapon extends Item {
    private WeaponType weaponType;
    private int weaponDamage;

    public Weapon(String name, int requiredLevel, Slot slot, int weaponDamage,WeaponType weaponType) {
        super(name, requiredLevel, slot );
        this.weaponType = weaponType;
        this.weaponDamage =weaponDamage;
    }

    /**
     *
     * @return weaponType
     */

    public WeaponType getWeaponType(){
        return  weaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
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
