import java.util.ArrayList;

/**
 * SieveOfEratosthenesMethod
 */
public class SieveOfEratosthenesMethod {

  int maxNumber;
  ArrayList<Integer> primeNumberArray;
  int arrayNumber = 0;

  public int getMaxNumber() {
    return maxNumber;
  }

  public void setMaxNumber(int maxNumber) {
    this.maxNumber = maxNumber;
  }

  public void calculatePrimeNumbers(int maxNumber) {
    System.out.println(1);
    primeNumberArray(getMaxNumber());
    for (int i = 2; i <= maxNumber; i++) {
      System.out.println(1);
      for (int j = 0; j < maxNumber; j++) {

        this.primeNumberArray.add(j,i);
      }


    }

  }

  public ArrayList<Integer> getPrimeNumberArray() {
    return primeNumberArray;
  }

}
