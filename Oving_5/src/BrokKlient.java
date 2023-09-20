public class BrokKlient {

    public static void main(String[] args) {
        Brok brok1 = new Brok(1, 2);
        Brok brok2 = new Brok(2);
        //Brok brok3 = new Brok(1, 0);

        System.out.println("brok1: " + brok1.teller + "/" + brok1.nevner);
        System.out.println("brok2: " + brok2.teller + "/" + brok2.nevner);

        //Adderer brok 1 med brok 2
        brok1.Summere(brok2);
        System.out.println("brok1 + brok2: " + brok1.teller + "/" + brok1.nevner+ "\n"); // Forventer 5/2

        brok1 = new Brok(1, 2);
        //Subtraherer brok 1 med brok 2
        brok1.Subtrahere(brok2);
        System.out.println("brok1 - brok2: " + brok1.teller + "/" + brok1.nevner+ "\n"); // Forventer -3/2

        brok1 = new Brok(1, 2);
        // Multipliserer brok 1 med brok 2
        brok1.Multiplisere(brok2);
        System.out.println("brok1 * brok2: " + brok1.teller + "/" + brok1.nevner+ "\n"); // Forventer 2/2

        brok1 = new Brok(1, 2);
        // Dividerer brok 1 med brok 2
        brok1.Dividere(brok2);
        System.out.println("brok1 / brok2: " + brok1.teller + "/" + brok1.nevner+ "\n"); // Forventer 1/4
    }
}
