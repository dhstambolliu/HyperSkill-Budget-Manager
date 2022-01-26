import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int learYear = scanner.nextInt();

        final int minumim = 1900;
        final int maximum = 3000;
        final int firstCheck = 4;
        final int secondCheck = 100;
        final int lastCheck = 400;

        if (learYear >= minumim && maximum <= 3000) {
            if ((learYear % firstCheck == 0 && learYear % secondCheck != 0) || learYear % lastCheck == 0) {
                System.out.println("Leap");
            } else {
                System.out.println("Regular");
            }
        }
    }
}