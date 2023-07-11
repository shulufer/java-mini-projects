public class Circle {
  Double radius;
  Double circumference;

  Circle() {
    radius = 10d;
    circumference = 2 * Math.PI * radius;
  }

  Circle(Double newRadius) {
    radius = newRadius;
    circumference = 2 * Math.PI * newRadius;
  }

  public void printInfo() {
    System.out.println("Radius = " + radius + "\n" + "Circumference = " + circumference);
  }
}
