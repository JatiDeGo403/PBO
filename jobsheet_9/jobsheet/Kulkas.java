public class Kulkas extends AlatElektronik {
    public int jumlahPintu;

    @Override
    public String getInfo() {
        return "=== INFORMASI KULKAS ===\n" +
               super.getInfo() +
               "\nJumlah Pintu: " + jumlahPintu;
    }
}