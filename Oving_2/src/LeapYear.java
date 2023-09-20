import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        System.out.println("Year: ");

        int year = object.nextInt();
        if (year % 100 == 0){
            if (year % 400 == 0){
                System.out.println("Year " + year + " is a leap year!");
            }
            else {
                System.out.println("Year " + year + " is not a leap year");
            }
        }
         else if (year % 4 == 0) {
             System.out.println("Year " + year + " is a leap year!");
        }
         else {
            System.out.println("Year " + year + " is not a leap year");
        }
    }
}
