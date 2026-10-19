public class Pohon {
    private String jenisHama;
    private String jenisDaun;
    private String jenisAkar;

    // Constructor tanpa parameter
    public Pohon() {
        this(
            "Belum diketahui",
            "Belum diketahui",
            "Belum diketahui"
        );
    }

    // Constructor berparameter
    public Pohon(
        String jenisHama,
        String jenisDaun,
        String jenisAkar
    ) {
        this.jenisHama = jenisHama;
        this.jenisDaun = jenisDaun;
        this.jenisAkar = jenisAkar;
    }

    public String getJenisHama() {
        return jenisHama;
    }

    public String getJenisDaun() {
        return jenisDaun;
    }

    public String getJenisAkar() {
        return jenisAkar;
    }

    // Menampilkan informasi dasar pohon
    public String getInfoDasar() {
        return "Jenis hama : " + jenisHama + "\n"
             + "Jenis daun : " + jenisDaun + "\n"
             + "Jenis akar : " + jenisAkar;
    }

    // Method yang nantinya di-override oleh subclass
    public String caraPemanenan() {
        return "Cara pemanenan belum ditentukan.";
    }

    // Contoh method overloading
    public String caraPemanenan(String metode) {
        return "Keterangan metode pemanenan: " + metode;
    }
}
