public class Circle extends Shape {

  double r;


  public Circle() {
  }


  public Circle(double r) {
    this.r = r;
  }

  public double getR() {
    return this.r;
  }

  public void setR(double r) {
    this.r = r;
  }


  @Override
  public void draw() {
    System.out.println("Circle");
    System.out.println("a = " + this.getR());
  }

  @Override
  public void erase() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'erase'");
  }

  @Override
  public double calculateArea() {
    double area;
    area = Math.PI * r * r;
    return area;
  }

  @Override
  public double calculateCircumference() {
    double circumference;
    circumference = 2 * Math.PI * r;
    return circumference;
  }

}
