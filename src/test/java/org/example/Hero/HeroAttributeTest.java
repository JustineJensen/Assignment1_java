package org.example.Hero;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HeroAttributeTest {
    @Test
    void testingHeroAttributes_ShouldReturnCorrectAttributes()  {
        HeroAttribute heroA = new HeroAttribute(5, 3, 2);
       // HeroAttribute heroB = new HeroAttribute(2, 1, 4);
        heroA.add(heroA);
        assertEquals(7, heroA.getStrength());
        assertEquals(4, heroA.getDexterity());
        assertEquals(6, heroA.getIntelligence());


    }
}
