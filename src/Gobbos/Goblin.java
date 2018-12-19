package Gobbos;

import People.Person;

public abstract class Goblin {
    int hp;
    int attack;


    /**
     * Attacks person
     * @param x Person
     */
    public void attack(Person x) {
        x.removeHealth();
    }


    /**
     * The damage the goblin takes from person
     * @param x
     */
    public void removeHealth(Person x) {
        this.hp -=x.getAttack();
    }


}

