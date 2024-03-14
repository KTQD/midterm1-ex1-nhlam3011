// Main.java
public class Main {
    public static void main(String[] args) {
        MP3 mp3 = new MP3("May phat MP3", "May phat nhac cam tay khong day", "MP3_011", 500f, 180);
        mp3.showInfo();

        System.out.println();

        Book book = new Book("Thiet ke web co ban", "Day ngon ngu thiet ke web co ban cho nguoi moi", "BK-3001", 250.000f, "Nhat Lam", 456, "Lap Trinh");
        book.showInfo();
    }
}
