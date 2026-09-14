public class Motor{
    public String platNomor;
    public boolean statusMesin;
    public int kecepatan;

    public String getPlatNomor(){
        return platNomor;
    }

    public void setPlatNomor(String platNomor){
        this.platNomor = platNomor;
    }

    public boolean getStatusMesin(){
        return statusMesin;
    }

    public void setStatusMesin(boolean statusMesin){
        this.statusMesin = statusMesin;
    }

    public int getKecepatan(){
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        if (!this.statusMesin && kecepatan > 0) {
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        } else if (kecepatan > 100) {
            System.out.println("Kecepatan maksimal adalah 100");
        }else if(kecepatan < 0){
            System.out.println("Kecepatan tidak boleh negatif");
        } else {
            this.kecepatan = kecepatan;
        }
    }
    public void displayinfo(){
        System.out.println("Plat Nomor: " +this.platNomor);
        System.out.println("Status Mesin: " +(this.statusMesin ? "on" : "off"));
        System.out.println("Kecepatan: " +this.kecepatan);
        System.out.println("===========================");
    }   
}