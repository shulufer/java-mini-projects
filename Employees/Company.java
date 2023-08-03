
public class Company {

  public static void main(String[] args) {

    Manager hakan1 = new Manager("Hakan1", 30, 1500, 10, 300, 10);
    System.out.println(hakan1.getName() + " salary is " + hakan1.calculateTheSalary());
    System.out.println("********************");

    Employees hakan2 = new Employees("hakan2", 30, 1500, 10);
    System.out.println(hakan2.getName() + " salary is " + hakan2.calculateTheSalary());
    System.out.println("********************");

    Developer hakan3 = new Developer("hakan3", 30, 1500, 10, 200, 10);
    System.out.println(hakan1.getName() + " salary is " + hakan3.calculateTheSalary());
    System.out.println("********************");

  }

}
