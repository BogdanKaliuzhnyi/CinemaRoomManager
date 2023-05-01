package cinema;
import java.util.Scanner;
import cinema.objects.CalculatingRoomSeatSize;
import cinema.objects.Room;

public class Cinema {

    public static void main(String[] args) {
        int roomRows;
        int roomColumns;
        int rowsReserve;
        int columnReserve;
        int menu = -1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        roomRows = sc.nextInt();
        System.out.println("Enter the number of seats in each row:");
        roomColumns = sc.nextInt();

        Room room = new Room(roomRows, roomColumns);

        while (menu != 0) {
            showMenu();
            menu = sc.nextInt();
            switch (menu) {
                case 1: // Showing the seats;
                    System.out.println(room.toString());
                    break;
                case 2:
                    System.out.println("Enter a row number:");
                    rowsReserve = sc.nextInt();
                    System.out.println("Enter a seat number in that row:");
                    columnReserve = sc.nextInt();

                    CalculatingRoomSeatSize reservingSeat = new CalculatingRoomSeatSize(roomRows, roomColumns);
                    System.out.print("\nTicket price: $");
                    System.out.println(reservingSeat.runSeatPriceCalculation(rowsReserve) + "\n");
                    room.reserve(rowsReserve, columnReserve);
                    break;
                default:
                    System.out.println("Wrong input! Please, try again.");
            }
        }
    }

    public static void showMenu () {
        System.out.println("\n1. Show the seats \n2. Buy a ticket \n0. Exit");
    }
}