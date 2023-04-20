import java.util.Scanner;

public class ValueComparator {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Enter a number");
    double number1 = scan.nextInt();

    System.out.println("Enter an another number");
    double number2 = scan.nextInt();

    System.out.println("And the last number");
    double number3 = scan.nextInt();

    double max = number1;

    if (number1 >= number2 && number1 >= number3) {
      max = number1;
    } else if (number2 >= number1 && number2 >= number3){
      max = number2;
    } else if (number3 >= number1 && number3 >= number2){
      max = number3;
    }

    System.out.println("The biggest number is: " + max);


    scan.close();
  }
}
