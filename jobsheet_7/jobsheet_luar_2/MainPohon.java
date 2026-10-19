public class MainPohon {
    public static void main(String[] args) {

        // Objek pertama: pohon jati
        PohonJati pohonJati = new PohonJati(
            "Ulat penggerek batang",
            "Daun tunggal berbentuk lonjong",
            "Akar tunggang",
            "Meja, kursi, dan lemari"
        );

        // Objek kedua: pohon pisang
        PohonPisang pohonPisang = new PohonPisang(
            "Kutu daun dan penggerek batang",
            "Daun lebar memanjang",
            "Akar serabut",
            "Pisang goreng dan kolak"
        );

        // Menampilkan informasi pohon jati
        System.out.println("===== INFORMASI POHON JATI =====");
        System.out.println(pohonJati.getInfoDasar());
        System.out.println(
            "Jenis kerajinan : "
            + pohonJati.getJenisKerajinan()
        );
        System.out.println(
            "Cara pemanenan  : "
            + pohonJati.caraPemanenan()
        );

        // Memanggil method overloading
        System.out.println(
            pohonJati.caraPemanenan(
                "menggunakan alat tebang yang sesuai"
            )
        );

        System.out.println();

        // Menampilkan informasi pohon pisang
        System.out.println("===== INFORMASI POHON PISANG =====");
        System.out.println(pohonPisang.getInfoDasar());
        System.out.println(
            "Jenis makanan   : "
            + pohonPisang.getJenisMakanan()
        );
        System.out.println(
            "Cara pemanenan  : "
            + pohonPisang.caraPemanenan()
        );

        // Memanggil method overloading
        System.out.println(
            pohonPisang.caraPemanenan(
                "memotong tandan buah"
            )
        );
    }
}
