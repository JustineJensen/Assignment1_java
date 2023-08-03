package org.example.Hero;

public class Archer extends Hero {
    private int level;
    public Archer(String name) {
        super(name);
        this.levelAttributes = new HeroAttribute(1,7,1);
    }
    @Override
    public void levelUpAttributes() {
        levelAttributes.increaselevelUp(1);
        levelAttributes.increaselevelUp(5);
        levelAttributes.increaselevelUp(1);
    }


    @Override
    public void levelUp() {
        level ++;

    }
    @Override
    public int calculateDamage() {

        return 0;
    }
}
