package org.example.Hero;
import org.example.Equipments.Item;

import java.util.HashMap;
import java.util.Map;


public  class HeroAttribute {
    private int strength;
    private int dexterity;
    private int intelligence;
    private Map<String,Item> equippedItems = new HashMap();

    /**
     *  This class is used as the datatype for both LevelAttributes
     * @param strength
     * @param dexterity
     * @param intelligence
     */

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
     * This function add two instances
     * @param heroA
     * @param heroB
     * @return sum of instances by specified amount
     */
    public HeroAttribute addInstances(HeroAttribute heroA, HeroAttribute heroB){
        int sumStrength = heroA.strength + heroB.strength;
        int sumIntelligence = heroA.intelligence + heroB.intelligence;
        int sumDexterity = heroA.dexterity + heroB.dexterity;
        return  new HeroAttribute(sumStrength,sumDexterity,sumIntelligence);
    }

    /**
     * This function increases the level of instances
     * @param rate
     */
    public void increaseLevelUp(int rate) {
        this.strength += rate;
        this.dexterity += rate;
        this.intelligence += rate;

    }

    /**
     * Added item to a map
     * @param item
     */
    public void equippedItems( Item item){
        equippedItems.put(item.getName(),item);
    }

    /**
     * removes item from slot
     * @param slot
     */
    public void removeItems(String slot){
        equippedItems.remove(slot);
    }

    /**
     *  Fetches items from map
     * @return items
     */
    public Map<String, Item> getEquippedItems() {
        return equippedItems;
    }

}
