public class InheritanceDemo {
    public static void main(String[] args) {

        Dosen dosen1 = new Dosen(
            "34329837",
            "Yansy Ayuningtyas",
            3000000,
            "1989432439"
        );

        Dosen dosen2 = new Dosen();

        dosen2.nip = "11223344";
        dosen2.nama = "Budi Santoso";
        dosen2.gaji = 4500000;
        dosen2.nidn = "0011223344";

        System.out.println("=== INFO DOSEN 1 ===");
        System.out.println(dosen1.getInfo());

        System.out.println("=== INFO DOSEN 2 ===");
        System.out.println(dosen2.getInfo());
    }
}