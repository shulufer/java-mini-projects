
public class Employees {

  private String name;
  private int age;
  private int baseSalary;
  private int years;



  public Employees(String name, int age, int baseSalary, int years) {
    this.name = name;
    this.age = age;
    this.baseSalary = baseSalary;
    this.years = years;
  }


  public int calculateTheSalary() {
    int salary;
    salary = baseSalary + (years * 100);
    return salary;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }


  public double getBaseSalary() {
    return this.baseSalary;
  }

  public void setYears(int years) {
    this.years = years;
  }

  public int getYears() {
    return years;
  }
}
