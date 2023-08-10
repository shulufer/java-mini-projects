
public class PersonFromTurkey implements PassaportTransaction{

  private String name;
  private String surname;
  private int citizenNumber;
  private boolean haveVisa;
  private boolean criminalReacord;


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

  public int getCitizenNumber() {
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
