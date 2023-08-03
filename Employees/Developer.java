public class Developer extends Employees{

  private int bonus;
  private int yearsInDevelopt;


  public Developer(String name, int age, int baseSalary, int years, int bonus, int yearsInDevelopt) {
    super(name, age, baseSalary, years);
    this.bonus = bonus;
    this.yearsInDevelopt = yearsInDevelopt;
  }

  public int calculateTheSalary() {
    int developerSalary;
    // System.out.println("base " + super.calculateTheSalary());
    developerSalary = super.calculateTheSalary() + (bonus * yearsInDevelopt);
    return developerSalary;
  }


  public void setYearsInDevelopt(int yearsInDevelopt) {
    this.yearsInDevelopt = yearsInDevelopt;
  }

  public double getBonus() {
    return bonus;
  }

  public int getYearsInDevelopt() {
    return yearsInDevelopt;
  }


}
