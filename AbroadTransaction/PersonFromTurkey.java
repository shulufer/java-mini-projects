
public class PersonFromTurkey implements PassaportTransaction{

  private String name;
  private String surname;
  private long citizenNumber;
  private boolean haveVisa;
  private boolean criminalReacord;
  private long min = 9_999_999_999L;
  private long max = 100_000_000_000L;


  public PersonFromTurkey(String name, String surname, long citizenNumber, boolean haveVisa, boolean criminalReacord) {
    this.name = name;
    this.surname = surname;
    if ((citizenNumber >  min) & (citizenNumber < max)) {
      this.citizenNumber = citizenNumber;
    }
    this.haveVisa = haveVisa;
    this.criminalReacord = criminalReacord;
  }



  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return this.surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public long getCitizenNumber() {
    return this.citizenNumber;
  }

  public void setCitizenNumber(int citizenNumber) {
    this.citizenNumber = citizenNumber;
  }


  @Override
  public void haveVisa() {
    if (haveVisa) {
      System.out.println("You have the visa");
    } else {
      System.out.println("You don't have visa. You can not go.");
    }
  }

  @Override
  public void criminalRecord() {
    if (criminalReacord) {
      System.out.println("You do not have criminal record. You can go");
    } else {
      System.out.println("You have criminal record. You can not go.");
    }
  }




}
