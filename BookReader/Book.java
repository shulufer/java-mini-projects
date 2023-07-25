/**
 * Book
 */
public class Book {

  private String name;
  private Author author;
  private String title;
  private int page;
  private String type;
  private boolean isHardCover;
  private int currentPage;

  public Book(String name, Author author, String title, int page, String type, boolean isHardCover, int currentPage) {
    this.name = name;
    author.setBook(this);
    this.title = title;
    this.page = page;
    this.type = type;
    this.isHardCover = isHardCover;

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
