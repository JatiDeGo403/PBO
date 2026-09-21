public class Pasien{
    private String noRekamMedis;
    private String nama;

    public String getNoRekamMedis(){
        return noRekamMedis;
    }

    public void setNoRekamMedis(String noRekamMedis){
        this.noRekamMedis = noRekamMedis;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public Pasien(String noRekamMedis, String nama){
        String info = "";
        info += "no rekam medis    : "+ this.noRekamMedis+ "/n";
        info += "nama              : "+ this.nama+ "/n";
        info += "/n";
        return info;
    }

    public Pasien(String noRekamMedis, String nama){
        this.noRekamMedis = noRekamMedis;
        this.nama = nama;
        this.riwayatKonsultasi = new arrayList<Konsultasi>();
    }
}