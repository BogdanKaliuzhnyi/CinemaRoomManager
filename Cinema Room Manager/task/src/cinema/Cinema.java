package cinema;

import cinema.objects.Room;

public class Cinema {

    public static void main(String[] args) {

        Room room = new Room(7, 8);
        System.out.println("Cinema:");
        System.out.println(room);

        room.reserve(4,5);
        room.reserve(2,7);
        System.out.println(room);
    }
}