import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);


      System.out.println("Input:");
      int number = sc.nextInt();

      System.out.println("********");
      System.out.println(primeOrNot(number));
      System.out.println("********");


      sc.close();

    }

      public static String primeOrNot(int number) {
        String s = new String(" ");
        int[] primesNumber = new int[number];
        int k;
        for (int i = (number - 1); i > 1; i--) {
          k = 0;
          for (int j = 2; j < i - 1; j++) {
            if (i % j == 0) {
              k++;
            }

          }
          if (k == 0) {
            primesNumber[i] = i;
          }
        }
        for (int i = 0; i < number; i++) {
          if (primesNumber[i] != 0) {
            s += primesNumber[i] + " ";
          }
        }
        return s;
      }

    }
