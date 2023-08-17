public class Circle extends Shape {

  double r;


  public Circle() {
  }


  public Circle(double r) {
    this.r = r;
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
