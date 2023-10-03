import java.util.Date;

public class School {

  public static void main(String[] args) {
    RegistrationOffice registrationOffice1 = new RegistrationOffice();
    Date birth = new Date();

    Student s1212 = new UnderGraduateStudent(1212, "hakan", 1, birth , "CS");
    registrationOffice1.registerStudent(s1212);

    System.out.println(s1212.toString());

  }

}
