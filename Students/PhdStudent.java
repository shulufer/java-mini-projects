import java.util.Calendar.Builder;

public class PhdStudent extends GraduateStudent{

  boolean quallifyingExamTaken;

  public PhdStudent(int no, String name, int year, Builder dob, String major, String thesis, boolean quallifyingExamTaken) {
    super(no, name, year, dob, major, thesis);
    this.quallifyingExamTaken = quallifyingExamTaken;

  }



}
