import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String input = scanner.nextLine();
        boolean contains = input.endsWith("burg");;

        System.out.println(contains);
    }
}