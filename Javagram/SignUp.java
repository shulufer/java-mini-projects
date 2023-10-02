import java.util.Scanner;

public class SignUp {

  public static void main(String[] args) {

      // Instructions for this workbook are on Learn the Part (see the Udemy Video: Workbook 2.5 to access the link).

      Scanner scan = new Scanner(System.in);


      Human boris = new Human();

      System.out.println("Welcome to JavaGram! Let's sign you up.");

      System.out.println("What is your first name?");
      boris.setFirstName(scan.nextLine());

      System.out.println("What is your last name?");
      boris.setLastName(scan.nextLine());

      System.out.println("How old are you?");
      boris.setAge(scan.nextInt());
      scan.nextLine();

      System.out.println("Make a username");
      boris.setUserName(scan.nextLine());

      // If you experience trouble picking up the username, please carefully read the instructions on Learn the Part.

      System.out.println("What city do you live in?");
      boris.setCity(scan.nextLine());

      System.out.println("What country is that?");
      boris.setCountry(scan.nextLine());



      //close scanner. It's good practice :D !
      scan.close();

      System.out.println(boris.toString());


  }
}
