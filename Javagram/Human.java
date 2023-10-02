public class Human {

  String FirstName;
  String LastName;
  int age;
  String userName;
  String city;
  String country;


  public String getFirstName() {
    return this.FirstName;
  }

  public void setFirstName(String FirstName) {
    this.FirstName = FirstName;
  }

  public String getLastName() {
    return this.LastName;
  }

  public void setLastName(String LastName) {
    this.LastName = LastName;
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getUserName() {
    return this.userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getCity() {
    return this.city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getCountry() {
    return this.country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  @Override
  public String toString() {
    return "{" +
      " FirstName='" + getFirstName() + "'" +
      ", LastName='" + getLastName() + "'" +
      ", age='" + getAge() + "'" +
      ", userName='" + getUserName() + "'" +
      ", city='" + getCity() + "'" +
      ", country='" + getCountry() + "'" +
      "}";
  }

}
