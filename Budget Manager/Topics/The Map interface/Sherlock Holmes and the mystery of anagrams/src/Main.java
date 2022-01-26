import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String firstString = scanner.nextLine().replaceAll("\\s", "");
        String secondString = scanner.nextLine().replaceAll("\\s", "");
        boolean status = true;
        if (firstString.length() != secondString.length()) {
            status = false;
        } else {
            char[] ArrayS1 = firstString.toLowerCase().toCharArray();
            char[] ArrayS2 = secondString.toLowerCase().toCharArray();
            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);
            status = Arrays.equals(ArrayS1, ArrayS2);
        }
        if (status) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}