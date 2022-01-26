import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        System.out.println(x1 == x2 || y1 == y2 || Math.abs(x1 - x2) == Math.abs(y1 - y2) ? "YES" : "NO");
    }
}
