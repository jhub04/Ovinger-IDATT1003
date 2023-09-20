import java.util.Random;

public class MinRandom {

    private static Random randomTall;

    public MinRandom(){
        randomTall = new Random();
    }
    public int nesteHeltall(int nedre, int ovre){ // [5, 10]
        int tall = randomTall.nextInt(ovre - nedre + 1) + nedre; // [0, 5] + 5 = [5, 10]
        return tall;

    }

    public double nesteDesimaltall(double nedre, double ovre){ // [0.1, 0.5]
        double tall = randomTall.nextDouble() * (ovre - nedre) + nedre; // [0, 0.4] + 0.1 = [0.1, 0.5]
        // Format tall to 2 decimals
        return tall;
    }

    public static void main(String[] args) {
        MinRandom random = new MinRandom();
        System.out.println(random.nesteHeltall(5, 10));
        System.out.printf("%.3f", random.nesteDesimaltall(0.1, 0.5));
    }
}
