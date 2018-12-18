package People;

import Gobbos.SkinnyGoblin;

import java.util.HashMap;
import java.util.List;

/**
 * Person represents the player as they move through the game.
 */
public class Person {
    String firstName;
    String familyName;
    int xLoc, yLoc;
    /**
     * Constructs hp and attack
     */
    private int hp;
    private int attack;
    private List<String> food;
    private List<String> Sword;
    private List<String> torch;

    /**
     * Sets user hp
     */
    public Person() {
        this.hp = 100;
        this.attack=20;
    }

    /**
     * Initializes the hp
     *
     * @param hp Health points for user
     */
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

    public Person(String firstName, String familyName, int xLoc, int yLoc) {
        this.firstName = firstName;
        this.familyName = familyName;
        this.xLoc = xLoc;
        this.yLoc = yLoc;
    }


    public Person(int hp) {
        this.hp = hp;
    }



    public void removeHealth(int attack) {
        this.hp -= attack;
    }

    public void foodHeal(int i) {
        this.hp += 20;
    }

    public void removeFood(String name) {
        this.food.remove(name);
    }

    public void addFood(String name) {
        food.add(name);
    }

    public void removeTorch(String name) {
        this.torch.remove(name);
    }

    public void attack() {
    }

    public void attack(int attack) {

    }
}
