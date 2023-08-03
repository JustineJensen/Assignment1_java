package org.example;

import org.example.Equipmements.*;
import org.example.Hero.*;

public class Main {
    public static void main(String[] args) {
        // creates object of type  hero
        Hero wizard = new Wizard("Wizard");
        Hero archer = new Archer("Wizard");
        Hero swashbuckler = new SwashBuckler("Jack");
        Hero barbarian = new Barbarian("Conan");

        wizard.displayHero();
        System.out.println();
        wizard.levelUp();
        System.out.println(wizard);

        HeroAttribute wiz = new HeroAttribute(1,1,8);
        System.out.println(wiz);










    }
}
