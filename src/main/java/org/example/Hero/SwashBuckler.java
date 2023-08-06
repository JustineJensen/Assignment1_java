package org.example.Hero;

public class SwashBuckler extends Hero {
    private int level;

    public SwashBuckler(String name) {
        super(name);
        this.levelAttributes = new HeroAttribute(2, 6, 1);
    }

    public String getName() {
        return super.getName();
    }

    public int getLevel() {
        return super.getLevel();
    }

    public void levelUp() {
        this.setLevelUp(getLevel() + 1);
    }

    @Override
    protected void levelUpAttributes() {
        levelAttributes.increaseLevelUp(1);
        levelAttributes.increaseLevelUp(4);
        levelAttributes.increaseLevelUp(1);
    }


}


   /* @Override
    public String toString() {
        return "SwashBuckler{" +
                "level=" + level + "name=" + getName() + "levelAttributes=" + levelAttributes +
                '}';
    }*/


