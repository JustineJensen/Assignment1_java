package org.example.Hero;
import org.example.Equipments.Item;

import java.util.HashMap;
import java.util.Map;

public  class HeroAttribute {
    private int strength;
    private int dexterity;
    private int intelligence;
    private Map<String,Item> equippedItems = new HashMap();

    public HeroAttribute( int strength, int dexterity, int intelligence) {
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }
    public void add(HeroAttribute other) {
        this.strength += other.strength;
        this.dexterity += other.dexterity;
        this.intelligence += other.intelligence;
    }

    /**
     *
     * @param a
     * @param b
     * @return sum of instances by specified amount
     */
    public HeroAttribute addInstances(HeroAttribute a, HeroAttribute b){
        int sumStrength = a.strength + b.strength;
        int sumIntelligence = a.intelligence + b.intelligence;
        int sumDexterity = a.dexterity + b.dexterity;
        return  new HeroAttribute(sumStrength,sumDexterity,sumIntelligence);
    }
    public void increaseLevelUp(int rate) {
        this.strength += rate;
        this.dexterity += rate;
        this.intelligence += rate;
    }
    public void equippedItems( Item item){
        equippedItems.put(item.getName(),item);
    }
    public void removeItems(String slot){
        equippedItems.remove(slot);
    }
    // get quippedItems

    public Map<String, Item> getEquippedItems() {
        return equippedItems;
    }
    /*@Override
    public String toString() {
        return "HeroAttribute" + ", strength=" + strength +
                ", dexterity=" + dexterity +
                ", intelligence=" + intelligence ;
    }
*/



}
