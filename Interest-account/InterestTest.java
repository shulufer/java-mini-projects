import java.util.Scanner;

public class InterestTest {

  public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);

    Interest yourInterest = new Interest();

    System.out.println("***********************");
    System.out.println("Welcome to java bank");
    System.out.println("***********************");
    System.out.println("Enter the years you want in interest");
    yourInterest.years = scanner.nextInt();
    scanner.nextLine();
    System.out.println("***********************");
    System.out.println("Enter your currency");
    yourInterest.currency = scanner.nextInt();
    scanner.nextLine();
    System.out.println("***********************");
    System.out.println("Enter your loan");
    yourInterest.loan = scanner.nextInt();
    scanner.nextLine();
    System.out.println("***********************");
    System.out.println(yourInterest.interestAccount(yourInterest.currency, yourInterest.loan, yourInterest.years));
    System.out.println("***********************");

    scanner.close();
  }


}
