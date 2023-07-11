import java.util.Scanner;

public class DistincCharacters {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);


    System.out.println("Input:");
    String input = sc.next();

    System.out.println(isItSame(input));


    sc.close();
  }


  public static boolean isItSame(String input) {
    boolean sameOrNot = false;

    char[] charArray = input.toCharArray();

    int count = 0;


    for (int i = 0; i < charArray.length; i++) {
      int temp = 0;
      for (int j = 0; j < charArray.length; j++) {
        if(charArray[i] != charArray[j]) {
          temp++;
          if (temp == charArray.length - 1) {
            count++;
          }
        }

      }

      for (int j = i + 1; j < charArray.length; j++) {
        if (charArray[i] == charArray[j]) {
          count++;
          continue;
        }
      }

    }


    if (count >= 10) {
      sameOrNot = true;
    }


    return sameOrNot;
  }
}
