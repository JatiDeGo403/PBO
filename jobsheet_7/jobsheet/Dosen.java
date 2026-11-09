public class Dosen extends Pegawai {
    public String nidn;

    public Dosen() {
        super();
        this.nidn = "Belum diisi";

        System.out.println(
            "Constructor Dosen tanpa parameter dipanggil."
        );
    }

    public Dosen(
        String nip, String nama, double gaji, String nidn
    ) {
        super(nip, nama, gaji);
        this.nidn = nidn;

        System.out.println(
            "Constructor Dosen berparameter dipanggil."
        );
    }

    @Override
    public String getInfo() {
        return super.getInfo()
             + "NIDN     : " + nidn + "\n";
    }
}