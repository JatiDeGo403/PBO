import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
         
        Barang sawit = new Barang("B01", "sawit", 100, 5000);
        Barang minyak_sawit = new Barang("B02", "minyak sawit", 50, 21000);
        Barang E50 = new Barang("B03", "E50 ", 25, 6800);
    
        
        sawit.updateHarga(7000);

        // Inisialisasi objek Pembeli
        Pembeli ghost = new Pembeli("404", "ghost");
        Pembeli dewojenenge = new Pembeli("403", "dewojenenge");

        LocalDate hariIni = LocalDate.now();

        // apalah satu
        ghost.tambahRincian(new detailPesanan("P-001", hariIni, sawit, 2));
        ghost.tambahRincian(new detailPesanan("P-002", hariIni, minyak_sawit, 2));
        ghost.tambahRincian(new detailPesanan("P-003", hariIni, E50, 2));

        // apalah satu
        dewojenenge.tambahRincian(new detailPesanan("P-004", hariIni, sawit, 2));
        dewojenenge.tambahRincian(new detailPesanan("P-005", hariIni, minyak_sawit, 2));
        dewojenenge.tambahRincian(new detailPesanan("P-006", hariIni, E50, 2));

        cetakStrukPembeli(ghost);
        cetakStrukPembeli(dewojenenge);
        
        System.out.println(" SISA STOK ");
        System.out.println(sawit.getNamaBarang() + ": " + sawit.getKetersediaanBarang());
        System.out.println(minyak_sawit.getNamaBarang() + ": " + minyak_sawit.getKetersediaanBarang());
        System.out.println(E50.getNamaBarang() + ": " + E50.getKetersediaanBarang());
    }

        private static void cetakStrukPembeli(Pembeli pembeli) {
        System.out.println("ID Pembeli   : " + pembeli.getIdPembeli());
        System.out.println("Nama Pembeli : " + pembeli.getNama());
        System.out.println("Rincian Pesanan:");
        
        double totalBelanja = 0;
        
        for (detailPesanan dp : pembeli.getRincianDibeli()) {
            System.out.println(" - " + dp.getBarang().getNamaBarang() + 
                               " (Qty: " + dp.getJumlahBarang() + 
                               ") - Tanggal: " + dp.getTanggal() + 
                               " - Subtotal: Rp" + dp.getJumlahHarusDibayar());
            totalBelanja += dp.getJumlahHarusDibayar();
        }
        System.out.println("Total Bayar  : Rp" + totalBelanja);
    }
}