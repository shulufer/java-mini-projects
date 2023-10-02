/**
 * Points
 */
public class Points {

  int point;



  public int getPoint() {
    return point;
  }

  public int changePoint(int addPoint, String name){
    point += addPoint;


    if (addPoint > 0) {
      System.out.println(name + " gains to Grifindor " + getPoint() + " points.");
    } else {
      System.out.println("Grifindor lost " + getPoint() + " points.");
    }
    return point;
  }

  @Override
  public String toString() {
    return "Grifindor point is " + getPoint();
  }





  public static void main(String[] args) {

    Points point = new Points();

    point.changePoint(100, "Harry");
    System.out.println("**********");
    System.out.println(point.toString());
    System.out.println("**********");
    point.changePoint(-50, "Harry");
    System.out.println("**********");
    System.out.println(point.toString());
    System.out.println("**********");
    point.changePoint(20, "Ron");
    System.out.println("**********");
    System.out.println(point.toString());
    System.out.println("**********");



  }


}
