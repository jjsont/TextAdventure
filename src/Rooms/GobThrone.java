package Rooms;

import Game.Runner;
import Gobbos.GoblinKing;
import People.Person;
import java.util.Scanner;

public class GobThrone extends Room
{
    GoblinKing King;

    public GobThrone(int k, int l) {
        super(k, l);
        King= new GoblinKing();
    }


    public void enterRoom(Person x) {
        String choice= "";
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("You noticed a strong stench. It's the Goblin King!");
        System.out.println("This is it!");
        System.out.println("Do something quick!");
        Scanner in= new Scanner(System.in);
        choice= in.nextLine();
        if(choice.equals("attack") || choice.equals("use sword") || choice.equals("attack goblin")){
            System.out.println("You attack the Goblin King and have a fercious fight with it.");
            King.attack(x);
            x.removeHealth();
            if(x.getHp()<=0) {
                System.out.println("You died.");
                Runner.gameOff();
            }
            System.out.println("The king fell. ");
            Runner.gameOff();

        }
        else if (choice.equals("run away") || choice.equals("run)") || choice.equals("flee")){
            System.out.println("You ran away.");


    }}


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