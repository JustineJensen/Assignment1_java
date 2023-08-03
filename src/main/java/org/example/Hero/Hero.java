package org.example.Hero;

import java.util.ArrayList;
import java.util.List;

public abstract class Hero {
    private String name;
    protected HeroAttribute levelAttributes;
    private int level =1;
    private List<String> validWeaponType;
    private List<String> validArmorType;
    private  List<String>equipment;

    public Hero(String name) {
        this.name = name;
        this.levelAttributes = new HeroAttribute(1,1,8);
        this.validWeaponType =new ArrayList<>();
        this.validArmorType = new ArrayList<>();
        this.equipment = new ArrayList<>();
        levelUpAttributes();
       /* for(Slot.slot:slot.value(){
            equipment.put(slot,value:null);
        }*/
    }
    public void equipArmor(String armor){
        System.out.println(validArmorType.contains(armor)? equipment.add(armor):"Invalid armor");
    }
    public void equipWeapon(String weapon){
        System.out.println(validWeaponType.contains(weapon)?
                equipment.add(weapon):"Invalid weapon");
    }
    public HeroAttribute getLevelAttributes() {
        return levelAttributes;
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

    protected abstract void levelUpAttributes();

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void levelUp(){
        level ++;
    }
    public abstract  int calculateDamage();


    public void displayHero(){
        System.out.println("Hero name:" +" " + name + "\n" +
                "Leve: " + level + "\n"+ "Total strength:"
                + getLevelAttributes().getStrength() + "\n"  +"Total dexterity:" + getLevelAttributes().getDexterity() + "\n"  +"Damage"
                + "\n" + "Total intelligence:" + getLevelAttributes().getIntelligence());
    }

}
