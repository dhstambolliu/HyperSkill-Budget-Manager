import java.io.PrintStream;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // start coding here
        PrintStream out = new PrintStream(System.out);
        Scanner in = new Scanner(System.in);
        int variable1 = in.nextInt();

        out.printf("%d ", variable1);
        while (variable1 != 1) {
            int variable2 = variable1 % 2;

            if (variable2 == 0) {
                variable1 = (variable1 / 2);
            } else {
                variable1 = (3 * variable1 + 1);
            }
            out.printf("%d ", variable1);
        }
    }
}