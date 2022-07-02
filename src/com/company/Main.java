package com.company;

public class Main {


    public static void main(String[] args) {
        // write your code here
        Medic medic = new Medic();
        Magic magic = new Magic();
        Warrior warrior = new Warrior();
        Hero hero[] = {magic, medic, warrior};
        for (int i = 0; i < hero.length; i++) {
            if (hero[i] instanceof Warrior) {
                warrior.applySuperAbilityType("SMTH THAT VERY STRONG");
            }
            if (hero[i] instanceof Magic) {
                magic.applySuperAbilityType("SMTH THAT VERY MAGICALY");
            }
            if (hero[i] instanceof Medic) {
                medic.applySuperAbilityType("SMTH THAT VERY HEALTHY FOR OTHERS,but not for herself ");

            }
        }
    }
}
