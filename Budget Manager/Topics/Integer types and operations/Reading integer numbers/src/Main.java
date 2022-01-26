import java.util.Scanner;
import java.util.stream.Stream;

class Main {
    public static void main(String[] args) {
        // start coding here
        Scanner jcdInput = new Scanner(System.in);

        //Capture the entire line entered
        String jcdLine = jcdInput.nextLine();

        //Split the line into tokens using Stream() and mapping to integer array
        int[] intArray = Stream.of(jcdLine.split("\\s+")).mapToInt(Integer::parseInt).toArray();

        //Print out each array element
        for (int jcdInt : intArray) {
            System.out.println(jcdInt);
        }

        jcdInput.close();
    }
}
