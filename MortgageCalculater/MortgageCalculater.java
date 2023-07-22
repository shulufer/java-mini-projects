/**
 * MortgageCalculater
 */
public class MortgageCalculater {

  private int principal;
  private int loanTerms;
  private double interestRate;
  private int yearlyPrepayments;



  public MortgageCalculater(int principal, int loanTerms, double interestRate, int yearlyPrepayments) {
    this.principal = principal;
    this.loanTerms = loanTerms;
    this.interestRate = interestRate;
    this.yearlyPrepayments = yearlyPrepayments;
  }

  public double paymentCalculator(){
    double monthlyPayment;
    monthlyPayment = (principal * (((interestRate / 1200) * (Math.pow((1+(interestRate / 1200)), loanTerms))) / (Math.pow(1+(interestRate / 1200), loanTerms) - 1)));
    // monthlyPayment = principal * (((interestRate) * Math.pow((1 + interestRate), loanTerms))/(Math.pow(1 + interestRate, loanTerms) - 1));
    // monthlyPayment = ((principal / loanTerms) + ((principal / loanTerms) * interestRate));
    return monthlyPayment;
  }

  public void extraPAymentCalculationAfterOneYear() {
    principal -= yearlyPrepayments;
    interestRate -= 0.09;
  }

  public double secondYearPaymentCalculator() {
    double monthlyPayment;
    extraPAymentCalculationAfterOneYear();
    monthlyPayment = (principal * (((interestRate / 1200) * (Math.pow((1+(interestRate / 1200)), loanTerms))) / (Math.pow(1+(interestRate / 1200), loanTerms) - 1)));
    return monthlyPayment;
  }

  public void extraPAymentCalculationAftersecondYear() {
    principal -= yearlyPrepayments;
    interestRate -= 0.05;
  }

  public double allYearPaymentCalculator() {
    double monthlyPayment;
    extraPAymentCalculationAftersecondYear();
    monthlyPayment = (principal * (((interestRate / 1200) * (Math.pow((1+(interestRate / 1200)), loanTerms))) / (Math.pow(1+(interestRate / 1200), loanTerms) - 1)));
    return monthlyPayment;
  }






}
