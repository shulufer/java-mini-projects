import java.util.LinkedList;

public class Train {

  private LinkedList<String> stops;

  private Driver driver;

  public Train(LinkedList<String> stops, Driver driver) {
    this.stops = stops;
    driver.setTrain(this);
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






}
