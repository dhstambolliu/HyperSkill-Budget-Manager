import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int input = scanner.nextInt();

        final int maxValue = 10;
        final int minValue = 0;
        final boolean interval = input > minValue && input < maxValue;

        System.out.println(interval);

    }
}
