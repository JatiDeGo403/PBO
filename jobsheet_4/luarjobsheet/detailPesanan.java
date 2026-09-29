// File: DetailPesanan.java

import java.time.LocalDate;

public class detailPesanan {
    private String idPesanan;
    private LocalDate tanggal; 
    private Barang barang;
    private int jumlahBarang;
    private double jumlahHarusDibayar;

    public detailPesanan(String idPesanan, LocalDate tanggal, Barang barang, int jumlahBarang) {
        this.idPesanan = idPesanan;
        this.tanggal = tanggal;
        this.barang = barang;
        this.jumlahBarang = jumlahBarang;
        
        // Kalkulasi jumlah yang harus dibayar: harga barang * jumlah yang dibeli
        this.jumlahHarusDibayar = barang.getHarga() * jumlahBarang;
        
        // Perbarui stok ketersediaan barang
        this.barang.updateKetersediaan(jumlahBarang);
    }

    public String getIdPesanan() { 
        return idPesanan; 
    }
    public LocalDate getTanggal() { 
        return tanggal; 
    }
    public Barang getBarang() { 
        return barang; 
    }
    public int getJumlahBarang() { 
        return jumlahBarang; 
    }
    public double getJumlahHarusDibayar() { 
        return jumlahHarusDibayar; 
    }
}