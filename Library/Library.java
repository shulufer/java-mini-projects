import java.util.Map;


public class Library {

  private int numberOfBook;
  private String name;
  private Map<String, Integer> bookGenresMap;



  public int getNumberOfBook() {
    return this.numberOfBook;
  }

  public void setNumberOfBook(int numberOfBook) {
    this.numberOfBook = numberOfBook;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Map<String,Integer> getBookGenresMap() {
    return this.bookGenresMap;
  }

  public void setBookGenresMap(Map<String,Integer> bookGenresMap) {
    this.bookGenresMap = bookGenresMap;
  }


}
