public class Barang {
    private String idBarang;
    private String namaBarang;
    private int ketersediaanBarang;
    private double harga;
    private double updateHarga; 

    public Barang(String idBarang, String namaBarang, int ketersediaanBarang, double harga) {
        this.idBarang = idBarang;
        this.namaBarang = namaBarang;
        this.ketersediaanBarang = ketersediaanBarang;
        harga = harga;
    }

    public String getIdBarang() { 
        return idBarang; 
    }

    public String getNamaBarang() { 
        return namaBarang; 
    }
        
    public int getKetersediaanBarang() { 
        return ketersediaanBarang; 
    }

    public double getHarga() { 
        return harga; 
    }

    public void updateKetersediaan(int jumlahBeli) {
        this.ketersediaanBarang -= jumlahBeli;
    }
    
    public void updateHarga(double  updateHarga){
        harga = updateHarga;
    }
}