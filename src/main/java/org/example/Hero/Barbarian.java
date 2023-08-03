package org.example.Hero;

public class Barbarian extends Hero {
    public Barbarian(String name) {
        super(name);
        this.levelAttributes = new HeroAttribute(5,2,1 );
    }

    @Override
    public void levelUpAttributes() {
        levelAttributes.increaselevelUp(3);
        levelAttributes.increaselevelUp(2);
        levelAttributes.increaselevelUp(1);
    }

    public int calculateDamage(){
        return 0;
    }

    @Override
    public String toString() {
        return "Barbarian{" +
                "level=" + getLevel()+"\t" +  levelAttributes +
                '}';
    }
}
