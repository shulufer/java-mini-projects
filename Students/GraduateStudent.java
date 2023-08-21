import java.util.Calendar.Builder;

public class GraduateStudent extends Student {


  private String advisor;
  private String thesis;

  public GraduateStudent(int no, String name, int year, Builder dob, String major, String thesis) {
    super(no, name, year, dob, major);
    this.thesis = thesis;
  }

  public void setAdvisor(String advisor) {
    this.advisor = advisor;
  }

  public String getAdvisor() {
    return advisor;
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

  public void meetWithAdvisor() {
    RegistrationOffice registrationOffice1 = new RegistrationOffice();

    while (true) {
      int i = (int) (Math.random() * (registrationOffice1.getI()));
      if (registrationOffice1.getAStudent(i) instanceof PhdStudent) {
        System.out.println("Your advisor is " + registrationOffice1.getAStudent(i).toString());
        setAdvisor(registrationOffice1.getAStudent(i).getName());
        break;
      }

    }
  }

}
