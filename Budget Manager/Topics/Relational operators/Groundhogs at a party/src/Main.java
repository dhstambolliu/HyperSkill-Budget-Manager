import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        // You can use scanner.nextBoolean() to read a boolean value
        int totalReeses = scanner.nextInt();
        boolean weekend = scanner.nextBoolean();

        final int weekendMin = 15;
        final int weekendMax = 25;

        final int regularMin = 10;
        final int regularMax = 20;

        boolean caseOne = weekend && totalReeses >= weekendMin && totalReeses <= weekendMax;
        boolean caseTwo = !weekend && totalReeses >= regularMin && totalReeses <= regularMax;

        System.out.println(caseOne || caseTwo);
    }
}