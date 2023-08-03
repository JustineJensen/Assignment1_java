package org.example.Hero;

public class SwashBuckler extends Hero {
    private  int level;
    public SwashBuckler(String name) {
        super(name);
        this.levelAttributes = new HeroAttribute(2,6,1);
    }

    @Override
    protected void levelUpAttributes() {
        levelAttributes.increaselevelUp(1);
        levelAttributes.increaselevelUp(4);
        levelAttributes.increaselevelUp(1);
    }

    @Override
    public int calculateDamage() {
        return 0;
    }


}
