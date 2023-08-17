public class Triangle  extends Shape{

  double a;
  double b;
  double c;


  public Triangle() {
  }


  public Triangle(double a, double b, double c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  @Override
  public void draw() {
    // System.out.println("      *       ");
    // System.out.println("    *   *     ");
    // System.out.println("   *      *   ");
    // System.out.println(" *         *  ");
    // System.out.println("* * * * * * * ");
  }

  @Override
  public void erase() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'erase'");
  }

  @Override
  public double calculateArea() {
    double area;
    double doubleArea;
    double halfCircumFerence = calculateCircumference();
    doubleArea = (halfCircumFerence) * (halfCircumFerence - a) * (halfCircumFerence - b) * (halfCircumFerence - c);
    area = Math.sqrt(doubleArea);
    return area;
  }

  @Override
  public double calculateCircumference() {
    double circumFerence;
    circumFerence = a + b + c;
    return circumFerence;
  }

}
