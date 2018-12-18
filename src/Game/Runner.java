package Game;

// Jason Tan
import Items.Food;
import Items.Torch;
import People.Person;
import Rooms.CaveEntrance;
import Rooms.GobNest;
import Rooms.Room;

import java.util.Scanner;

public class Runner {


    private static boolean gameOn = true;
    private static boolean tooDark = true;
    private static boolean inNest= false;


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);



        System.out.println("You are a hero on an adventure");
        System.out.println("You received a goblin slaying quest and so, you went to the cave in which they're dwelling.");
        System.out.println("Brave hero, what is your name?");
        String playerName = in.nextLine();
        System.out.println("The history books shall know you as " + playerName + "!");
        System.out.println("Use N S E W to move and explore your surroundings.");
        System.out.println("Your items are: torch, sword, and food. To use them, put a verb before the item. For example: 'use/light torch'");
        System.out.println("You need to kill the Goblin King in order to win.");



        //Items and their numbers of uses
        Torch torch = new Torch ("Torch",1);
        Food food= new Food("Food", 2);



        Room[][] building = new Room[6][6];
        Board map = new Board(6, 6, building);

        //Fill the building with normal rooms
        for (int x = 0; x < building.length; x++) {
            for (int y = 0; y < building[x].length; y++) {
                building[x][y] = new Room(x, y);
            }
        }

        //Create a goblin nest.
        int o = 3;
        int p = 3;
        building[o][p] = new GobNest(o,p);


        //Creates a cave entrance
        int w = 0;
        int q = 0;
        building[w][q] = new CaveEntrance(0, 0);





        //Setup player 1 and the input scanner
        Person player1 = new Person("FirstName", "FamilyName", 0, 0);
        building[0][0].enterRoom(player1);




        // Prevents user from moving until he uses the torch to clear up the darkness
        while(tooDark)
        {
            String i= in.nextLine();
            if(i.equals("use torch")) {
                System.out.println("You lit up your torch and cleared away the darkness");
                tooDark= false;
        }
            else if(i.equals("light torch")) {
                System.out.println("You lit up your torch and cleared away the darkness");
                tooDark= false;
            }
            else if(i.equals("torch")) {
                System.out.println("You lit up your torch and cleared away the darkness");
                tooDark= false;
            }
            else {
                System.out.println("It's too dark. Check your inventory to see if you have anything to use");
                tooDark= true;
            }
        }

        // When game is on, allow movement
        while(gameOn)
        {
            System.out.println("Where would you like to move? (Choose N, S, E, W)");
            String move = in.nextLine();
            if(validMove(move, player1, building))
            {
                System.out.println("Your coordinates: row = " + player1.getxLoc() + " col = " + player1.getyLoc());
                map.print();

            }
            else {
                System.out.println("It appears you can no longer continue on this direction.");
            }


        }
        in.close();
    }



    /**
     * Checks that the movement chosen is within the valid game map.
     * @param move the move chosen
     * @param p person moving
     * @param map the 2D array of rooms
     * @return
     */
    public static boolean validMove(String move, Person p, Room[][] map)
    {
        move = move.toLowerCase().trim();
        switch (move) {
            case "n":
                if (p.getxLoc() > 0)
                {
                    map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
                    map[p.getxLoc()-1][p.getyLoc()].enterRoom(p);
                    return true;
                }
                else
                {
                    return false;
                }
            case "e":
                if (p.getyLoc()< map[p.getyLoc()].length -1)
                {
                    map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
                    map[p.getxLoc()][p.getyLoc() + 1].enterRoom(p);
                    return true;
                }
                else
                {
                    return false;
                }

            case "s":
                if (p.getxLoc() < map.length - 1)
                {
                    map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
                    map[p.getxLoc()+1][p.getyLoc()].enterRoom(p);
                    return true;
                }
                else
                {
                    return false;
                }

            case "w":
                if (p.getyLoc() > 0)
                {
                    map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
                    map[p.getxLoc()][p.getyLoc()-1].enterRoom(p);
                    return true;
                }
                else
                {
                    return false;
                }
            default:
                break;

        }
        return true;
    }
    public static void gameOff()
    {
        gameOn = false;
    }



}