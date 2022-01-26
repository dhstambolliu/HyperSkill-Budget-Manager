import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int input = scanner.nextInt();
        final int min = -15;
        final int twelve = 12;
        final int fourteen = 14;
        final int seventeen = 17;
        final int nineteen = 19;

        if (input > min && input <= twelve) {
            System.out.println("True");
        } else if (input > fourteen && input < seventeen) {
            System.out.println("True");
        } else if (input >= nineteen) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}