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

    @Override
    protected void levelUpAttributes() {
        levelAttributes.add(new HeroAttribute(1,4,1));
    }

}



