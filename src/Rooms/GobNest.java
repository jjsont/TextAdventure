package Rooms;

import People.Person;

public class GobNest extends Room
{

    public GobNest(int x1, int x2) {
        super(x1, x2);
    }


    public void enterRoom(Person x) {

        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("You noticed a strong stench. You look around and see that there's goblin droppings around.");
        System.out.println("Hm...check for goblins?");

    }


    public void leaveRoom(Person x)
    {
        occupant = null;
    }

    @Override
    public String toString() {
        String brack = "";
        brack = brack + "[ ]";
        if (occupant != null) {
            return "[x}";
        }
        return brack;
    }
}
