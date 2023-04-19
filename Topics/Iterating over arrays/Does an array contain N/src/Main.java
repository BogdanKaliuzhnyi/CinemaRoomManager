import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[sc.nextInt()];
        int number;
        boolean isContains = false;

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        number = sc.nextInt();

        for (var i : array) {
            if (i == number) {
                isContains = true;
                break;
            }
        }
        System.out.println(isContains);
    }
}