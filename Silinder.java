public class Silinder extends Lingkaran {
    private double tinggi;

    // Constructor
    public Silinder(double tinggi, double radius, String warna) {
        super(radius, warna);
        this.tinggi = tinggi;
    }

    // Getter & Setter
    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    // Hitung Volume (menggunakan hitungLuas() dari superclass Lingkaran)
    public double hitungVolume() {
        return hitungLuas() * tinggi;
    }

    // Overriding printInfo
    @Override
    public void printInfo() {
        System.out.println("Silinder warna " + getWarna() + ", volume = " + hitungVolume());
    }
}