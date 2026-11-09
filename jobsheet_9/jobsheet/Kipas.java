public class Kipas extends AlatElektronik {
    public String jenis;

    @Override
    public String getInfo() {
        return "=== INFORMASI KIPAS ===\n" +
               super.getInfo() +
               "\nJenis: " + jenis;
    }
}