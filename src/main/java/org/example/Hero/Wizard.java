package org.example.Hero;

public class Wizard extends Hero {
    private int level;
    public Wizard(String name) {
        super(name);
        this.levelAttributes = new HeroAttribute(1,1,8);
    }

    @Override
    protected void levelUpAttributes() {
        levelAttributes.increaselevelUp(1);
        levelAttributes.increaselevelUp(1);
        levelAttributes.increaselevelUp(5);

    }
    @Override
    public int calculateDamage() {
        return 0;
    }

}
