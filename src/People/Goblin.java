package People;

/**
 * Person represents the player as they move through the game.
 */
public class Goblin {
    String firstName;
    String familyName;
    int xLoc, yLoc;
    /**
     * Constructs hp
     */
    private int hp;

    /**
     * Sets goblin hp to 1
     */
    public Goblin() {
        this.hp = 1;
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

    public Goblin(String firstName, String familyName, int xLoc, int yLoc) {
        this.firstName = firstName;
        this.familyName = familyName;
        this.xLoc = xLoc;
        this.yLoc = yLoc;
    }

    public Goblin(int hp) {
        this.hp = hp;
    }

    public int getDmg() {
        this.hp -= 1;
        return hp;
    }
}

