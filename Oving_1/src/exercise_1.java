
public class exercise_1 {
    public static void main(String[] args) {
        // Creating testing dataset
        double[] dataset = {0, 1, 2.5, 5, 10};

        for (double inches : dataset) {
            double cm = inchesToCm(inches);
            System.out.printf("%5.2f inches –––> %5.2fcm%n", inches, cm);
        }
    }
    public static double inchesToCm(double inches){
        return inches * 2.54;
    }
}

