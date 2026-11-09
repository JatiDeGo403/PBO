public class Motor extends Kendaraan implements AlatTransportasi {

    private int jumlahRoda;
    private boolean berhenti;
    private int maxKecepatan;

    public int getJumlahRoda() {
        return jumlahRoda;
    }

    public boolean getBerhenti() {
        return berhenti;
    }

    public void setJumlahRoda(int jumlahRoda) {
        this.jumlahRoda = jumlahRoda;
    }

    public void setBerhenti(boolean berhenti) {
        this.berhenti = berhenti;
    }

    @Override
    public void setMaxKecepatan(int maxKecepatan) {
        this.maxKecepatan = maxKecepatan;
    }

    @Override
    public int getMaxKecepatan() {
        return maxKecepatan;
    }
}