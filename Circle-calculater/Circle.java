public class Circle {
  Double radius;
  Double circumference;

  Circle() {
    this(10d);
  }

  Circle(Double newRadius) {
    radius = newRadius;
    circumference = 2 * Math.PI * radius;
  }

  public void printInfo() {
    System.out.println("Radius = " + radius + "\n" + "Circumference = " + circumference);
  }
}
