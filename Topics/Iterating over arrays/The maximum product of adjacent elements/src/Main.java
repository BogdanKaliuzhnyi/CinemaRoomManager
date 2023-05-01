import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[sc.nextInt()];
        int max = 0;
        int current;

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        for (int i = array.length - 1; i > 0; i--) {
            current = array[i] * array[i - 1];
            if (max < current) {
                max = current;
            }
        }

        System.out.println(max);
    }
}
