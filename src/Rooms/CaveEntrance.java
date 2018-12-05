package Rooms;

import Game.Runner;
import People.Person;

public class CaveEntrance extends Room
{
    public CaveEntrance(int q, int w) {
        super(q, w);
    }


    public void enterRoom(Person x) {

        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("You entered the cave entrance. It is very dark inside and you can't see very well.");
        System.out.println("You decide to take 5 seconds to think about your next action.");
        try
        {
            Thread.sleep(5000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
        System.out.println("So? What will you do?");
    }
    public void leaveRoom(Person x)
    {
        occupant = null;
    }
}