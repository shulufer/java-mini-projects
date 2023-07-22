import java.util.Scanner;

public class Calculater {

    public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);

      System.out.println("What is your mortgage value?");
      int value = scan.nextInt();
      scan.nextLine();
      System.out.println("What is your interest rate? (for 100%)");
      double rate = scan.nextInt();
      scan.nextLine();
      System.out.println("What is your term?");
      int terms = scan.nextInt();
      scan.nextLine();
      System.out.println("What is your extra peyment?");
      int extraPayment = scan.nextInt();
      scan.nextLine();



      MortgageCalculater user1 = new MortgageCalculater(value, terms, rate, extraPayment);

      double payment = user1.paymentCalculator();
      System.out.println(payment);

      double secondYearpayment = user1.secondYearPaymentCalculator();
      System.out.println(secondYearpayment);

      double thirdYearpayment = user1.allYearPaymentCalculator();
      System.out.println(thirdYearpayment);

      double forthYearpayment = user1.allYearPaymentCalculator();
      System.out.println(forthYearpayment);

      double fifthYearpayment = user1.allYearPaymentCalculator();
      System.out.println(fifthYearpayment);

      scan.close();
    }
}
