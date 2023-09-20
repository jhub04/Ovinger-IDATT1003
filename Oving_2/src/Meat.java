public class Meat {
    public static void main(String[] args) {
        // Which meat is least kr per gram?
        double a = 35.90 / 450;
        double b = 39.50 / 500;
        if (a > b){
            System.out.println("Meat B is cheaper per amount");
        }
        else if (a == b){
            System.out.println("Meat A and B is the same price");
        }
        else {
            System.out.println("Meat A is cheaper per amount");
        }
        System.out.printf("Price meat A: %fkr/gram\n", a);
        System.out.printf("Price meat B: %fkr/gram", b);
    }
}
