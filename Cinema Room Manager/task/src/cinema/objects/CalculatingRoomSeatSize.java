package cinema.objects;

public class CalculatingRoomSeatSize {
    int roomRows;
    int roomColumns;
    int fullPrice = 10;
    int discountPrice = 8;
    int bigRoom = 60;
    boolean isBigRoom = false;

    public CalculatingRoomSeatSize(int rows, int columns) {
        this.roomRows = rows;
        this.roomColumns = rows;
    }

    public int runRoomCalculation(int rows, int columns) {

        int totalIncome = 0;
        int amountOfSeats = rows * columns;
        if (amountOfSeats > bigRoom) {
            totalIncome = columns * (rows / 2) * fullPrice + (rows - rows / 2) * columns
                    * discountPrice;
        } else {
            totalIncome = amountOfSeats * fullPrice;
        }
        return totalIncome;
    }

    public int runSeatPriceCalculation(/*int roomRows, int roomColumns, */int row) {
        int payment;
        int amountOfSeats = roomRows * roomColumns;
        isBigRoom = bigRoom < amountOfSeats;

        if (isBigRoom) { //9/2 = 4
            payment = roomRows / 2 < row ? discountPrice : fullPrice; // 7-8
            return payment;
        } else {
            return fullPrice;
        }




    }
}

