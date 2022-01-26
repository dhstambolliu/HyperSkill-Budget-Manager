import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] array = new int[len];
        int sum = 0;
        for (int i = 0; i < len; ++i) {
            array[i] = scanner.nextInt();
        }
        for (int v : array) {
            sum += v;
        }
        System.out.print(sum);
    }
}