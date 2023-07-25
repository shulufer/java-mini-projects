/**
 * Author
 */
public class Author {

  private String name;
  private Book book;


  public Author(String name) {
    this.name = name;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setBook(Book book) {
    this.book = book;
  }

}
