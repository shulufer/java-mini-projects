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
  private static int a;
  private static int b;
  private static char[][] frontSide = new char[4][4];
  static {
    System.out.println("****New hand****");
    // frontSide[0][0] = 'x';
    // frontSide[0][1] = 'x';
    // frontSide[0][2] = 'x';
    // frontSide[0][3] = 'x';
    // frontSide[1][0] = 'x';
    // frontSide[1][1] = 'x';
    // frontSide[1][2] = 'x';
    // frontSide[1][3] = 'x';
    // frontSide[2][0] = 'x';
    // frontSide[2][1] = 'x';
    // frontSide[2][2] = 'x';
    // frontSide[2][3] = 'x';
    // frontSide[3][0] = 'x';
    // frontSide[3][1] = 'x';
    // frontSide[3][2] = 'x';
    // frontSide[3][3] = 'x';

    // while ((frontSide[0][0] != ('x')) & (frontSide[0][1] != ('x')) & (frontSide[0][2] != ('x')) & (frontSide[0][3] != ('x')) & (frontSide[1][0] != ('x')) & (frontSide[1][1] != ('x')) & (frontSide[1][2] != ('x')) & (frontSide[1][3] != ('x')) & (frontSide[2][0] != ('x')) & (frontSide[2][1] != ('x')) & (frontSide[2][2] != ('x')) & (frontSide[2][3] != ('x')) & (frontSide[3][0] != ('x')) & (frontSide[3][1] != ('x')) & (frontSide[3][2] != ('x')) & (frontSide[3][3] != ('x'))) {
      if (frontSide[a = (int)(Math.random() * 4)][b = (int)(Math.random() * 4)] == 'x') {
        frontSide[a][b] = 'A';
      }
      if (frontSide[a = (int)(Math.random() * 4)][b = (int)(Math.random() * 4)] == 'x') {
        frontSide[a][b] = 'B';
      } else {
        for (int i = 0; i < frontSide.length; i++) {
          int k = 0;
          for (int j = 0; j < frontSide.length; j++) {
            if (frontSide[i][j] == 'x') {
              frontSide[i][j] = 'B';
              k = 1;
              break;
            }
            if (k == 1) {
              break;
            }

          }
        }
      }
      if (frontSide[a = (int)(Math.random() * 4)][b = (int)(Math.random() * 4)] == 'x') {
        frontSide[a][b] = 'C';
      } else {
        for (int i = 0; i < frontSide.length; i++) {
          int k = 0;
          for (int j = 0; j < frontSide.length; j++) {
            if (frontSide[i][j] == 'x') {
              frontSide[i][j] = 'C';
              k = 1;
              break;
            }
            if (k == 1) {
              break;
            }

          }
        }
      }
      if (frontSide[a = (int)(Math.random() * 4)][b = (int)(Math.random() * 4)] == 'x') {
        frontSide[a][b] = 'D';
      } else {
        for (int i = 0; i < frontSide.length; i++) {
          int k = 0;
          for (int j = 0; j < frontSide.length; j++) {
            if (frontSide[i][j] == 'x') {
              frontSide[i][j] = 'D';
              k = 1;
              break;
            }
            if (k == 1) {
              break;
            }

          }
        }
      }
      if (frontSide[a = (int)(Math.random() * 4)][b = (int)(Math.random() * 4)] == 'x') {
        frontSide[a][b] = 'E';
      } else {
        for (int i = 0; i < frontSide.length; i++) {
          int k = 0;
          for (int j = 0; j < frontSide.length; j++) {
            if (frontSide[i][j] == 'x') {
              frontSide[i][j] = 'E';
              k = 1;
              break;
            }
            if (k == 1) {
              break;
            }

          }
        }
      }
      if (frontSide[a = (int)(Math.random() * 4)][b = (int)(Math.random() * 4)] == 'x') {
        frontSide[a][b] = 'F';
      } else {
        for (int i = 0; i < frontSide.length; i++) {
          int k = 0;
          for (int j = 0; j < frontSide.length; j++) {
            if (frontSide[i][j] == 'x') {
              frontSide[i][j] = 'F';
              k = 1;
              break;
            }
            if (k == 1) {
              break;
            }

          }
        }
      }
      if (frontSide[a = (int)(Math.random() * 4)][b = (int)(Math.random() * 4)] == 'x') {
        frontSide[a][b] = 'G';
      } else {
        for (int i = 0; i < frontSide.length; i++) {
          int k = 0;
          for (int j = 0; j < frontSide.length; j++) {
            if (frontSide[i][j] == 'x') {
              frontSide[i][j] = 'G';
              k = 1;
              break;
            }
            if (k == 1) {
              break;
            }

          }
        }
      }
      if (frontSide[a = (int)(Math.random() * 4)][b = (int)(Math.random() * 4)] == 'x') {
        frontSide[a][b] = 'H';
      } else {
        for (int i = 0; i < frontSide.length; i++) {
          int k = 0;
          for (int j = 0; j < frontSide.length; j++) {
            if (frontSide[i][j] == 'x') {
              frontSide[i][j] = 'H';
              k = 1;
              break;
            }
            if (k == 1) {
              break;
            }

          }
        }
      }
      if (frontSide[a = (int)(Math.random() * 4)][b = (int)(Math.random() * 4)] == 'x') {
        frontSide[a][b] = 'A';
      } else {
        for (int i = 0; i < frontSide.length; i++) {
          int k = 0;
          for (int j = 0; j < frontSide.length; j++) {
            if (frontSide[i][j] == 'x') {
              frontSide[i][j] = 'A';
              k = 1;
              break;
            }
            if (k == 1) {
              break;
            }

          }
        }
      }
      if (frontSide[a = (int)(Math.random() * 4)][b = (int)(Math.random() * 4)] == 'x') {
        frontSide[a][b] = 'B';
      } else {
        for (int i = 0; i < frontSide.length; i++) {
          int k = 0;
          for (int j = 0; j < frontSide.length; j++) {
            if (frontSide[i][j] == 'x') {
              frontSide[i][j] = 'B';
              k = 1;
              break;
            }
            if (k == 1) {
              break;
            }

          }
        }
      }
      if (frontSide[a = (int)(Math.random() * 4)][b = (int)(Math.random() * 4)] == 'x') {
        frontSide[a][b] = 'C';
      } else {
        for (int i = 0; i < frontSide.length; i++) {
          int k = 0;
          for (int j = 0; j < frontSide.length; j++) {
            if (frontSide[i][j] == 'x') {
              frontSide[i][j] = 'C';
              k = 1;
              break;
            }
            if (k == 1) {
              break;
            }

          }
        }
      }
      if (frontSide[a = (int)(Math.random() * 4)][b = (int)(Math.random() * 4)] == 'x') {
        frontSide[a][b] = 'D';
      } else {
        for (int i = 0; i < frontSide.length; i++) {
          int k = 0;
          for (int j = 0; j < frontSide.length; j++) {
            if (frontSide[i][j] == 'x') {
              frontSide[i][j] = 'D';
              k = 1;
              break;
            }
            if (k == 1) {
              break;
            }

          }
        }
      }
      if (frontSide[a = (int)(Math.random() * 4)][b = (int)(Math.random() * 4)] == 'x') {
        frontSide[a][b] = 'E';
      } else {
        for (int i = 0; i < frontSide.length; i++) {
          int k = 0;
          for (int j = 0; j < frontSide.length; j++) {
            if (frontSide[i][j] == 'x') {
              frontSide[i][j] = 'E';
              k = 1;
              break;
            }
            if (k == 1) {
              break;
            }

          }
        }
      }
      if (frontSide[a = (int)(Math.random() * 4)][b = (int)(Math.random() * 4)] == 'x') {
        frontSide[a][b] = 'F';
      } else {
        for (int i = 0; i < frontSide.length; i++) {
          int k = 0;
          for (int j = 0; j < frontSide.length; j++) {
            if (frontSide[i][j] == 'x') {
              frontSide[i][j] = 'F';
              k = 1;
              break;
            }
            if (k == 1) {
              break;
            }

          }
        }
      }
      if (frontSide[a = (int)(Math.random() * 4)][b = (int)(Math.random() * 4)] == 'x') {
        frontSide[a][b] = 'G';
      } else {
        for (int i = 0; i < frontSide.length; i++) {
          int k = 0;
          for (int j = 0; j < frontSide.length; j++) {
            if (frontSide[i][j] == 'x') {
              frontSide[i][j] = 'G';
              k = 1;
              break;
            }
            if (k == 1) {
              break;
            }

          }
        }
      }
      if (frontSide[a = (int)(Math.random() * 4)][b = (int)(Math.random() * 4)] == 'x') {
        frontSide[a][b] = 'H';
      } else {
        for (int i = 0; i < frontSide.length; i++) {
          int k = 0;
          for (int j = 0; j < frontSide.length; j++) {
            if (frontSide[i][j] == 'x') {
              frontSide[i][j] = 'H';
              k = 1;
              break;
            }
            if (k == 1) {
              break;
            }

          }
        }
      }
    // }
  }




  public static void showCards(){
    System.out.println("\n");
    for (int i = 0; i < backSide.length; i++) {
      for (int j = 0; j < backSide.length; j++) {
        System.out.print( " " + backSide[i][j] + " ");
      }
      System.out.println();
    }

    for (int i = 0; i < frontSide.length; i++) {
      for (int j = 0; j < frontSide.length; j++) {
        System.out.print( " " + frontSide[i][j] + " ");
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
