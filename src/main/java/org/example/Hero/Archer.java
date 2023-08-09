package org.example.Hero;

public class Archer extends Hero {
    private int level;
    public Archer(String name) {
        super(name);
        this.levelAttributes = new HeroAttribute(1,7,1);
    }

    /**
     * This method increases the hero's attributes by adding
     * a fixed amount of points to their strength, dexterity, and intelligence.
     */
    @Override
    public void levelUpAttributes() {
        levelAttributes.add(new HeroAttribute(1,5,1));
    }
    public String getName(){
        return super.getName();
    }
    public int getLevel(){
        return super.getLevel();
    }
    @Override
    public String toString() {
        return "Archer{" +
                "level=" + level + "name=" + getName() + "levelAttributes=" + levelAttributes +
                '}';
    }
}
