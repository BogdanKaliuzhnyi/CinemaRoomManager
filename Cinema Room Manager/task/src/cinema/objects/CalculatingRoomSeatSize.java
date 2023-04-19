package cinema.objects;

public class CalculatingRoomSeatSize {
    int rows;
    int columns;

    public CalculatingRoomSeatSize(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
    }

    public int runCalculation(int rows, int columns) {
        int fullPrice = 10;
        int discountPrice = 8;
        int totalIncome = 0;
        int amountOfSeats = rows * columns;
        int bigRoom = 60;
        if (amountOfSeats > bigRoom) {
            totalIncome = columns * (rows / 2) * fullPrice + (rows - rows / 2) * columns
                    * discountPrice;
        } else {
            totalIncome = amountOfSeats * fullPrice;
        }
        return totalIncome;
    }
}

