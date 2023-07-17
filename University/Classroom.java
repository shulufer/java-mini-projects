/**
 * Classroom
 */
public class Classroom {

  private int no;
  private int time;

  Classroom(int no, int time) {
    this.no = no;
    this.time = time;
  }


  public int getNo() {
    return this.no;
  }

  public void setNo(int no) {
    this.no = no;
  }

  public int getTime() {
    return this.time;
  }


  public String settimePeriod(int time) {
    this.time = time;
    String timeLine;
    switch (time) {
      case 1:
        timeLine = "08:00 - 11:00";
        break;
      case 2:
        timeLine = "12:00 - 15:00";
        break;
      case 3:
        timeLine = "16:00 - 19:00";
        break;

      default:
        timeLine = "Timeline is not set";
        break;
    }
    return timeLine;
  }



}
