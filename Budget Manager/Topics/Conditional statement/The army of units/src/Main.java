import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int units = scanner.nextInt();
        
        final int a = 1;
        final int b = 19;
        final int c = 20;
        final int d = 249;
        final int e = 250;
        final int f = 999;
        final int g = 1_000;
        
        String classification = "";
        if (units < a) {
            classification = "no army";
        } else if (units >= a && units <= b) {
            classification = "pack";
        } else if (units >= c && units <= d) {
            classification = "throng";
        } else if (units >= e && units <= f) {
            classification = "zounds";
        } else if (units >= g) {
            classification = "legion";
        }
        System.out.print(classification);
    }
}
