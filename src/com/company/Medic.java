package com.company;

public class Medic extends Hero{
    @Override
    public void applySuperAbilityType(String superAbilityType) {
        System.out.println("Medic  used her Ability   "+superAbilityType);
    }
}
