public class Pegawai {
    public String nip;
    public String nama;
    public double gaji;

    public Pegawai() {
        this.nip = "Belum diisi";
        this.nama = "Belum diisi";
        this.gaji = 0.0;

        System.out.println(
            "Constructor Pegawai tanpa parameter dipanggil."
        );
    }

    public Pegawai(String nip, String nama, double gaji) {
        this.nip = nip;
        this.nama = nama;
        this.gaji = gaji;

        System.out.println(
            "Constructor Pegawai berparameter dipanggil."
        );
    }

    public String getInfo() {
        return "NIP      : " + nip + "\n"
             + "Nama     : " + nama + "\n"
             + "Gaji     : " + gaji + "\n";
    }
}