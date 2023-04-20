import java.util.Scanner;

public class BasicCalculater {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.print("First number: ");
    double firstNumber = scan.nextInt();

    System.out.print("Second number: ");
    double secondNumber = scan.nextInt();
    scan.nextLine();

    System.out.println("Which math operation would you like to do? (\"+\" or \"-\" or \"*\" or \"/\") ");
    String operater = scan.nextLine();

    double result = 0;

    switch (operater) {
      case "+":
        result = firstNumber + secondNumber;
        break;
        case "-":
        result = firstNumber - secondNumber;
        break;
        case "*":
        result = firstNumber * secondNumber;
        break;
        case "/":
        result = firstNumber / secondNumber;
        break;
      default:
        System.out.println("This is not an operater. Try again!");
        break;
    }

    System.out.println("Your result is : " + result);

    scan.close();
  }
}
