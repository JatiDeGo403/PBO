import java.time.LocalDate;

public class Konsultasi{
    private LocalDate tanggal;
    private Pegawai dokter;
    private Pegawai perawat;

    public LocalDate getTanggal(){
        return tanggal;
    }

    public void setTanggal(String tanggal){
        this.tanggal = tanggal;
    }

    public Pegawai getDokter(){
        return dokter;
    }

    public void setDokter(Pegawai dokter){
        this.dokter = dokter;
    }

    public Pegawai getPerawat(){
        return perawat;
    }

    public void setPerawat(Pegawai perawat){
        this.perawat = perawat;
    }

    public String getInfo(){
        String info = "";
        info += "tanggal    : "+ tanggal+ "/n";
        info += "Dokter              : "+ dokter.getInfo()+ "/n";
        info += "Perawat              : "+ perawat.getInfo()+ "/n";
        info += "/n";
        return info;
    }

    public void tambahKonsultasi(LocalDate tanggal, Pegawai Dokter, Pegawai perawat){
        Konsultasi konsultasi = new Konsultasi();
        konsultasi.setTanggal(tanggal);
        konsultasi.setDokter(dokter);
        konsultasi.setPerawat(perawat);
        riwayatKonsultasi.add(konsultasi);
    }

    public String getInfo(){
        String info= "";
        info += "no rekam medis    : "+ this.noRekamMedis+ "/n";
        info += "nama              : "+ this.nama+ "/n";

        if(!riwayatKonsultasi.isEmpty()){
            info += "Riwayat Konsultasi :/n"

            for(Konsultasi konsultasi : riwayatKonsultasi){
                info += konsultasi.getInfo();
            }
        }else{
            info += "Belum ada riwayat konsultasi";
        }

        info += "/n";

        return info;
    }
}