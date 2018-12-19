package Game;

import Rooms.Room;


public class Board {

    //Construct the map with length and width
    private Room[][] map;
    private int length;
    private int width;

    /**
     * Creates map with length and width
     * @param length Length of board
     * @param width Width of board
     * @param map The map that appears
     */
    public Board(int length, int width, Room[][] map) {
        this.length = length;
        this.width = width;
        this.map = map;
    }

    //Creates the map with the length and width
    public Board(int length, int width) {
        this.map = new Room[length][width];
    }


    public Room[][] getBoard() {
        return this.map;
    }

    /**
     * Prints out the map
     */
    public void print() {
        String row= "";
        for(int i=0; i<map.length; i++) {
            for(int j=0; j<map[i].length; j++) {
                row+= map[i][j].toString();
            }
            System.out.println(row);
            row= "";
        }
    }






}
