public class MonteCarloPI {
  public static void main(String[] args) {

    double x;
    double y;
    double inCircle = 0;




    for (int i = 0; i < 1000000; i++) {

      x = Math.random();
      y = Math.random();

      if ((x * x) + (y * y) <= 1) {
        inCircle++;
      }

      double MyPI = (4) * (inCircle / i) ;

      System.out.println("My PI = " + MyPI);

    }

    System.out.println("Java's PI = " + Math.PI);




  }
}
