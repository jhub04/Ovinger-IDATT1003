import java.util.Scanner;

public class TekstAnalyseKlient {

    public static void main(String[] args) {

        Scanner skanner = new Scanner(System.in);

        while (true){
            System.out.println("Skriv inn en tekst: ");
            String tekst = skanner.nextLine();

            TekstAnalyse analyse = new TekstAnalyse(tekst);
            System.out.println("Antall forskjellige bokstaver i teksten: " + analyse.antallForskjellige());
            System.out.println("Totalt antall bokstaver i teksten: " + analyse.antallTotalt());
            System.out.printf("Prosent av teksten som ikke er bokstaver: %.2f\n", analyse.prosentIkkeTekst());
            System.out.println("Antall forekomster av e: " + analyse.antallAvBokstav('e'));

            for (char element : analyse.flestForekommende()){
                System.out.println("Flest forekommende: " + element);
            }

            System.out.println("Vil du fortsette? (j/n): ");
            if (skanner.nextLine().equals("n")){
                break;
            }
        }



    }
}
