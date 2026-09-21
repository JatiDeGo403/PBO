public class DragonMain {
    public static void main(String[] args) {

        Dragon dragon1 = new Dragon(0, 0, 0);
        Dragon dragon2 = new Dragon(0, 0, 0);

        System.out.println("STATUS AWAL DRAGON 1");
        dragon1.printStatus();

        System.out.println("STATUS AWAL DRAGON 2");
        dragon2.printStatus();

        System.out.println(" PERGERAKAN DRAGON 1");

        dragon1.move(5);
        dragon1.changeDirection(1);
        dragon1.move(3);
        dragon1.printStatus();
        System.out.println("PERGERAKAN DRAGON 2");
        dragon2.move(4);
        dragon2.changeDirection(4);
        dragon2.move(6);
        dragon2.changeDirection(3);
        dragon2.move(2);
        dragon2.printStatus();
        System.out.println("TEST CHANGE DIRECTION");
        dragon1.changeDirection(5);
        dragon1.printStatus();
    }
}