package People;

/**
 * Person represents the player as they move through the game.
 */
public class Person {
    String firstName;
    String familyName;
    int xLoc, yLoc;

    private int hp;
    private static boolean damaged = false;


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

    public Person (String firstName, String familyName, int xLoc, int yLoc)
    {
        this.firstName = firstName;
        this.familyName = familyName;
        this.xLoc = xLoc;
        this.yLoc = yLoc;
    }

    public Person (int hp) {
        this.hp = hp;
    }

    public int getDmg(int dmg) {
        if(damaged = true) {
            return this.hp - 1;
        }

        return this.hp;
    }






}
