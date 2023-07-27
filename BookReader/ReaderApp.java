public class ReaderApp {
  public static void main(String[] args) {

    Author jKRowling = new Author("J. K. Rowling");

    Book hp1 = new Book("Harry Potter and the Philosopher's Stone", jKRowling, 224, "Fantastic", false, 0);

    Reader hakan = new Reader("Hakan", 32, 'm');

    hakan.finishTheBook(hp1);

    System.out.println(hakan.toString());

    Book hp2 = new Book("Harry Potter and the Chamber of Secrets", jKRowling, 400, "Fantastic", false, 0);

    hakan.finishTheBook(hp2);

    System.out.println(hakan.toString());
    System.out.println(hakan.getReadBooks());
  }
}
