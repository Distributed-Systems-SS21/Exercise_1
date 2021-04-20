public class Book extends Publication {

    private String author;
    private String isbn;

    public Book(String title, String language, double price, String author, String isbn) {
        super(title, language, price);
        this.author = author;
        this.isbn = isbn;
    }

    public void print() {
        super.print();
        System.out.println("\t,author='" + author + '\'' +
                ", isbn='" + isbn + '\'' );
    }

}
