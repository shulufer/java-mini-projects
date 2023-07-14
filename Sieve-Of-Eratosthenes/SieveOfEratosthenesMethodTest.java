import java.util.Scanner;

public class SieveOfEratosthenesMethodTest {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    SieveOfEratosthenesMethod user1  = new SieveOfEratosthenesMethod();

    System.out.println("Give me a number");
    user1.setMaxNumber(scan.nextInt());

    user1.calculatePrimeNumbers(user1.getMaxNumber());

    System.out.println(user1.getPrimeNumberArray());


    scan.close();
  }
}
