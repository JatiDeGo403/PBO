public class Mobil extends Kendaraan implements AlatTransportasi {

    private int jumlahJendela;
    private int maxKecepatan;
    private int jumlahRoda;

    public int getJumlahJendela() {
        return jumlahJendela;
    }

    public void setJumlahJendela(int jumlahJendela) {
        this.jumlahJendela = jumlahJendela;
    }

    @Override
    public void setMaxKecepatan(int maxKecepatan) {
        this.maxKecepatan = maxKecepatan;
    }

    @Override
    public int getMaxKecepatan() {
        return maxKecepatan;
    }

    @Override
    public void setJumlahRoda(int jumlahRoda) {
        this.jumlahRoda = jumlahRoda;
    }

    @Override
    public int getJumlahRoda() {
        return jumlahRoda;
    }
}