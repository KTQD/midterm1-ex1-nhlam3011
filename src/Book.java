public class Book extends Item {
    private String author;
    private int numberOfPages;
    private String genre;

    public Book(String name, String description, String ID, float price, String author, int numberOfPages, String genre) {
        super(name, description, ID, price);
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.genre = genre;
    }

    @Override
    public void showInfo() {
        System.out.println("Ten sach: " + name);
        System.out.println("Mo ta: " + getDescription());
        System.out.println("ID: " + ID);
        System.out.println("Gia tien: " + price + " VND");
        System.out.println("Tac gia: " + author);
        System.out.println("So trang: " + numberOfPages);
        System.out.println("The loai: " + genre);
    }
}
