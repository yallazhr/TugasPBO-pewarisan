public class Lingkaran extends Bentuk {
    protected double radius;
    public static final double PHI = 3.14159; // PHI sebagai konstanta kelas

    // Constructor
    public Lingkaran(double radius, String warna) {
        super(warna);
        this.radius = radius;
    }

    // Getter & Setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Hitung Luas
    public double hitungLuas() {
        return PHI * radius * radius;
    }

    // Overriding printInfo
    @Override
    public void printInfo() {
        System.out.println("Lingkaran " + getWarna() + ", luas = " + hitungLuas());
    }
}