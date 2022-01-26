import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String input = scanner.nextLine();

        final String gryffindor = "bravery";
        final String hufflepuff = "loyalty";
        final String slytherin = "cunning";
        final String ravenclaw = "intellect";

        switch (input) {
            case "gryffindor":
                System.out.println(gryffindor);
                break;
            case "hufflepuff":
                System.out.println(hufflepuff);
                break;
            case "slytherin":
                System.out.println(slytherin);
                break;
            case "ravenclaw":
                System.out.println(ravenclaw);
                break;
            default:
                System.out.println("not a valid house");
                break;
        }
    }
}