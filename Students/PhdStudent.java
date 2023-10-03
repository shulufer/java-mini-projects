import java.util.Date;

public class PhdStudent extends GraduateStudent{

  boolean quallifyingExamTaken;

  public PhdStudent(int no, String name, int year, Date dob, String major, String thesis, boolean quallifyingExamTaken) {
    super(no, name, year, dob, major, thesis);
    this.quallifyingExamTaken = quallifyingExamTaken;

  }



}
