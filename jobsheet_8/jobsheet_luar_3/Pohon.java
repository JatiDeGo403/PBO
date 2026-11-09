public abstract class Pohon {
    private String jenisHama;
    private String jenisDaun;
    private String jenisAkar;

    public Pohon() {}

    public Pohon(String jenisHama, String jenisDaun, String jenisAkar) {
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

    public String getInfoDasar() {
        return "Jenis hama : " + jenisHama + "\n"
        + "Jenis daun : " + jenisDaun + "\n"
        + "Jenis akar : " + jenisAkar;
    }

    public abstract String memanen();

    public abstract String memanen(String metode);
}
