public class Recrangle extends Shape {

  double a;
  double b;


  public Recrangle() {
  }

  public Recrangle(double a, double b) {
    this.a = a;
    this.b = b;
  }


  @Override
  public void draw() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'draw'");
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
