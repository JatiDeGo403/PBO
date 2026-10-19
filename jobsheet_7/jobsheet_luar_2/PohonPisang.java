public class PohonPisang extends Pohon {
    private String jenisMakanan;

    // Constructor tanpa parameter
    public PohonPisang() {
        super();
        this.jenisMakanan = "Belum ditentukan";
    }

    // Constructor berparameter
    public PohonPisang(
        String jenisHama,
        String jenisDaun,
        String jenisAkar,
        String jenisMakanan
    ) {
        super(jenisHama, jenisDaun, jenisAkar);

        this.jenisMakanan = jenisMakanan;
    }

    public String getJenisMakanan() {
        return jenisMakanan;
    }

    // Method overriding
    @Override
    public String caraPemanenan() {
        return "Buah pisang dipanen dengan memotong tandan buahnya.";
    }
}
