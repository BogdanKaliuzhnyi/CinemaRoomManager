import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k;
        int[][] room = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                room[i][j] = sc.nextInt();
            }
        }

        k = sc.nextInt();
        System.out.println(getFreeInRow(n, m, k, room));
        }

    private static int getFreeInRow(int n, int m, int k, int[][] room) {
        int temp;
        int freeInRow = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < m; j++) {
                temp = room[i][j - 1];
                if (freeInRow == k && room[i][j] == 0) {
                    return i + 1;
                } else if (room[i][j] == 0 && room[i][j] == temp) {
                    freeInRow++;
                    if (k == freeInRow) {
                        return i + 1;
                    }
                }
                else {
                    freeInRow = 1;
                }
            }
            freeInRow = 1;
        }
        return 0;
    }
}

