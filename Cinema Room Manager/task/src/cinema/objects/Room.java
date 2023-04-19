package cinema.objects;

public class Room {
    int rows;
    int columns;
    char[][] seats;

    public Room(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        seats = new char[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                seats[i][j] = 'S';
            }
        }

    }

    public void reserve(int row, int column) {
        seats[row][column] = 'X';
    }

    public String toString() {
        String s = "  ";
        for (int j = 0; j < columns; j++){
            s += j + 1 + " ";
        }
        s += "\n";
        for (int i = 0; i < rows; i++) {
            s += i + 1 + " ";
            for (int j = 0; j < columns; j++) {
                s += seats[i][j] + " ";
            }
            s += "\n";
        }
        return s;
    }
}
