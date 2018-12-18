package Gobbos;

import People.Person;

public abstract class Goblin {
    int hp;
    int attack;



    public void attack(Person x) {
        x.attack(attack);
    }



    public void removeHealth(Person x) {
        this.hp -=x.getAttack();
    }
}

