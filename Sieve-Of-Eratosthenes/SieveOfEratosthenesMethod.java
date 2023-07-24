

public class SieveOfEratosthenesMethod {

  private int maxNumber;

  public int getMaxNumber() {
    return this.maxNumber;
  }

  public void setMaxNumber(int maxNumber) {
    this.maxNumber = maxNumber;
  }

  public void pushNumberInAnArray(){
    int[] primeNumberList = new int[maxNumber];
    int howManyNumberArePrime = 0;
    for (int i = 0; i < primeNumberList.length; i++) {
      primeNumberList[i] = i ;
    }
    for (int i = 2; i < primeNumberList.length / 2; i++) {
      for (int j = 2; i * j < primeNumberList.length; j++) {
        primeNumberList[i * j] = 0;

      }
    }
    primeNumberList[1] = 0;
    for (int i : primeNumberList) {
      if (primeNumberList[i] != 0) {
        System.out.println(i);
        howManyNumberArePrime++;
      }
    }
    System.out.println("There are " + howManyNumberArePrime + " number " + " up to " + maxNumber );
  }


}
