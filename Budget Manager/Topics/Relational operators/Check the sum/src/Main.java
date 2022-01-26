import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        final int twenty = 20;
        boolean checkIfTrueOrFalse = a + b == twenty || a + c == twenty || b + c == twenty;
        System.out.println(checkIfTrueOrFalse);
    }
}
