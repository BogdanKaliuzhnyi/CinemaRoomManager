import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long firstNumber = scanner.nextLong();
        String operator = scanner.next();
        long secondNumber = scanner.nextLong();

        switch (operator) {
            case "+":
                System.out.println(firstNumber + secondNumber);
                break;
            case "-":
                System.out.println(firstNumber - secondNumber);
                break;
            case "/":
                if (secondNumber != 0) {
                    System.out.println(firstNumber / secondNumber);
                } else {
                    System.out.println("Division by 0!");
                }
                break;
            case "*":
                System.out.println(firstNumber * secondNumber);
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }
    }
}
