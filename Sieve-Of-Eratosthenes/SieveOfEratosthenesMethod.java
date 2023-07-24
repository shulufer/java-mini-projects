

public class SieveOfEratosthenesMethod {

  private int maxNumber;



  public int getMaxNumber() {
    return this.maxNumber;
  }

  public void setMaxNumber(int maxNumber) {
    this.maxNumber = maxNumber;
  }





  public void pushNumberInAnArray(){
    int[] primeNumberList = new int[maxNumber - 2];
    for (int i = 0; i < primeNumberList.length; i++) {
      primeNumberList[i] = i + 2;
      System.out.println(i + "*" + primeNumberList[i]);
    }
  //   for (int i = 2; i < primeNumberList.length; i++) {
  //     for (int j = 1; i * j < primeNumberList.length; j++) {
  //       if(j == 1){
  //         primeNumberList[i - 2] = i;
  //       }
  //     // System.out.println(primeNumberList[i] + " ");
  //     }
  //   }
  //   for (int i : primeNumberList) {
  //     if (primeNumberList[i] != 0) {
  //       System.out.println(primeNumberList[i]);
  //     }
  //   }
  // }


  // public void findThePrimeNumbers() {
  //   for (int i : primeNumberList) {
  //     System.out.println(i);
  //   }
  }


}
