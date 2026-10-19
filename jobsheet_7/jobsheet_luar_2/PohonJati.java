public class PohonJati extends Pohon {
    private String jenisKerajinan;

    // Constructor tanpa parameter
    public PohonJati() {
        super();
        this.jenisKerajinan = "Belum ditentukan";
    }

    // Constructor berparameter
    public PohonJati(
        String jenisHama,
        String jenisDaun,
        String jenisAkar,
        String jenisKerajinan
    ) {
        super(jenisHama, jenisDaun, jenisAkar);

        this.jenisKerajinan = jenisKerajinan;
    }

    public String getJenisKerajinan() {
        return jenisKerajinan;
    }

    // Method overriding
    @Override
    public String caraPemanenan() {
        return "Pohon jati dipanen dengan cara ditebang.";
    }
}
