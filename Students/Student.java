import java.util.Date;

public abstract class Student implements Students {

  private int no;
  private String name;
  private int year;
  private Date dob;
  private String major;

  public Student(int no, String name, int year, Date dob, String major) {
    this.no = no;
    this.name = name;
    this.year = year;
    this.dob = dob;
    this.major = major;
  }


  @Override
  public void study() {
    System.out.println("Student is working");
  }


  public String getName() {
    return null;
  }







}
