public class Main {
    public static void main(String[] args) {

        // Membuat objek Kulkas
        Kulkas kulkas1 = new Kulkas();

        kulkas1.merk = "Samsung";
        kulkas1.harga = 3500000;
        kulkas1.warna = "Silver";
        kulkas1.jumlahPintu = 2;

        // Membuat objek TV
        TV tv1 = new TV();

        tv1.merk = "LG";
        tv1.harga = 4500000;
        tv1.warna = "Hitam";
        tv1.jenisLayar = "LED";
        tv1.volume = 20;

        // Menampilkan informasi objek
        System.out.println(kulkas1.getInfo());

        System.out.println();

        System.out.println(tv1.getInfo());
    }
}