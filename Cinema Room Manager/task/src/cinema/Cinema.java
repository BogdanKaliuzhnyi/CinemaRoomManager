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

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        roomRows = sc.nextInt();
        System.out.println("Enter the number of seats in each row:");
        roomColumns = sc.nextInt();

        Room room = new Room(roomRows, roomColumns);
        //System.out.println("Cinema:");
        System.out.println(room);

        //room.reserve(4,5); test reserving seats
        //System.out.println(room);

        //CalculatingRoomSeatSize calculator = new CalculatingRoomSeatSize(rows, columns);
        //int totalIncome = calculator.runCalculation(rows, columns);
        //System.out.println("Total income:\n" + "$" + totalIncome);

        System.out.println("Enter a row number:");
        rowsReserve = sc.nextInt();
        System.out.println("Enter a seat number in that row:");
        columnReserve = sc.nextInt();

        CalculatingRoomSeatSize reservingSeat = new CalculatingRoomSeatSize(roomRows, roomColumns);
        System.out.print("\nTicket price: $");
        System.out.println(reservingSeat.runSeatPriceCalculation(rowsReserve) + "\n");

        room.reserve(rowsReserve, columnReserve);
        System.out.println(room);

    }
}