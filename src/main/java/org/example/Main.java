package org.example;

import org.example.Hero.*;

public class Main {
    public static void main(String[] args) {
        // creates object of type  hero

        Hero archer = new Archer("Archer");
        archer.displayHero();
        System.out.println();
        archer.levelUp();
        System.out.println(archer);
        archer.getTotalAttributes();
        System.out.println(archer);




        /*Hero swashbuckler = new SwashBuckler("swashbuckler");
        swashbuckler.displayHero();
        System.out.println();
        swashbuckler.levelUp();
        System.out.println(swashbuckler);


        Hero barbarian = new Barbarian("Barbarian");
        barbarian.displayHero();
        System.out.println();
        barbarian.levelUp();
        System.out.println(barbarian);

        Hero wizard = new Wizard("Wizard");
        wizard.displayHero();
        System.out.println();
        wizard.levelUp();
        System.out.println(wizard);*/

        //adding two instances

        HeroAttribute ach = new HeroAttribute(1,1,8);
        HeroAttribute wizard = new HeroAttribute(5,7,12);

        HeroAttribute result = ach.addInstances(ach,wizard);
        System.out.println(result);
        System.out.println("Strength:" + result.getStrength());
        System.out.println("Dexternity:" + result.getDexterity());
        System.out.println("Intelligence:" + result.getIntelligence());












    }
}
