public class MP3 extends Item {
    private int duration;

    public MP3(String name, String description, String ID, float price, int duration) {
        super(name, description, ID, price);
        this.duration = duration;
    }

    @Override
    public void showInfo() {
        System.out.println("Ten may MP3: " + name);
        System.out.println("Mo ta: " + getDescription());
        System.out.println("ID: " + ID);
        System.out.println("Gia tien: " + price + " $");
        System.out.println("Thoi luong: " + duration + " phut");
    }
}
