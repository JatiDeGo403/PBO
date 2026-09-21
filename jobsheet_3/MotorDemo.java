public class MotorDemo{
    public static void main(String[] args) {
        Motor motor1 = new Motor();
        motor1.setPlatNomor("K 1 NG");
        motor1.setKecepatan(50);
        motor1.kecepatan = 100;
        motor1.displayinfo(); 

        Motor motor2 = new Motor();
        motor2.setPlatNomor("M 16 UEL");
        motor2.setStatusMesin(false);
        motor2.kecepatan = 100;
        motor2.displayinfo(); 

        Motor motor3 = new Motor();
        motor3.platNomor = "J 03 KOWI";
        motor3.statusMesin = false;
        motor3.kecepatan = 100;
        int kecepatanBaru = 50;
        if(!motor3.statusMesin && kecepatanBaru > 0){
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        }else{
            motor3.kecepatan = kecepatanBaru;
        }
        motor3.displayinfo(); 
    }
}