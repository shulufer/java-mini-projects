import java.util.LinkedList;

public class Train {

  private LinkedList<String> stops = new LinkedList<>();
  private String firstStop;
  private int number;
  private int station = 0;

  private Driver driver;

  public Train(Driver driver, String firstStop, int number) {
    driver.setTrain(this);
    this.driver = driver;
    this.firstStop = firstStop;
    stops.add(this.firstStop);
    this.number = number;
  }

  public LinkedList<String> getStops() {
    return stops;
  }

  public void addStop(String stop){
    this.stops.add(stop);
  }

  public void addMultiStops(String ... nameStop) {
    for (int i = 0; i < nameStop.length; i++) {
      stops.add(nameStop[i]);
    }
  }

  public void setFirstStop(String firstStop) {
    this.firstStop = firstStop;
  }

  public String trainMove(int station){
    this.station += station;
    return "Train is moving to " + stops.get(this.station)+ " station.";
  }

  public String whereIsTrain() {
    return "Train is in " + stops.get(this.station) + " station.";
  }

  public String toString() {
    String s;
    s = "Train: " + this.number +
        "\nDriver: " + this.driver.getName() +
        "\nFrom: " + this.firstStop +
        "\nTo: " + stops.getLast();


    return s;
  }







}
