// You can experiment here, it won’t be checked

public class Task {
  public static void main(String[] args)
  {

    int number = 12241;
    int digit = ((number % 100) / 10) % 10;

    System.out.println(digit);
    boolean b1 = true;
    boolean b2 = false;
    boolean result = b1 && b2;
    System.out.println(result);
  }
}
