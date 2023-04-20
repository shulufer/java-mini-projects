import java.util.Scanner;

public class BodyMassIndex {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("How tall are you?(F.e. 185(cm))");
    double tall = scan.nextInt();

    System.out.println("How weigh are you?(F.e. 85(kg))");
    double weigh = scan.nextInt();

    double bmi = (weigh / ((tall / 100) * (tall / 100) ));

    String weightStatus = "Try again!";

    if (bmi < 18.5) {
      weightStatus = "underweight";
    } else if (bmi <= 24.9) {
      weightStatus = "normal";
    } else if (bmi <= 29.9) {
      weightStatus = "overweight";
    } else if (bmi <= 34.9) {
      weightStatus = "obese";
    } else {
      weightStatus = "extremly obese";
    }

    System.out.println("Your BMI is: " + bmi + " and you are " + weightStatus);



    scan.close();
  }
}
