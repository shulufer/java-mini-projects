/**
 * Book
 */
public class Book {

  private String name;
  private Author author;
  private int page;
  private String type;
  private boolean isHardCover;
  private int currentPage;

  public Book(String name, Author author, int page, String type, boolean isHardCover, int currentPage) {
    this.name = name;
    author.setBook(this);
    this.page = page;
    this.type = type;
    this.isHardCover = isHardCover;

  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return
      " name='" + (this).getName();
  }

  public void setCurrentPage(int currentPage) {
    this.currentPage = currentPage;
  }

  public int getPage() {
    return page;
  }

  public void SetAuthor(Author author) {
    this.author = author;
  }

}
