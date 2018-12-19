package Rooms;

import Game.Runner;
import Gobbos.SkinnyGoblin;
import People.Person;
import java.util.Scanner;

public class GobNest extends Room
{
    SkinnyGoblin Skinny;

    /**
     * Loc of room
     * @param o width of room
     * @param p length of room
     */
    public GobNest(int o, int p) {
        super(o, p);
        Skinny= new SkinnyGoblin();
    }

    /**
     * fight with goblin in room
     * @param x the Person entering
     */
    public void enterRoom(Person x) {
        String choice= "";
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("You noticed a strong stench. You look around and see that there's goblin droppings around.");
        System.out.println("A malnourished goblin appears! It's looking at you with hungry eyes.");
        System.out.println("Do something quick!");
        Scanner in= new Scanner(System.in);
        choice= in.nextLine();
        if(choice.equals("attack") || choice.equals("use sword") || choice.equals("attack goblin")){
            System.out.println("You slay the goblin!");
            Skinny.attack(x);
            x.removeHealth();
            System.out.println(x.getHp());
            if(x.getHp()<=0) {
                System.out.println("You died.");
                Runner.gameOff();
            }
            else {
                System.out.println("This isn't the goblin you're looking for.");
            }

        }
        else if (choice.equals("run away") || choice.equals("run)") || choice.equals("flee")) {
            System.out.println("You ran away.");
        }

    }

    //Lets person leave room
    public void leaveRoom(Person x)
    {
        occupant = null;
    }

    /**
     * Prints out room with G in the middle
     * @return Bracket with G in the middle
     */
    @Override
    public String toString() {
        String brack = "";
        brack = "[G]";
        if (occupant != null) {
            return "[x}";
        }
        return brack;
    }
}
