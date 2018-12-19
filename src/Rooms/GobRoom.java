package Rooms;

import Game.Runner;
import Gobbos.BamboozledGoblin;
import People.Person;
import java.util.Scanner;

public class GobRoom extends Room
{
    BamboozledGoblin Bamboozled;

    public GobRoom(int t, int y) {
        super(t, y);
        Bamboozled= new BamboozledGoblin();
    }

    /**
     * Fight with goblin in room
     * @param x the Person entering
     */
    public void enterRoom(Person x) {
        String choice= "";
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("You noticed a strong stench.");
        System.out.println("A bamboozled goblin appears! It's angry at something and wants to direct its anger towards you.");
        System.out.println("Do something quick!");
        Scanner in= new Scanner(System.in);
        choice= in.nextLine();
        if(choice.equals("attack") || choice.equals("use sword") || choice.equals("attack goblin")){
            System.out.println("You slay the goblin!");
            Bamboozled.attack(x);
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
        else if (choice.equals("run away") || choice.equals("run)") || choice.equals("flee")){
            System.out.println("You ran away.");
        }


    }


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