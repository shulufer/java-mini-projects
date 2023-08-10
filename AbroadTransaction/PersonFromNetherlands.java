public class PersonFromNetherlands implements PassaportTransaction{

  private String name;
  private String surname;
  private int bsn;
  private boolean haveVisa;
  private boolean criminalReacord;


  public PersonFromNetherlands(String name, String surname, int bsn, boolean haveVisa, boolean criminalReacord) {
    this.name = name;
    this.surname = surname;
    if ((bsn > 999999) & (bsn < 10000000)) {
      this.bsn = bsn;
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

  public int getBsn() {
    return this.bsn;
  }

  public void setBsn(int bsn) {
    this.bsn = bsn;
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
