import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        int numberN = scanner.nextInt();
        int numberM = scanner.nextInt();
        int numberK = scanner.nextInt();

        if (numberK > numberM * numberN) {
            System.out.println("NO");
        } else if (numberK % numberM == 0 || numberK % numberN == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}