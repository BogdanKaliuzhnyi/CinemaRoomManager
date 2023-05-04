package cinema.objects;

public class Room {
    int roomRows;
    int roomColumns;
    int amountOfSeats;
    final int FULL_PRICE = 10;
    final int DISCOUNT_PRICE = 8;
    final int BIG_ROOM = 60;
    boolean isBigRoom = false;
    int totalIncome;
    int currentIncome = 0;
    int sales = 0;
    char[][] seats;

    public Room(int rows, int columns) {
        this.roomRows = rows;
        this.roomColumns = columns;
        this.amountOfSeats = rows * columns;
        seats = new char[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                seats[i][j] = 'S';
            }
        }
    }

    public boolean reserve(int row, int column) {
        if (row >= 0 && row <= roomRows &&
                column >= 0 && column <= roomColumns) {
            if (seats[row - 1][column - 1] != 'B') {
                seats[row - 1][column - 1] = 'B';
                sales++;
                currentIncome = currentIncome + runSeatPriceCalc(row);
                System.out.print("\nTicket price: $");
                System.out.println(runSeatPriceCalc(row) + "\n");
                return true;
            } else {
                System.out.println("That ticket has already been purchased!\n");
                return false;
            }
        } else {
            System.out.println("Wrong input!\n");
            return false;
        }
    }

    public String toString() {
        String s = "Cinema:\n  ";
        for (int j = 0; j < roomColumns; j++){
            s += j + 1 + " ";
        }
        s += "\n";
        for (int i = 0; i < roomRows; i++) {
            s += i + 1 + " ";
            for (int j = 0; j < roomColumns; j++) {
                s += seats[i][j] + " ";
            }
            s += "\n";
        }
        return s;
    }

    public int runTotalIncome() {

        if (amountOfSeats > BIG_ROOM) {
            totalIncome = roomColumns * (roomRows / 2) * FULL_PRICE + (roomRows - roomRows / 2)
                    * roomColumns * DISCOUNT_PRICE;
        } else {
            totalIncome = amountOfSeats * FULL_PRICE;
        }
        return totalIncome;
    }

    public int runSeatPriceCalc(int chosenRow) {
        int payment;
        isBigRoom = BIG_ROOM < amountOfSeats;

        if (isBigRoom) {
            payment = roomRows / 2 < chosenRow ? DISCOUNT_PRICE : FULL_PRICE; // 7-8
            return payment;
        } else {
            return FULL_PRICE;
        }
    }


    public void showStatistic() {
        float salesInPerc = 1.0F * sales / amountOfSeats * 100;
        System.out.println("Number of purchased tickets: " + sales);
        System.out.printf("Percentage: %.2f%c%n", salesInPerc, '%');
        System.out.println("Current income: $" + currentIncome);
        System.out.println("Total income: $" + totalIncome);
    }
}
