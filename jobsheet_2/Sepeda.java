public class Sepeda {
    float kecepatan;
    int gear;

    public Sepeda() {
        kecepatan = 0;
        gear = 0;
    }

    public Sepeda(float kecepatan, int gear) {
        this.kecepatan = kecepatan;
        this.gear = gear;
    }

    public void tambahKecepatan(int increment) {
        kecepatan += increment;

        if (kecepatan > 20) {
            kecepatan = 20;
        }
    }

    public void kurangiKecepatan(int decrement) {
        kecepatan -= decrement;

        if (kecepatan < 0) {
            kecepatan = 0;
        }
    }

    public void cetakInfo() {
        System.out.println("Kecepatan: " + kecepatan);
        System.out.println("Gear: " + gear);
    }
}