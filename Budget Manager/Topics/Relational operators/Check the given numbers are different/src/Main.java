import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();

        boolean result = firstNumber != secondNumber && firstNumber != thirdNumber && secondNumber != thirdNumber;
        System.out.println(result);
    }
}