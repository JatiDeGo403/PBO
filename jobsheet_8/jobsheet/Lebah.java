public class Lebah extends Hewan {
    public String kasta;


    public Lebah(double berat, String makanan, String habitat, String kasta){
        super(berat, makanan, habitat);
        this.kasta = kasta;
    }

    @Override 
    public void bernapas(){
        System.out.println("otot perut mengendur, udara masuk melalui lubang di segmen tubuh");
        System.out.println("trakea mengirimkan oksigen");
        System.out.println("otot perut berkontraski, udara dikeluarkan");
    }

    @Override 
    public  void bergerak(){
        System.out.println("mengepakkan sayap kedepan");
        System.out.println("memutar sayap hampir 90 derajat");
        System.out.println("mengepakkan sayap kebelakang");
    }

    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Kasta: "+ this.kasta);
    }
}
