/**
 * Candidate
 */
public abstract class Candidate implements PointCalculater {

    String name;
    int mathTure;
    int mathFalse;
    int verbalTrue;
    int verbalFalse;
    int cultureTrue;
    int cultureFalse;
    int scienceTrue;
    int scienceFalse;
    int numericalPoint;
    int equalAgilityPoint;
    int verbalPoint;
    int math;
    int culture;
    int verbal;
    int science;


    public int numericalPoint() {

      int point = (mathScore() * 5) + (verbalScore() * 3) + (culture * 1) + (science * 5);
      return point;
    }

    public int equalAgilityPoint(){
      int point = (math * 5) + (verbal * 5) + (culture * 3) + (science * 1);
      return point;
    }

    public int verbalPoint() {
      int point = (math * 3) + (verbal * 5) + (culture * 5) + (science * 1);
      return point;
    }

    public int mathScore(){
      math = (mathTure * 4) - mathFalse;
      return math;
    }

    public int verbalScore(){
      verbal = (verbalTrue * 4) - verbalFalse;
      return verbal;
    }

    public int cultureScore(){
      culture = (cultureTrue * 4) - cultureFalse;
      return culture;

    }

    public int scienceScore(){
      science = (scienceTrue * 4) - scienceFalse;
      return science;
    }

    public int getNumericalPoint() {
      return numericalPoint;
    }
    public int getEqualAgilityPoint() {
      return equalAgilityPoint;
    }

    public int getVerbalPoint() {
      return verbalPoint;
    }


  @Override
  public String toString() {
    return "{" +
      " name='" + getName() + "'" +
      ", numericalPoint='" + getNumericalPoint() + "'" +
      ", equalAgilityPoint='" + getEqualAgilityPoint() + "'" +
      ", verbalPoint='" + getVerbalPoint() + "'" +
      "}";
  }

  private String getName() {
    return name;
  }

  // public void allPoint(){

  // }


}
