import java.util.Calendar.Builder;

public abstract class Student implements Students {

  private int no;
  private String name;
  private int year;
  private Builder dob;
  private String major;

  public Student(int no, String name, int year, Builder dob, String major) {
    this.no = no;
    this.name = name;
    this.year = year;
    this.dob = dob;
    this.major = major;
  }

  public int getNo() {
    return this.no;
  }

  public String getName() {
    return this.name;
  }

  public int getYear() {
    return this.year;
  }

  public Builder getDob() {
    return this.dob;
  }

  public String getMajor() {
    return this.major;
  }

  @Override
  public void study() {
    System.out.println("Student is working");
  }

  // @Override
  // public void register() {



  // }




  @Override
  public String toString() {
    return "{" +
      " no='" + getNo() + "'" +
      ", name='" + getName() + "'" +
      ", year='" + getYear() + "'" +
      ", dob='" + getDob() + "'" +
      ", major='" + getMajor() + "'" +
      "}";
  }



}
