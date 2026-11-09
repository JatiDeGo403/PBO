public class PohonJati extends Pohon {
    private String jenisKerajinan;

    public PohonJati() {
        super();
        this.jenisKerajinan = "Belum ditentukan";
    }

    public PohonJati(String jenisHama, String jenisDaun, String jenisAkar, String jenisKerajinan) {
        super(jenisHama, jenisDaun, jenisAkar);
        this.jenisKerajinan = jenisKerajinan;
    }

    public String getJenisKerajinan() {
        return jenisKerajinan;
    }

    @Override
    public String memanen() {
        return "Pohon jati dipanen dengan cara ditebang.";
    }

    @Override 
    public String memanen(String metode){
        return "Pohon jati ditebang menggunakan kapak";
    }
}
