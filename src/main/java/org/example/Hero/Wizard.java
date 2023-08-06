package org.example.Hero;

public class Wizard extends Hero {
    private int level;
    public Wizard(String name) {
        super(name);
        this.levelAttributes = new HeroAttribute(1,1,8);
    }
    public String getName(){
        return super.getName();
    }
    public int getLevel(){
        return super.getLevel();
    }
    public void levelUp(){
        this.setLevelUp(getLevel()+1);
    }

    @Override
    protected void levelUpAttributes() {
        levelAttributes.increaseLevelUp(1);
        levelAttributes.increaseLevelUp(1);
        levelAttributes.increaseLevelUp(5);

    }

    /*@Override
    public String toString() {
        return "Wizard{" +
                "level=" + level + "name=" + getName() + "levelAttributes=" + levelAttributes +
                '}';
    }*/
}
