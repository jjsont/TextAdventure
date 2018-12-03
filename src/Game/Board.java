package Game;

import Rooms.Room;


public class Board {
    private Room[][] map;
    private int length;
    private int width;


    public Board(int length, int width, Room[][] map) {
        this.length = length;
        this.width = width;
        this.map = map;
    }



}

