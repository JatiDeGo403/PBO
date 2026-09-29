import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Inisialisasi objek Barang beserta stok dan harga 
        Barang micin = new Barang("B01", "Micin", 100, 5000);
        Barang arduino = new Barang("B02", "Arduino Uno", 50, 150000);
        Barang raspberry = new Barang("B03", "Raspberry Pi", 25, 850000);

        // Inisialisasi objek Pembeli
        Pembeli ghost = new Pembeli("404", "ghost");
        Pembeli dewojenenge = new Pembeli("403", "dewojenenge");

        // Mendapatkan tanggal hari ini
        LocalDate hariIni = LocalDate.now();

        // --- Transaksi Pembeli 1: ghost ---
        ghost.tambahRincian(new detailPesanan("P-001", hariIni, micin, 2));
        ghost.tambahRincian(new detailPesanan("P-002", hariIni, arduino, 2));
        ghost.tambahRincian(new detailPesanan("P-003", hariIni, raspberry, 2));

        // --- Transaksi Pembeli 2: dewojenenge ---
        dewojenenge.tambahRincian(new detailPesanan("P-004", hariIni, micin, 2));
        dewojenenge.tambahRincian(new detailPesanan("P-005", hariIni, arduino, 2));
        dewojenenge.tambahRincian(new detailPesanan("P-006", hariIni, raspberry, 2));

        // Output Rincian Pesanan
        cetakStrukPembeli(ghost);
        cetakStrukPembeli(dewojenenge);
        
        // Cek sisa stok barang
        System.out.println("=== SISA STOK BARANG ===");
        System.out.println(micin.getNamaBarang() + ": " + micin.getKetersediaanBarang());
        System.out.println(arduino.getNamaBarang() + ": " + arduino.getKetersediaanBarang());
        System.out.println(raspberry.getNamaBarang() + ": " + raspberry.getKetersediaanBarang());
    }

    // Method helper untuk menampilkan data struk ke terminal
    private static void cetakStrukPembeli(Pembeli pembeli) {
        System.out.println("=====================================");
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
        System.out.println("=====================================\n");
    }
}