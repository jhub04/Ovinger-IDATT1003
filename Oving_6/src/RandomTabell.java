import java.util.Random;
import java.util.HashMap;

public class RandomTabell {
    public static void main(String[] args) {
        HashMap<Integer, Integer> tabell = new HashMap<Integer, Integer>();
        Random random = new Random();

        for (int i = 0; i <= 9; i++){
            tabell.put(i, 0);
        }


        for (int i = 0; i <= 5000; i++){
            int randomTall = random.nextInt(10);
            tabell.put(randomTall, tabell.get(randomTall)+1);
        }

        for (int i : tabell.keySet()){
            System.out.println(i + ": " + tabell.get(i));
        }
    }
}
