public class MainPohon {
    public static void main(String[] args) {
        
        /* Pohon pohon1 = new Pohon() {
        }; 
        pohon1.getInfoDasar();
        */
        
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
        System.out.println("Cara pemanenan  : "+ pohonJati.memanen());
        System.out.println("cara memanen: " +pohonJati.memanen(" "));
        System.out.println();

        System.out.println("    INFORMASI POHON PISANG      ");
        System.out.println(pohonPisang.getInfoDasar());
        System.out.println("Jenis makanan   : "+ pohonPisang.getJenisMakanan());
        System.out.println("Cara pemanenan  : "+ pohonPisang.memanen());
        System.out.println("cara memanen: " + pohonPisang.memanen(" "));
    }
}
