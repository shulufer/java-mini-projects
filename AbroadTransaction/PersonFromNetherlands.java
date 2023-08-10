public class PersonFromNetherlands implements PassaportTransaction{

  private String name;
  private String surname;
  private int bsn;
  private boolean haveVisa;
  private boolean criminalReacord;


  public PersonFromNetherlands(String name, String surname, int bsn, boolean haveVisa, boolean criminalReacord) {
    this.name = name;
    this.surname = surname;
    if ((bsn > 999_999) & (bsn < 10_000_000)) {
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
  public String haveVisa() {
    String s;
    if (haveVisa) {
      s = "You have the visa";
    } else {
      s = "You don't have visa. You can not go.";
    }
    return s;
  }

  @Override
  public String criminalRecord() {
    String s;
    if (criminalReacord) {
      s ="You do not have criminal record. You can go";
    } else {
      s = "You have criminal record. You can not go.";
    }
    return s;
  }

  public String toString() {
    String s;
    s = "\nName: " + name +
        "\nsurname: " + surname +
        "\nBSN Number: " + bsn +
        "\n" + haveVisa() +
        "\n" + criminalRecord();
    return s;
  }





}
