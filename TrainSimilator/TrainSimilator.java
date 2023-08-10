public class TrainSimilator {

  public static void main(String[] args) {


    Driver twentyEight = new Driver("Hakan", 28);
    Train twentyTwoFiftyTwo = new Train(null, twentyEight);
    String zandvoortAnnZee = new String("Zandvoort aan Zee");
    twentyTwoFiftyTwo.addStop(zandvoortAnnZee);
    twentyTwoFiftyTwo.addMultiStops("Overveen", "Haarlem", "Haarlem Spaarnwode", "Halfweg-Zwanenburg", "Amsterdam Sloterdjik", "Amsterdam Centraal");

    System.out.println(twentyTwoFiftyTwo.getStops());





  }

}
