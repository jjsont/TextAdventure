package People;

import Gobbos.SkinnyGoblin;

import java.util.HashMap;
import java.util.List;

public class Person {
    String firstName;
    String familyName;
    int xLoc, yLoc;

    /**
     * Constructs hp, attack, and allows usage of food, sword, and torch
     */
    private int hp;
    private int attack;
    private List<String> food;
    private List<String> Sword;
    private List<String> torch;

    //Setters and Getters involving the person's hp, attack, and location
    private void setHp(int hp) {
        this.hp = hp;
    }

    public int getHp() {
        return this.hp;
    }

    public int getAttack() {
        return this.attack;
    }

    public int getxLoc() {
        return xLoc;
    }

    public void setxLoc(int xLoc) {
        this.xLoc = xLoc;
    }

    public int getyLoc() {
        return yLoc;
    }

    public void setyLoc(int yLoc) {
        this.yLoc = yLoc;
    }

    public Person(int hp) {
        this.hp = hp;
    }

    //Heal for i each time food is consumed
    public void foodHeal(int i) {
        this.hp += i;
    }

    public void removeFood(String name) {
        this.food.remove(name);
    }

    public void removeTorch(String name) {
        this.torch.remove(name);
    }

    /**
     * When person gets attacked, minus however amount of damage from health
     */
    public void removeHealth() {
        this.hp -=attack;
    }

    /**
     * Creates the person
     * @param firstName First name of person
     * @param familyName Last name of person
     * @param xLoc location of person in terms of width
     * @param yLoc location of person in terms of length
     */
    public Person(String firstName, String familyName, int xLoc, int yLoc) {
        this.firstName = firstName;
        this.familyName = familyName;
        this.xLoc = xLoc;
        this.yLoc = yLoc;
        this.hp=100;
        this.attack=20;
    }




    }

