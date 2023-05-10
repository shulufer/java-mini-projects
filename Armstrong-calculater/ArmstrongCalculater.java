import java.util.Scanner;

public class ArmstrongCalculater {

  public static void main(String args[]) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Enter a number");
    int number = scan.nextInt();
    int compare = number;
    scan.nextLine();
    int total = 0;
    int counter = 0;
    int exponential = 0;
    int times = number;

    for (int i = 1; times >= 10; i++) {
      times = times / 10;
      exponential = i + 1;
    }

    do {
      counter = number / 10;
      counter *= 10;
      counter = number - counter;
      number = number / 10;

      total += Math.pow(counter, exponential);

      if (number < 10 && number >= 0) {
        total += Math.pow(number, exponential);
        break;
      }

    } while (true);

    if (compare == total) {
      System.out.println("It is an Armstrong Number");
    } else {
      System.out.println("It is not an Armstrong Number");
    }

    scan.close();

  }
}
