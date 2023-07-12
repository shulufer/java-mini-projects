public class X {

  int i;
  int j;
  static int k = 0;

  X(int i, int j) {
    this.i = i;
    this.j = j;
    X.k++;
  }

  X(){
    this(5, 4);
  }

}
