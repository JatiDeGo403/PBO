public class SepedaMain {
    public static void main(String[] args) {

        Sepeda sepeda1 = new Sepeda();

        Sepeda sepeda2 = new Sepeda(10, 2);

        System.out.println("SEPEDA 1");
        sepeda1.cetakInfo();

        System.out.println("SEPEDA 2");
        sepeda2.cetakInfo();

        sepeda1.gear = 3;
        sepeda1.tambahKecepatan(5);

        System.out.println(" SEPEDA 1 SETELAH MODIFIKASI");
        sepeda1.cetakInfo();

        sepeda2.tambahKecepatan(5);

        System.out.println("SEPEDA 2 SETELAH TAMBAH KECEPATAN");
        sepeda2.cetakInfo();

        sepeda2.kurangiKecepatan(20);

        System.out.println("SEPEDA 2 SETELAH KURANGI KECEPATAN");
        sepeda2.cetakInfo();
    }
}