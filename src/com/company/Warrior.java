package com.company;

public class Warrior extends Hero{

    @Override
    public void applySuperAbilityType(String superAbilityType) {
        System.out.println("Warrior used his Ability   "+superAbilityType);
    }
}
