public class Dragon {
    int x;
    int y;
    int direction;

    public Dragon(int x, int y, int direction) {
        this.x = x;
        this.y = y;

        if (direction >= 1 && direction <= 4) {
            this.direction = direction;
        } else {
            this.direction = 1;
        }
    }

    public void changeDirection(int newDirection) {
        if (newDirection >= 1 && newDirection <= 4) {
            direction = newDirection;
        } else {
            System.out.println("Arah tidak valid!");
            System.out.println("Arah hanya boleh 1, 2, 3, atau 4.");
        }
    }

    public void move(int steps) {
        if (steps < 0) {
            System.out.println("Jumlah langkah tidak boleh negatif!");
            return;
        }

        switch (direction) {
            case 1:
                // Atas
                y += steps;
                break;

            case 2:
                // Kanan
                x += steps;
                break;

            case 3:
                // Bawah
                y -= steps;
                break;

            case 4:
                // Kiri
                x -= steps;
                break;
        }
    }

    public void printStatus() {
        String arah;

        switch (direction) {
            case 1:
                arah = "Atas";
                break;

            case 2:
                arah = "Kanan";
                break;

            case 3:
                arah = "Bawah";
                break;

            case 4:
                arah = "Kiri";
                break;

            default:
                arah = "Tidak diketahui";
        }

        System.out.println("Posisi X       : " + x);
        System.out.println("Posisi Y       : " + y);
        System.out.println("Direction      : " + direction);
        System.out.println("Arah           : " + arah);
        System.out.println();
    }
}