public class Driver {

  private String name;
  private int number;
  private Train train;




  public Driver(String name, int number) {
    this.name = name;
    this.number = number;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  public int getNumber() {
    return this.number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public Train getTrain() {
    return this.train;
  }

  public void setTrain(Train train) {
    this.train = train;
  }








}
