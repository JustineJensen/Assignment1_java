package org.example.Hero;

import org.example.Equipments.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Hero {
    private String name;
    private ArmorType armorType;
    protected HeroAttribute levelAttributes;
    private HeroAttribute totalAttributes;
    private int level = 1;
    private List<WeaponType> validWeaponType;
    private List<ArmorType> validArmorType;
    private Map<Slot, Item> equipmentItem;
    private WeaponType weaponType;
    private int damagingAttributes;
    protected boolean isWeaponEquipped;

    public Hero(String name) {
        this.name = name;

        this.levelAttributes = new HeroAttribute(0, 0, 0);
        this.validWeaponType = new ArrayList<>();
        this.validArmorType = new ArrayList<>();
        this.equipmentItem = new HashMap<>();
        this.totalAttributes = new HeroAttribute(0,0,0);
        this.damagingAttributes = getDamagingAttributes();

        for (Slot slot : Slot.values()) {
            equipmentItem.put(slot, null); // put the slot in the equipmnet value
        }
    }

    public int getLevel() {
        return level;
    }

    public void setLevelUp(int level) {
        this.level = level;
    }

    public void setLevelAttributes(HeroAttribute levelAttributes) {
        this.levelAttributes = levelAttributes;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public ArmorType getArmorType() {
        return armorType;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public List<WeaponType> getValidWeaponType() {
        return validWeaponType;
    }

    public void setArmorType(ArmorType armorType) {
        this.armorType = armorType;
    }


    public void levelUp() {
        this.level++;
        levelUpAttributes();
    }
    protected abstract void levelUpAttributes();

    public void equipArmor(Armor armor) {
        if (validArmorType.contains(armor.getArmorType())) {
            equipmentItem.put(armor.getSlot(), armor);
            isWeaponEquipped = true;
        } else {
            System.out.println("invalid armor");
        }
    }

    /**
     * This method equips an item "weapon"
     * @param item
     */
    public void equipWeapon(Weapon weapon) {
        if (validWeaponType.contains(weapon.getWeaponType())) {
            // equip the weapon
            equipmentItem.put(Slot.Weapon, weapon);
            isWeaponEquipped =true;
        } else {
            System.out.println("Invalid weapon");
        }
    }

    /**
     * Checks if there is an item in the equipmmnet map
     * @return null item if there is no weapon else returns true
     */
    protected boolean hasWeaponEquipped() {
        return  equipmentItem.get(Slot.Weapon)!= null;
    }
    protected int getDamagingAttributes() {
        return damagingAttributes;
    }

    public  int calculateDamage(){
        int weaponDamage =0;
        Weapon weapon = (Weapon) equipmentItem.get(Slot.Weapon);
        if(weapon != null){
            weaponDamage = weapon.getWeaponDamage();
        }
        //calculate  damaging attributes based on hero
        int damagingAttributes =0;

        if(this instanceof Barbarian) {
            damagingAttributes = getTotalAttributes().getDexterity();
        }else if(this instanceof Wizard) {
            damagingAttributes = getTotalAttributes().getDexterity();
        }else if(this instanceof  Archer || this instanceof  SwashBuckler ){
            damagingAttributes = getTotalAttributes().getDexterity();


        }
        int heroDamage = weaponDamage* (1+ damagingAttributes / 100);
        return  heroDamage;
    }

    /**
     * @return total attributes
     */
    public HeroAttribute getTotalAttributes() {
        HeroAttribute totalAttributes = new HeroAttribute(levelAttributes.getStrength(), levelAttributes.getDexterity(), levelAttributes.getIntelligence());
        for (Item item : equipmentItem.values()) {
            if (item instanceof Armor) {
                Armor armor = (Armor) item;
                int armorAttributes = armor.getArmorAttributes();
                totalAttributes.add(new HeroAttribute(armorAttributes, armorAttributes, armorAttributes));
            }
        }
        return totalAttributes;
    }

    public void displayHero() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello name : ");
        stringBuilder.append(name);
        stringBuilder.append("\n");
        stringBuilder.append("Level :");
        stringBuilder.append(level);
        stringBuilder.append("\n");
        stringBuilder.append("Total strength :");
        stringBuilder.append(getTotalAttributes().getStrength());
        stringBuilder.append("\n");
        stringBuilder.append("Total dexterity :");
        stringBuilder.append(getTotalAttributes().getDexterity());
        stringBuilder.append("\n");
        stringBuilder.append("Total intelligence :");
        stringBuilder.append(getTotalAttributes().getIntelligence());
        stringBuilder.append("\n");
        stringBuilder.append("Damage :");
        stringBuilder.append(calculateDamage());
        System.out.println(stringBuilder.toString());

    }



}
