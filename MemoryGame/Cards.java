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

    for (int i = 0; i < backSide.length; i++) {
      for (int j = 0; j < backSide.length; j++) {
        // String s = " " + backSide[i][j] + " ";
        System.out.print( " " + backSide[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void firstRound(){
    Scanner scan = new Scanner(System.in);
    System.out.println("Press first x and y");
    int x1 = scan.nextInt() - 1;
    int y1 = scan.nextInt() - 1;

    backSide[x1][y1]= frontSide[x1][y1];


  }





}
