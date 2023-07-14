/**
 * SieveOfEratosthenesMethod
 */
public class SieveOfEratosthenesMethod {

  int maxNumber;
  int[] primeNumberArray;
  int arrayNumber = 0;

  public int getMaxNumber() {
    return maxNumber;
  }

  public void setMaxNumber(int maxNumber) {
    this.maxNumber = maxNumber;
  }

  public int[] getPrimeNumberArray() {
    return primeNumberArray;
  }

  public void calculatePrimeNumbers(int maxNumber) {
    for (int i = 2; i <= maxNumber; i++) {
      for (int index = 1; (i * index) <= maxNumber; index++) {
        for (int j = 0; i < primeNumberArray.length; j++) {
          if (primeNumberArray[j] == i * index) {
            continue;
          } else {
            primeNumberArray[arrayNumber] = j * index;
            arrayNumber++;

          }
        }
      }


    }

  }





}
