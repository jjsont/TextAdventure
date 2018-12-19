package Rooms;

import People.Person;
import Items.Food;

import java.util.Scanner;

public class Room {
    Person occupant;
    int xLoc,yLoc;


    public Room(int x, int y)
    {
        xLoc = x;
        yLoc = y;
    }

    /**
     * Method controls the results when a person enters this room.
     * @param x the Person entering
     */
    public void enterRoom(Person x)
    {
        Scanner in = new Scanner(System.in);
        String option="";
        System.out.println("You enter a plain old room");
        System.out.println("Current hp is: " + x.getHp());
        System.out.println("If you want to move onto another room, simply type N S E W.");
        System.out.println("If you want to heal up, eat your food");
        option=in.nextLine();
        if(option.equals("eat food") || option.equals("use food") || option.equals("consume food")) {
            System.out.println(x.getHp()+ 20);
        }
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
    }

    /**
     * Removes the player from the room.
     * @param x
     */
    public void leaveRoom(Person x)
    {
        occupant = null;
    }

    //Prints out each room as [ ]. If person is in the room, it prints out [ x ]
    public String toString() {
        String brack = "";
        brack = brack + "[ ]";
        if (occupant != null) {
            return "[x}";
        }
        return brack;
    }

}