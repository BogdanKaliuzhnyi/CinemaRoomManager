import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int shape = scanner.nextInt();
        String figure = "You have chosen a ";
        switch (shape) {
            case 1:
                System.out.println(figure + "square");
                break;
            case 2:
                System.out.println(figure + "circle");
                break;
            case 3:
                System.out.println(figure + "triangle");
                break;
            case 4:
                System.out.println(figure + "rhombus");
                break;
            default:
                System.out.println("There is no such shape!");
                break;
        }
    }
}