/**
 * Reader
 */
public class Reader {

  private String name;
  private int age;
  private char sex;
  private Book book;
  private Book[] readBook;


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

  public void read(Book book, int page) {
    setBook(book);
    if(page < book.getPage()) {
      book.setCurrentPage(page);
    }
  }

  public void finishTheBook(Book book) {
    readBook[readBook.length] = book;
  }


}
