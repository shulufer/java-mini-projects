public class Rectangle extends Shape {

  double a;
  double b;


  public Rectangle() {
  }

  public Rectangle(double a, double b) {
    this.a = a;
    this.b = b;
  }

  public double getA() {
    return this.a;
  }

  public void setA(double a) {
    this.a = a;
  }

  public double getB() {
    return this.b;
  }

  public void setB(double b) {
    this.b = b;
  }


  @Override
  public void draw() {
    System.out.println("Rectangle");
    System.out.println("a = " + this.getA());
  }

  @Override
  public void erase() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'erase'");
  }

  @Override
  public double calculateArea() {
    double area;
    area = a * b;
    return area;
  }

  @Override
  public double calculateCircumference() {
    double circumference;
    circumference = 2 * (a + b);
    return circumference;
  }

}
