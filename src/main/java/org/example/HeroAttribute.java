package org.example;

public  class HeroAttribute {
    private  int levelAttributes;
    private int strength;
    private int dexterity;
    private int intelligence;

    public HeroAttribute( int strength, int dexterity, int intelligence) {
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
    }
    protected  int totalAttributes( int strength, int dexterity, int intelligence){
        int sum = strength + dexterity + intelligence;
        return  sum;
    }
    public int getLevelAttributes()
    {
        return  levelAttributes;
    }
    public  void setLevelAttributes(int levelAttributes){
        this.levelAttributes = levelAttributes;
    }

    @Override
    public String toString() {
        return "Attribute" + ", strength=" + strength +
                ", dexterity=" + dexterity +
                ", intelligence=" + intelligence ;
    }
}
