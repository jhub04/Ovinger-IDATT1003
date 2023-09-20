public class SpillerKlient {

    public static void main(String[] args) {
        Spiller A = new Spiller("A");
        Spiller B = new Spiller("B");
        int runde = 1;

        while (true){
            if (A.erFerdig()){
                System.out.println("\nA vant spillet!");
                break;
            }
            else if (B.erFerdig()){
                System.out.println("\nB vant spillet!");
                break;
            }

            System.out.println("\nRunde " + runde + ":\n");
            int kastA = A.kastTerningen();

            if (kastA == 1){
                A.sumPoeng = 0;
            } else if (A.erOver()) {
                A.sumPoeng = A.sumPoeng - kastA;
            } else {
                A.sumPoeng = A.sumPoeng + kastA;
            }

            System.out.println("A kastet: " + kastA + " | Poeng: " + A.getSumPoeng());
            int kastB = B.kastTerningen();

            if (kastB == 1){
                B.sumPoeng = 0;
            } else if (B.erOver()) {
                B.sumPoeng = B.sumPoeng - kastB;
            } else {
                B.sumPoeng = B.sumPoeng + kastB;
            }

            System.out.println("B kastet: " + kastB + " | Poeng: " + B.getSumPoeng());
            runde++;

        }
    }
}
