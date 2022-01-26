import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int value = scanner.nextInt();
        
        final int ten = 10;

        boolean trueOrFalse = value < ten;
        System.out.println(trueOrFalse);        
    }
}
