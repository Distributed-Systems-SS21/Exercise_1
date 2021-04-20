public class Publication {

    private final String title;
    private final String language;
    private final double price;

    public Publication(String title, String language, double price) {
        this.title = title;
        this.language = language;
        this.price = price;
    }

    public void print() {
        System.out.println("title='" + title + '\'' +
                ", language='" + language + '\'' +
                ", price=" + price);
    }

}
