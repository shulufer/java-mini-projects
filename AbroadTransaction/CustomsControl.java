public class CustomsControl {
  public static void main(String[] args) {

    PersonFromTurkey hakan = new PersonFromTurkey("Hakan", "Ulufer", 11111111111L, false, true);
    PersonFromNetherlands pierre = new PersonFromNetherlands("Pierre", "Van Hooijdonk", 1111111, false, true);

    System.out.println(hakan.toString());
    System.out.println(pierre.toString());



  }
}
