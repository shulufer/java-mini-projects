/**
 * MortgageCalculater
 */
public class MortgageCalculater {

  private int principal;
  private int loanTerms;
  private double interestRate;
  private int yearlyPrepayments;
  private int monthlyPayment;



  public MortgageCalculater(int principal, int loanTerms, double interestRate, int yearlyPrepayments) {
    this.principal = principal;
    this.loanTerms = loanTerms;
    this.interestRate = interestRate;
    this.yearlyPrepayments = yearlyPrepayments;
  }

  public int paymentCalculator(){
    monthlyPayment = (int)(principal * (((interestRate / 1200) * (Math.pow((1+(interestRate / 1200)), loanTerms))) / (Math.pow(1+(interestRate / 1200), loanTerms) - 1)));
    // monthlyPayment = principal * (((interestRate) * Math.pow((1 + interestRate), loanTerms))/(Math.pow(1 + interestRate, loanTerms) - 1));
    // monthlyPayment = ((principal / loanTerms) + ((principal / loanTerms) * interestRate));
    return monthlyPayment;
  }

  public void extraPAymentCalculationAfterOneYear() {
    principal -= yearlyPrepayments;
    interestRate -= 0.09;
  }

  public double secondYearPaymentCalculator() {
    extraPAymentCalculationAfterOneYear();
    monthlyPayment = (int)(principal * (((interestRate / 1200) * (Math.pow((1+(interestRate / 1200)), loanTerms))) / (Math.pow(1+(interestRate / 1200), loanTerms) - 1)));
    return monthlyPayment;
  }

  public void extraPAymentCalculationAftersecondYear() {
    principal -= yearlyPrepayments;
    interestRate -= 0.05;
  }

  public double allYearPaymentCalculator() {
    extraPAymentCalculationAftersecondYear();
    monthlyPayment = (int)(principal * (((interestRate / 1200) * (Math.pow((1+(interestRate / 1200)), loanTerms))) / (Math.pow(1+(interestRate / 1200), loanTerms) - 1)));
    return monthlyPayment;
  }

  public int monthIsEnd() {
    int valueOFHouse = principal;
    double payment = 0;
    int month = 0;
    int j = 1;
    for (int i = 1; valueOFHouse >= payment; i++) {
      payment += monthlyPayment;
      System.out.println(i + " - " + (int)payment);
      for (; i % 12 == 0;) {
        payment += yearlyPrepayments;

        System.out.println(j + " years extra - " + (int)payment);
        j++;
        break;
      }
    month = i;
    }
    return month;
  }






}
