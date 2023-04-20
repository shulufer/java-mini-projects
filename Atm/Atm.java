import java.util.Scanner;

public class Atm {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    String choice = "p";
    double yourMoney = 500;
    double yourWithdraw = 0;
    double yourDeposit = 0;

    while (!choice.equals("q")) {

      System.out.println("Wellcome to atm. What do you want to?");
      System.out.println("For withdraw money press : \"w\"");
      System.out.println("For learn balance press : \"b\"");
      System.out.println("For deposit press : \"d\"");
      System.out.println("For quit press : \"q\"");
      System.out.println("******************\n******************");
      choice = scan.nextLine();

      if (choice.equals("b")) {
        System.out.println("Your money in our bank is " + yourMoney + "€");
      } else if (choice.equals("w")) {
        System.out.println("How much money do you want to withdraw?");
        yourWithdraw = scan.nextDouble();
        scan.nextLine();
        yourMoney += yourWithdraw;
        System.out.println("Your money in our bank is " + yourMoney + "€");
      } else if (choice.equals("d")) {
        System.out.println("How much money do you want to deposit?");
        yourDeposit = scan.nextDouble();
        scan.nextLine();
        yourMoney -= yourDeposit;
        System.out.println("Your money in our bank is " + yourMoney + "€");
      } else if (choice.equals("q")) {
        System.out.println("Bye...");
      } else {
        System.out.println("Invalid operation");
        break;
      }

    }


    scan.close();
  }
}
