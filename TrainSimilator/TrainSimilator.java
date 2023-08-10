public class TrainSimilator {

  public static void main(String[] args) {


    Driver twentyEight = new Driver("Hakan", 28);
    Train twentyTwoFiftyTwo = new Train(twentyEight, "Zandvoort aan Zee", 2252);
    // String zandvoortAnnZee = new String("Zandvoort aan Zee");
    // twentyTwoFiftyTwo.addStop(zandvoortAnnZee);
    twentyTwoFiftyTwo.addMultiStops("Overveen", "Haarlem", "Haarlem Spaarnwode", "Halfweg-Zwanenburg", "Amsterdam Sloterdjik", "Amsterdam Centraal");

    System.out.println(twentyTwoFiftyTwo.getStops());
    System.out.println(twentyTwoFiftyTwo.toString());
    System.out.println(twentyTwoFiftyTwo.whereIsTrain());
    System.out.println(twentyTwoFiftyTwo.trainMove(1));
    System.out.println(twentyTwoFiftyTwo.whereIsTrain());
    System.out.println(twentyTwoFiftyTwo.trainMove(1));
    System.out.println(twentyTwoFiftyTwo.whereIsTrain());






  }

}
