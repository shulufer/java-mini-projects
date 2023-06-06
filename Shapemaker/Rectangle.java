public class Rectangle {

  int i;
  int j;


  public void createRectangle(int i, int j) {
    for (int index = i; index > 0; index--) {
      for (int k = j; k > 0; k--) {
        System.out.print("*");
      }
      System.out.println("");
    }
  }
}
