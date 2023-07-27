/**
 * Reader
 */
public class Reader {

  private String name;
  private int age;
  private char sex;
  private Book book;
  private Book[] readBook = new Book[100];
  int howManyBook;


  public Reader(String name, int age, char sex) {
    this.name = name;
    this.age = age;
    this.sex = sex;
  }

  public void setBook(Book book) {
    this.book = book;
  }

  public Book getBook() {
    return book;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public char getSex() {
    return this.sex;
  }

  public void setSex(char sex) {
    this.sex = sex;
  }

  public Book[] getReadBook() {
    return this.readBook;

  }

  public void setReadBook(Book[] readBook) {
    this.readBook = readBook;
  }

  public int getHowManyBook() {
    return this.howManyBook;
  }

  public void setHowManyBook(int howManyBook) {
    this.howManyBook = howManyBook;
  }


  @Override
  public String toString() {
    return "Reader Info : \n" +
      " name=" + getName() + "\n" +
      " age=" + getAge() + "\n" +
      " sex=" + getSex() + "\n" +
      " finished books=" + getReadBook() + "\n" +
      " howManyBook=" + getHowManyBook();
  }


  public void read(Book book, int page) {
    setBook(book);
    if(page < book.getPage()) {
      book.setCurrentPage(page);
    }
  }

  public void finishTheBook(Book book) {
    readBook[howManyBook] = book;
    howManyBook++;
  }


}
