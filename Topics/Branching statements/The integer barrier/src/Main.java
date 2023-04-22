import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int summ = 0;
        int nextNumber = 1;
        while (true) {
            nextNumber = scanner.nextInt();
            summ += nextNumber;
            if (nextNumber == 0) {
                System.out.println(summ);
                break;
            } else if (summ >= 1000) {
                System.out.println(summ - 1000);
                break;
            } //else {
  //              summ += nextNumber;
  //          }
        }
        
    }
}
