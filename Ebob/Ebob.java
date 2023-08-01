/**
 * Ebob
 */
public class Ebob {

  int number1;
  int number2;


  public Ebob(int number1, int number2) {
    this.number1 = number1;
    this.number2 = number2;
  }


  public String ebobCalculate() {
    String s = " ";
    int[] ebobArray = new int[250];
    for (int i = 2; (i <= number1) & (i <= number2); i++) {
      if((number1 % i == 0) & (number2 % i == 0)){
        ebobArray[i] = i;
      }
    }
    for (int i = 0; i < ebobArray.length; i++) {
      if (ebobArray[i] != 0) {
        s += ebobArray[i] + " ";
      }
    }
    return s;
  }
}
