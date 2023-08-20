import java.util.Date;

public class GraduateStudent extends Student {


  private String advisor;
  private String thesis;

  public GraduateStudent(int no, String name, int year, Date dob, String major, String thesis) {
    super(no, name, year, dob, major);
    this.thesis = thesis;
  }




  @Override
  public void study() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'study'");
  }

  @Override
  public void register() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'register'");
  }

  public void writeThesis(){
    System.out.println("Student has written thesis about " + thesis);
  }

}
