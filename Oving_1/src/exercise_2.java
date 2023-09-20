public class exercise_2 {
    public static void main(String[] args) {

        // Making arrays of datasets inside an array
        int[][] datasets = {
                {0, 0, 60},
                {1, 0, 0},
                {1, 1, 1}
        };

        for (int[] dataset : datasets){
            int convertedTime = convertTime(dataset[0], dataset[1], dataset[2]);
            System.out.printf("%d hours %d minutes %d seconds –––> %d seconds%n", dataset[0], dataset[1], dataset[2], convertedTime);
        }
    }

    public static int convertTime (int hours, int minutes, int seconds){
        return hours*60*60 + minutes*60 + seconds;
    }
}
