public class AbstractClassDemo{
    public static void main(String[] args) {

        Lebah lebah1 = new Lebah(80, "nextar", "taman", "pekerja");
        lebah1.cetakInfo();
        lebah1.bergerak();
        lebah1.bernapas();

        System.out.println();

        Ular ular1 = new Ular(50, "prabowo", "hutan kalimantan", false);
        ular1.cetakInfo();
        ular1.bergerak();
        ular1.bernapas();
        
    }
}