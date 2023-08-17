public class Square extends Shape {

  double a;


  public Square() {
  }

  public Square(double a) {
    this.a = a;
  }

  public double getA() {
    return this.a;
  }

  public void setA(double a) {
    this.a = a;
  }


  @Override
  public void draw() {
    System.out.println("Square");
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
    area = a * a;
    return area;
  }

  @Override
  public double calculateCircumference() {
    double circumference;
    circumference = 4 * a;
    return circumference;
  }

}
