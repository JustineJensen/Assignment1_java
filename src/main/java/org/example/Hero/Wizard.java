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

    /**
     * This method increases the hero's attributes by adding
     * a fixed amount of points to their strength, dexterity, and intelligence.
     */
    @Override
    protected void levelUpAttributes() {
        levelAttributes.add(new HeroAttribute(1,1,5));
    }
}
