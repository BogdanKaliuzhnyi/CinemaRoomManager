import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] array = new int[n][m];
        int temp;

        for (int a = 0; a < n; a++) {
            for (int b = 0; b < m; b++) {
                array[a][b] = sc.nextInt();
            }
        }
        int i = sc.nextInt();
        int j = sc.nextInt();

        for (int a = 0; a < n; a++) {
            temp = array[a][j];
            array[a][j] = array[a][i];
            array[a][i] = temp;
            for (int b = 0; b < m; b++) {
                System.out.print(array[a][b] + " ");
            }
            System.out.print("\n");
        }
    }
}