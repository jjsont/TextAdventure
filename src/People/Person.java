package People;

/**
 * Person represents the player as they move through the game.
 */
public class Person {
    String firstName;
    String familyName;
    int xLoc, yLoc;
    /**
     * Constructs hp
     */
    private int hp;

    /**
     * Sets user hp to 8
     */
    public Person() {
        this.hp = 8;
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

    /**
     * Each time user gets hit, deduct 1 hp
     *
     * @return Health - 1
     */
    public int getDmg() {
        this.hp -= 1;
        return hp;
    }

    /**
     * Each time user eats food, add 1 hp
     *
     * @return Health + 1
     */
    public int foodHeal() {
        this.hp += 1;
        return hp;
    }
}






}
