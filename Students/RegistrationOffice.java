import java.util.LinkedList;

public class RegistrationOffice {

  private LinkedList<Student> students = new LinkedList<Student>();
  private int i;

  public RegistrationOffice() {
  }

  private void setStudents(Student student) {
    this.students.add(i, student);
    i++;
  }

  public int getI() {
    return i;
  }


  public Student getAStudent(int i){
    Student student = students.get(i);
    return student;
  }

  public void registerStudent(Student student){
    RegistrationOffice register = new RegistrationOffice();
    if (student instanceof PhdStudent){
      System.out.println("Php student registered.");
      register.setStudents(student);
    } else if (student instanceof MasterStudent) {
      System.out.println("Master student registered.");
      register.setStudents(student);
    } else if (student instanceof GraduateStudent) {
      System.out.println("Graduate student registered.");
      register.setStudents(student);
    } else if (student instanceof VocationalStudent) {
      System.out.println("Vocational student registered.");
      register.setStudents(student);
    } else if (student instanceof UnderGraduateStudent){
      System.out.println("Student registered.");
      register.setStudents(student);
    }


  }


}
