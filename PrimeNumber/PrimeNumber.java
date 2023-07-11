import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);


      System.out.println("Input:");
      int number = sc.nextInt();

      System.out.println(primeOrNot(number));


      sc.close();

    }

      public static int primeOrNot(int n) {
        int prime = 0;
        int upperBound = (int) (Math.sqrt(n) + 1);
        for (int i = 2; i < upperBound; i++) {
          if (n % i == 0) {
            prime = 1;
            break;
          }
        }
        return prime;
      }

    }
