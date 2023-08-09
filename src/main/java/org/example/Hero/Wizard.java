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

    @Override
    protected void levelUpAttributes() {
        levelAttributes.add(new HeroAttribute(1,1,5));
    }
}
