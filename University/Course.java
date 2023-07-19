/**
 * Course
 */
public class Course {

  private String name;

  private Students students;
  private Professor professor;
  private Classroom classroom;



  Course(String name, Professor proffessor, Classroom classroom, Students students) {
    this.name = name;
    this.professor = proffessor;
    this.classroom = classroom;
    this.students = students;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Students getStudents() {
    return this.students;
  }

  public void setStudents(Students students) {
    this.students = students;
  }

  public Professor getProfessor() {
    return this.professor;
  }

  public void setProfessor(Professor professor) {
    this.professor = professor;
  }

  public Classroom getClassroom() {
    return this.classroom;
  }

  public void setClassroom(Classroom classroom) {
    this.classroom = classroom;
  }


  @Override
  public String toString() {
    String s = new String();
    s += "Course info \n";
    s += "\n Course name:" + name;
    s += "\n Profesor name:" + professor.getName();
    s += "\n Class place:" + classroom.getno();
    s += "\n Class time:" + classroom.settimePeriod(classroom.getTime());
    return s;
  }


}
