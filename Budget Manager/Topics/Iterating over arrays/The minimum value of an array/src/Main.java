import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, max, min;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        max = a[0];

        for (int i = 0; i < n; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        min = max;
        for (int i = 0; i < n; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        System.out.println(min);
    }


}