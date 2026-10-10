public class BujurSangkar extends Bentuk {
    private double sisi;

    // Constructor
    public BujurSangkar(double sisi, String warna) {
        super(warna);
        this.sisi = sisi;
    }

    // Getter & Setter
    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    // Hitung Luas
    public double hitungLuas() {
        return sisi * sisi;
    }

    // Overriding printInfo
    @Override
    public void printInfo() {
        System.out.println("Bujursangkar berwarna " + getWarna() + ", luas = " + hitungLuas());
    }
}