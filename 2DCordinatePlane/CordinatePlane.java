public class CordinatePlane {
  public static void main(String[] args) {

    Point threeFour = new Point(3, 4);
    System.out.println(threeFour);
    System.out.println(threeFour.distanceToOrigin());

    threeFour.move(1, 2);
    System.out.println(threeFour);
    System.out.println(threeFour.distanceToOrigin());
  }
}
