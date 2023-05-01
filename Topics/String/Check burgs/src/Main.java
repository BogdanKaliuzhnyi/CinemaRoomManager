import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        String burg = "burg";
        String [] longName = new String[2];
        if (city.contains(" ")) {
            longName = city.split(" ");
            System.out.println(longName[1].contains(burg));
        } else {
            System.out.println(city.contains(burg));
        }
    }
}