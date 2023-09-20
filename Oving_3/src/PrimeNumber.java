import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        while (true){
            System.out.println("Enter a number or type '0' to quit: ");

            int number = myObj.nextInt();
            boolean isPrime = true;

            if (number == 0){
                break;
            }

            if (number <= 1){
                isPrime = false;
            }

            else if (number == 2){
                isPrime = true;
            }

            for (int i = 2; i <= number-1; i++){
                if (number % i == 0){
                    isPrime = false;
                }
            }

            if (isPrime){
                System.out.println(number + " is a prime number");
            }
            else {
                System.out.println(number + " is not a prime number");
            }
        }

    }
}
