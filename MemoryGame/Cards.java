import java.util.Random;
import java.util.Scanner;

public class Cards {

  private static char[][] backSide = new char[4][4];
  static{
    System.out.println("Start....");
    for (int i = 0; i < backSide.length; i++) {
          for (int j = 0; j < backSide.length; j++) {
            backSide[i][j] = 'x';

          }
        }
  }
  private static char[][] frontSide = new char[4][4];
  static {
    frontSide[0][0] = 'A';
    frontSide[0][1] = 'B';
    frontSide[0][2] = 'C';
    frontSide[0][3] = 'D';
    frontSide[1][0] = 'E';
    frontSide[1][1] = 'F';
    frontSide[1][2] = 'G';
    frontSide[1][3] = 'H';
    frontSide[2][0] = 'A';
    frontSide[2][1] = 'B';
    frontSide[2][2] = 'C';
    frontSide[2][3] = 'D';
    frontSide[3][0] = 'E';
    frontSide[3][1] = 'F';
    frontSide[3][2] = 'G';
    frontSide[3][3] = 'H';
  }




  public static void showCards(){
    System.out.println("\n");
    for (int i = 0; i < backSide.length; i++) {
      for (int j = 0; j < backSide.length; j++) {
        System.out.print( " " + backSide[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void firstRound(){
    Cards.showCards();
    Scanner scan = new Scanner(System.in);
    System.out.println("Press first x and y");
    int x1 = scan.nextInt() - 1;
    int y1 = scan.nextInt() - 1;

    if (backSide[x1][y1] == 'x') {
      backSide[x1][y1] = frontSide[x1][y1];
      Cards.showCards();

      System.out.println("Press second x and y");
      int x2 = scan.nextInt() - 1;
      int y2 = scan.nextInt() - 1;

      if (backSide[x2][y2] == 'x') {

        backSide[x2][y2] = frontSide[x2][y2];

        Cards.showCards();

        if (backSide[x1][y1] == backSide[x2][y2]) {
          System.out.println("Good job.");
        } else {
          backSide[x1][y1] = 'x';
          backSide[x2][y2] = 'x';
          System.out.println("Try again");
        }
      } else {
        backSide[x1][y1] = 'x';
        System.out.println("Wrong number.");
      }

    } else {
      System.out.println("Wrong number.");
    }
  }

  public static void win(){
    Scanner scan = new Scanner(System.in);
    if(include()){
      System.out.println("****************");

    } else {
      System.out.println("****************");
      System.out.println("****************");
      System.out.println("You are the one");
      System.out.println("****************");
      System.out.println("****************");

    }
  }

  public static boolean include(){
    boolean isinclude = false;
    for (int i = 0; i < backSide.length; i++) {
      for (int j = 0; j < backSide.length; j++) {
        if(backSide[i][j] == 'x'){
          isinclude = true;
          break;
        }
      }
      if (isinclude == true) {
        break;
      }
    }
    return isinclude;
  }





}
