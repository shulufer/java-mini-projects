/**
 * Autumn20232024
 */
public class Autumn20232024 {

  public static void main(String[] args) {

    Professor hakan = new Professor("Hakan");
    Classroom class100 = new Classroom(100, 1);
    Students hakan2 = new Students("Hakan", 1111);

    Course course = new Course("Java101", hakan, class100, hakan2);

    System.out.println(course.toString());

    // Course java101 = new Course();
    // System.out.println(java101.toString());

    // Course math101 = new Course();
    // System.out.println(math101.toString());

    // Course sql = new Course();
    // System.out.println(sql.toString());
  }

}
