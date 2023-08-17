
public class Calculator {

    public static void main(String[] args) {
      ShapeFactory factory = new ShapeFactory();
      Shape s = factory.createShape();

      s.draw();
      System.out.println(s.calculateArea());
      System.out.println(s.calculateCircumference());

    }

}
