import java.lang.Math;

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

  public double getC() {
    return this.c;
  }

  public void setC(double c) {
    this.c = c;
  }

  @Override
  public void draw() {
    System.out.println("Triangle");
    System.out.println("a = " + this.getA());
    System.out.println("b = " + this.getB());
    System.out.println("c = " + this.getC());
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
    double halfCircumFerence = (a + b + c) / 2;
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
