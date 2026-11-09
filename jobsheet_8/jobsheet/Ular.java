public class Ular extends Hewan {
    public boolean berbisa;


    public Ular(double berat, String makanan, String habitat, boolean berbisa){
        super(berat, makanan, habitat);
        this.berbisa = berbisa;
    }

    @Override 
    public void bergerak(){
        System.out.println("mengerutkan otot dari segala sisi hingga membentuk lengkung");
        System.out.println("menggunakan titik penahan seperti batu atau pohon");
        System.out.println("menggunakan sisik untuk mendorong tubuh kedepan");
    }

    @Override 
    public  void bernapas(){
        System.out.println("otot tulang rusuk konstraksi, udara masuk lewat hidung");
        System.out.println("trakea mengirimkan udara ke paru-paru");
        System.out.println("otot tulang rusuk relaksasi, udara dikeluarkan lewat hidung");
    }

    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("berbisa: "+ (this.berbisa ? "ya" : "tidak"));
    }
}
