import java.util.Date;

public class UnderGraduateStudent extends Student {



  public UnderGraduateStudent(int no, String name, int year, Date dob, String major) {
    super(no, name, year, dob, major);
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

}
