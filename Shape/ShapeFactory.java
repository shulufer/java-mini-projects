import java.util.Scanner;

public class ShapeFactory {


  public ShapeFactory() {
  }

  public Shape createShape(){
    Shape shape = null;
    Scanner scan = new Scanner(System.in);
    int i = (int) (Math.random() * 4);
    if (i == 1) {
      System.out.println("what is the radius?");
      double r = scan.nextDouble();
      scan.nextLine();
      shape = new Circle(r);
    } else if (i == 2) {
      System.out.println("what is the first edge?");
      double a = scan.nextDouble();
      scan.nextLine();
      System.out.println("what is the second edge?");
      double b = scan.nextDouble();
      scan.nextLine();
      System.out.println("what is the thrid edge?");
      double c = scan.nextDouble();
      scan.nextLine();
      shape = new Triangle(a, b, c);
    }  else if (i == 3) {
      System.out.println("what is the first edge?");
      double a = scan.nextDouble();
      scan.nextLine();
      System.out.println("what is the second edge?");
      double b = scan.nextDouble();
      scan.nextLine();
      shape = new Rectangle(a, b);
    }  else if (i == 4) {
      System.out.println("what is the edge?");
      double a = scan.nextDouble();
      scan.nextLine();
      shape = new Square(a);
    }
    scan.close();

    return shape;

  }



}
