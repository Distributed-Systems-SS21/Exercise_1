public class Publication {

    protected String title;
    protected String language;
    protected double price;

    public Publication(String title, String language, double price) {
        this.title = title;
        this.language = language;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Publication{" +
                "title='" + title + '\'' +
                ", language='" + language + '\'' +
                ", price=" + price +
                '}';
    }
}
