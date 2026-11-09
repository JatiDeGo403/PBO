public class MainPohon {
    public static void main(String[] args) {
        
        PohonJati pohonJati = new PohonJati(
            "Ulat penggerek batang",
            "Daun tunggal berbentuk lonjong",
            "Akar tunggang",
            "Meja, kursi, dan lemari"
        );

        
        PohonPisang pohonPisang = new PohonPisang(
            "Kutu daun dan penggerek batang",
            "Daun lebar memanjang",
            "Akar serabut",
            "Pisang goreng dan kolak"
        );

        
        System.out.println("     INFORMASI POHON JATI    ");
        System.out.println(pohonJati.getInfoDasar());
        System.out.println("Jenis kerajinan : "+ pohonJati.getJenisKerajinan());
        System.out.println("Cara pemanenan  : "+ pohonJati.caraPemanenan());
        System.out.println("cara pemanenan: " +pohonJati.caraPemanenan(" ditebang menggunakan kapak"));
        System.out.println();

        System.out.println("    INFORMASI POHON PISANG      ");
        System.out.println(pohonPisang.getInfoDasar());
        System.out.println("Jenis makanan   : "+ pohonPisang.getJenisMakanan());
        System.out.println("Cara pemanenan  : "+ pohonPisang.caraPemanenan());

        System.out.println(pohonPisang.caraPemanenan("memotong tandan buah"));
    }
}
