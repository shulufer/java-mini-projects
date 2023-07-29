/**
 * Point
 */
public class Point {

  private int x;
  private int y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return this.x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return this.y;
  }

  public void setY(int y) {
    this.y = y;
  }


  @Override
  public String toString() {
    return "{" +
      " x='" + getX() + "'" +
      ", y='" + getY() + "'" +
      "}";
  }

  public double distanceToOrigin() {
    double distance;
    distance = Math.sqrt((this.x * this.x) + (this.y * this.y));
    return distance;
  }

  public void move(int x1, int y1) {
    this.x += x1;
    this.y += y1;
  }


}
