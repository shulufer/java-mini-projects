import java.util.Scanner;

public class GasolineCalculater {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("How much does it burn per hundred kilometer of the vehicle?(example 3,4)");
    Double burn = scan.nextDouble();

    System.out.println("How many kilometers will you travel?(example 555)");
    Double km = scan.nextDouble();

    Double petrolPrice = 0.865;

    Double totalPrice = burn * km * petrolPrice  / 100;

    System.out.println("Total cost for this trip: " + totalPrice);



    scan.close();

  }

}
