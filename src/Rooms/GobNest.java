package Rooms;

import Gobbos.SkinnyGoblin;
import People.Person;
import java.util.Scanner;

public class GobNest extends Room
{
    SkinnyGoblin Skinny;

    public GobNest(int o, int p) {
        super(o, p);
        Skinny= new SkinnyGoblin();
    }


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
            System.out.println("This isn't the goblin you're looking for.");

        }


    }


    public void leaveRoom(Person x)
    {
        occupant = null;
    }

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
