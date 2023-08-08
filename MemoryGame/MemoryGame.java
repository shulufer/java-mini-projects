import java.util.Scanner;

public class MemoryGame {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("Welcome to Memory Game.");
    String quitOrNot = "a";

    do {
      Cards.showCards();


      Cards.firstRound();
      Cards.showCards();

      // System.out.println("Press second x");
      // int x2 = scan.nextInt();
      // System.out.println("Press second y");
      // int y2 = scan.nextInt();
      // scan.nextLine();

      // Cards.showCards();

      System.out.println("Press q for quite.");
      quitOrNot = scan.nextLine();
    } while (quitOrNot != "q");



    scan.close();;
  }


}
