import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int input = scanner.nextInt();
        final int square = 1;
        final int circle = 2;
        final int triangle = 3;
        final int rhombus = 4;

        switch (input) {
            case square:
                System.out.println("You have chosen a square");
                break;
            case circle:
                System.out.println("You have chosen a circle");
                break;
            case triangle:
                System.out.println("You have chosen a triangle");
                break;
            case rhombus:
                System.out.println("You have chosen a rhombus");
                break;
            default:
                System.out.println("There is no such shape!");
                break;
        }
    }
}