// File: Pembeli.java

import java.util.ArrayList;

public class Pembeli {
    private String idPembeli;
    private String nama;
    private ArrayList<detailPesanan> rincianDibeli;

    public Pembeli(String idPembeli, String nama) {
        this.idPembeli = idPembeli;
        this.nama = nama;
        this.rincianDibeli = new ArrayList<>(); // Inisialisasi ArrayList kosong
    }

    public String getIdPembeli() { return idPembeli; }
    public String getNama() { return nama; }
    public ArrayList<detailPesanan> getRincianDibeli() { return rincianDibeli; }

    public void tambahRincian(detailPesanan detail) {
        this.rincianDibeli.add(detail);
    }
}