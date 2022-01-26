import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        final int x = scanner.nextInt();
        final int y = scanner.nextInt();
        final int z = scanner.nextInt();

        final boolean finalResult = x >= y && x <= z || x <= y && x >= z;
        System.out.println(finalResult);
    }
}