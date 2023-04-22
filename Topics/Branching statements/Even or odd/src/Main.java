import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 1;
        while (true) {
            input = scanner.nextInt();
            if (input != 0) {
                System.out.println(input % 2 == 0 ? "even" : "odd");
            } else {
                break;
            }
        }
    }
}