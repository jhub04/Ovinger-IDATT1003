import java.util.Scanner;

public class GangeTabellen {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("From: ");
        int fra = myObj.nextInt();

        System.out.println("To: ");
        int til = myObj.nextInt();
        //int[] userData = {13, 17};

        for (int i = fra; i <= til; i++){
            System.out.println("\n" + i + " table");
            for (int num = 1; num <= 10; num++){
                System.out.printf(i + " * " + num + " = " + num*i + "\n");
            }
        }
    }
}
