
  public class Interest {
    double loan;
    double currency;
    int years;

    public String interestAccount(double currency, double loan, int years) {
      double afterInterest = currency;
      for (int i = years; i > 0; i--) {
        afterInterest = afterInterest * (1 + (loan / 100));
      }

      String calculator = ("After " + years + " years " + ", your money will become " + afterInterest + " with %" + loan +  "yearly interest.");

      return calculator;

    }



  }
