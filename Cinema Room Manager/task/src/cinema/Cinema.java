package cinema;
import java.util.Scanner;
import cinema.objects.CalculatingRoomSeatSize;
import cinema.objects.Room;

public class Cinema {

    public static void main(String[] args) {
        int rows;
        int columns;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        rows = sc.nextInt();
        System.out.println("Enter the number of seats in each row:");
        columns = sc.nextInt();

        CalculatingRoomSeatSize calculator = new CalculatingRoomSeatSize(rows, columns);
        int totalIncome = calculator.runCalculation(rows, columns);
        System.out.println("Total income:\n" + "$" + totalIncome);

        /*Room room = new Room(7, 8);
        System.out.println("Cinema:");
        System.out.println(room);

        room.reserve(4,5);
        room.reserve(2,7);
        System.out.println(room);*/
    }
}