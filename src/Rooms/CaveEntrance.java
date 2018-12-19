package Rooms;

import Game.Runner;
import People.Person;

import java.util.Scanner;

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
        System.out.println("You should do something about the darkness.");

    }

    // Allows person to leave room
    public void leaveRoom(Person x)
    {
        occupant = null;
    }

    /**
     * Prints out the room as brackets, and a bracket with "x" in the middle if person is in it
     * @return rooms as brackets
     */
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
