public class Main {

    public static void main(String[] args) {

        // Membuat objek Mobil
        Mobil mobil = new Mobil();

        mobil.setMerkKendaraan("Toyota");
        mobil.setWarnaKendaraan("Hitam");
        mobil.setBahanBakar("Pertamax");
        mobil.setJumlahJendela(4);
        mobil.setMaxKecepatan(180);
        mobil.setJumlahRoda(4);

        // Membuat objek Motor
        Motor motor = new Motor();

        motor.setMerkKendaraan("Honda");
        motor.setWarnaKendaraan("Merah");
        motor.setBahanBakar("Pertalite");
        motor.setJumlahRoda(2);
        motor.setBerhenti(false);
        motor.setMaxKecepatan(120);

        // Membuat objek Pesawat
        Pesawat pesawat = new Pesawat();

        pesawat.setMerkKendaraan("Boeing");
        pesawat.setWarnaKendaraan("Putih");
        pesawat.setBahanBakar("Avtur");
        pesawat.setJumlahJendela(80);
        pesawat.setPenumpang(180);
        pesawat.setMaxKecepatan(900);
        pesawat.setJumlahRoda(12);

        // Membuat objek Bajaj
        Bajai bajai = new Bajai();

        bajai.setMerkKendaraan("Bajaj RE");
        bajai.setWarnaKendaraan("Biru");
        bajai.setBahanBakar("Bensin");
        bajai.setJumlahRoda(3);
        bajai.setBerhenti(false);
        bajai.setMaxKecepatan(80);
        bajai.setFasilitas("Atap dan tempat duduk penumpang");

        // Menampilkan informasi Mobil
        System.out.println("===== INFORMASI MOBIL =====");
        System.out.println("Merk: " + mobil.getMerkKendaraan());
        System.out.println("Warna: " + mobil.getWarnaKendaraan());
        System.out.println("Bahan Bakar: " + mobil.getBahanBakar());
        System.out.println("Jumlah Jendela: " + mobil.getJumlahJendela());
        System.out.println("Jumlah Roda: " + mobil.getJumlahRoda());
        System.out.println("Kecepatan Maksimal: " + mobil.getMaxKecepatan());

        // Menampilkan informasi Motor
        System.out.println("\n===== INFORMASI MOTOR =====");
        System.out.println("Merk: " + motor.getMerkKendaraan());
        System.out.println("Warna: " + motor.getWarnaKendaraan());
        System.out.println("Bahan Bakar: " + motor.getBahanBakar());
        System.out.println("Jumlah Roda: " + motor.getJumlahRoda());
        System.out.println("Berhenti: " + motor.getBerhenti());
        System.out.println("Kecepatan Maksimal: " + motor.getMaxKecepatan());

        // Menampilkan informasi Pesawat
        System.out.println("\n===== INFORMASI PESAWAT =====");
        System.out.println("Merk: " + pesawat.getMerkKendaraan());
        System.out.println("Warna: " + pesawat.getWarnaKendaraan());
        System.out.println("Bahan Bakar: " + pesawat.getBahanBakar());
        System.out.println("Jumlah Penumpang: " + pesawat.getPenumpang());
        System.out.println("Jumlah Roda: " + pesawat.getJumlahRoda());
        System.out.println("Kecepatan Maksimal: " + pesawat.getMaxKecepatan());

        // Menampilkan informasi Bajaj
        System.out.println("\n===== INFORMASI BAJAJ =====");
        System.out.println("Merk: " + bajai.getMerkKendaraan());
        System.out.println("Warna: " + bajai.getWarnaKendaraan());
        System.out.println("Bahan Bakar: " + bajai.getBahanBakar());
        System.out.println("Jumlah Roda: " + bajai.getJumlahRoda());
        System.out.println("Berhenti: " + bajai.getBerhenti());
        System.out.println("Fasilitas: " + bajai.getFasilitas());
        System.out.println("Kecepatan Maksimal: " + bajai.getMaxKecepatan());
    }
}