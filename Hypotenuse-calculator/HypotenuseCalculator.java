import java.util.Scanner;

public class HypotenuseCalculator {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("What is the one side of your triangle?");
    int a = scan.nextInt();

    System.out.println("What is the second side of your triangle?");
    int b = scan.nextInt();

    double c;
    c = Math.sqrt((a * a) + (b * b));

    System.out.println("Your hypotenuse is: " + c);

    scan.close();
  }
}
