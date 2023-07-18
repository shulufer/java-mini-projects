/**
 * Course
 */
public class Course {

  private String name;

  private Students[] students;
  private Professor professor;
  private Classroom classroom;



  Course(String name, Professor proffessor, Classroom classroom) {
    this.name = name;
    this.professor = proffessor;
    this.classroom = classroom;
    proffessor.setName("Hakan");
    classroom.setNo(1);
    classroom.settimePeriod(1);
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public String toString() {

    return ("Class name:" + course.getName());
  }


}
