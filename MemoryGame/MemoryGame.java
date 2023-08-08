import java.util.Scanner;

public class MemoryGame {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("Welcome to Memory Game.");
    String quit;


    do {
      Cards.firstRound();

      Cards.win();

      System.out.println("Press q for quit.");
      quit = scan.nextLine();
    } while (!quit.equals("q"));



  }


}
