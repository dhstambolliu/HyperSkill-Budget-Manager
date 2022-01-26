import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();
        int numberH = scanner.nextInt();

        if (numberH < numberA) {
            System.out.println("Deficiency");
        } else if (numberH > numberB) {
            System.out.println("Excess");
        } else if (numberB >= numberA) {
            System.out.println("Normal");
        }

    }
}