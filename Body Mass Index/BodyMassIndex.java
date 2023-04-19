import java.util.Scanner;

public class BodyMassIndex {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("How tall are you?(cm)");
    double size = scan.nextInt();
    scan.nextLine(); // Dummy

    System.out.println("How much do you weigh?(kg)");
    double weigh = scan.nextInt();
    scan.nextLine(); // Dummy

    double bmi = (weigh / ((size /100) * (size / 100)));

    System.out.println("Your BMI =" + bmi);

    scan.close();
  }

}
