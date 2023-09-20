public class exercise_3 {
    public static void main(String[] args) {
        // Creating a dataset
        int[] dataset = {0, 60, 3600, 3660, 3661};

        // Looping through the dataset and applying an algorithm
        for (int totalSeconds : dataset){
            int originalSeconds = totalSeconds;
            int hours = totalSeconds / 3600;
            totalSeconds = totalSeconds % 3600;
            int minutes = totalSeconds / 60;
            int seconds = totalSeconds % 60;

            System.out.printf("Seconds: %d –––> %d hours %d minutes %d seconds%n", originalSeconds, hours, minutes, seconds);
        }

    }
}
