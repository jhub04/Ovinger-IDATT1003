import java.util.Scanner;

public class ValutaKlient {
    public static void main(String[] args) {
        double kursDollar = 10.64;
        double kursEuro = 11.55;
        double kursSvenske = 0.97;

        Valuta dollar = new Valuta(kursDollar);
        Valuta euro = new Valuta(kursEuro);
        Valuta svenske = new Valuta(kursSvenske);

        Scanner skan = new Scanner(System.in);

        while (true){
            System.out.print("Velg valuta: \n1: dollar\n2. euro\n3. svenske kroner\n4. avslutt\n\nDitt valg (nummer): ");
            int valg = skan.nextInt();

            if (valg == 4) {
                System.out.println("Avslutter programmet... ");
                break;
            }

            System.out.print("\nHva vil du konvertere?\n1. Fra NOK til valgt valuta\n2. Fra valgt valuta til NOK\nDitt valg (nummer):");
            int konverteringsvalg = skan.nextInt();

            System.out.print("Skriv inn beløp: ");
            double belop = skan.nextDouble();

            double konverteringsBelop;
            switch (valg){
                case 1:
                    konverteringsBelop = (konverteringsvalg == 1) ? dollar.fraNok(belop) : dollar.tilNok(belop);
                    System.out.println(belop + ((konverteringsvalg == 1) ? " NOK": " dollar") +" blir " + konverteringsBelop + ((konverteringsvalg == 1) ? " dollar\n" : " NOK\n"));
                    break;
                case 2:
                    konverteringsBelop = (konverteringsvalg == 1) ? euro.fraNok(belop) : euro.tilNok(belop);
                    System.out.println(belop + ((konverteringsvalg == 1) ? " NOK": " euro") + " blir " + konverteringsBelop + ((konverteringsvalg == 1) ? " euro\n" : " NOK\n"));
                    break;
                case 3:
                    konverteringsBelop = (konverteringsvalg == 1) ? svenske.fraNok(belop) : svenske.tilNok(belop);
                    System.out.println(belop + ((konverteringsvalg == 1) ? " NOK": " svenske kroner") + " blir " + konverteringsBelop + ((konverteringsvalg == 1) ? " svenske kroner\n" : " NOK\n"));
                    break;
                default:
                    System.out.println("Ugyldig valg\n");

            }



        }
    }
}
