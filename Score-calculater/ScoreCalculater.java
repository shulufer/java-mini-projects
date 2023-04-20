import java.util.Scanner;

public class ScoreCalculater {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("What is your first visa score?");
    double visa1 = scan.nextInt();

    System.out.println("What is your second visa score?");
    double visa2 = scan.nextInt();

    System.out.println("What is your final score?");
    double finalScore = scan.nextInt();

    double score = (visa1 * 0.3) + (visa2 * 0.3) + (finalScore * 0.4);
    String note;
    String lastMessage;

    if (score >= 90) {
      note = "AA";
      lastMessage = "Omg!!! Congratulations!";
    } else if (score >= 85) {
      note = "BA";
      lastMessage = "almost full! Congratulations!";
    } else if (score >= 80) {
      note = "BB";
      lastMessage = "Good job! Congratulations!";
    } else if (score >= 75) {
      note = "CB";
      lastMessage = "Good point! Congratulations!";
    } else if (score >= 70) {
      note = "CC";
      lastMessage = "That was close:) Congratulations!";
    } else if (score >= 65) {
      note = "DC";
      lastMessage = "That was close:( You can do it next...";
    } else if (score >= 60) {
      note = "DD";
      lastMessage = "Keep going to study.";
    } else if (score >= 55) {
      note = "FD";
      lastMessage = "Study hard and try again.";
    } else {
      note = "FF";
      lastMessage = "You must focus more.";
    }

    System.out.println("Your score is: " + score + "and your note is " + note + ". " + lastMessage);

    scan.close();

  }
}
