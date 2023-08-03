public class Manager extends Employees {

  private int bonus;
  private int yearsInManager;

  public Manager(String name, int age, int baseSalary, int years, int bonus, int yearsInManager) {
    super(name, age, baseSalary, years);
    this.bonus = bonus;
    this.yearsInManager = yearsInManager;
  }

  public int calculateTheSalary() {
    int managerSalary;
    // System.out.println("base " + super.calculateTheSalary());
    managerSalary = super.calculateTheSalary() + (bonus * yearsInManager);
    return managerSalary;
  }

  public double getBonus() {
    return bonus;
  }

  public void setYearsInManager(int yearsInManager) {
    this.yearsInManager = yearsInManager;
  }

  public int getYearsInManager() {
    return yearsInManager;
  }


}
