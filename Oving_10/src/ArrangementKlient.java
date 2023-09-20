import java.util.Scanner;
import java.util.List;

public class ArrangementKlient {
    public static void main(String[] args) {
        ArrangementRegister register = new ArrangementRegister();
        Scanner scanner = new Scanner(System.in);
        int valg;

        do {
            System.out.println("\n---- Meny ----");
            System.out.println("1. Legg til arrangement");
            System.out.println("2. Hent arrangementer på et sted");
            System.out.println("3. Hent arrangementer på en dato");
            System.out.println("4. Hent arrangementer innenfor et tidsintervall");
            System.out.println("5. Hent arrangementer sortert etter sted");
            System.out.println("6. Hent arrangementer sortert etter type");
            System.out.println("7. Hent arrangementer sortert etter tidspunkt");
            System.out.println("8. Vis alle arrangementer");
            System.out.println("9. Avslutt");
            System.out.print("Velg et alternativ: ");

            valg = scanner.nextInt();

            switch (valg) {
                case 1:
                    scanner.nextLine();  // Fjerner den gjenværende linjeslutten fra tidligere input.

                    System.out.print("Angi arrangementets navn: ");
                    String navn = scanner.nextLine();

                    System.out.print("Angi arrangementets sted: ");
                    String arrSted = scanner.nextLine();

                    System.out.print("Angi arrangementets arrangør: ");
                    String arrangor = scanner.nextLine();

                    System.out.print("Angi arrangementets type (f.eks. konsert, teater, osv.): ");
                    String type = scanner.nextLine();

                    System.out.print("Angi arrangementets tidspunkt (yyyymmddhhmm, f.eks. 202309151830 for 15. september 2023 kl. 18:30): ");
                    long tidspunkt = scanner.nextLong();

                    int id = register.getAntallArrangementer() + 1;

                    Arrangement nyttArrangement = new Arrangement(id, navn, arrSted, arrangor, type, tidspunkt);
                    register.leggTilArrangement(nyttArrangement);
                    System.out.println("Arrangementet er lagt til!");
                    break;
                case 2:
                    System.out.print("Angi sted: ");
                    String sted = scanner.next();
                    visListe(register.sammeSted(sted));
                    break;
                case 3:
                    System.out.print("Angi dato (yyyymmdd): ");
                    int dato = scanner.nextInt();
                    visListe(register.sammeDato(dato));
                    break;
                case 4:
                    System.out.print("Angi startdato (yyyymmdd): ");
                    int startDato = scanner.nextInt();
                    System.out.print("Angi sluttdato (yyyymmdd): ");
                    int sluttDato = scanner.nextInt();
                    visListe(register.innenforDatoer(startDato, sluttDato));
                    break;
                case 5:
                    visListe(register.sortertEtterSted());
                    break;
                case 6:
                    visListe(register.sortertEtterType());
                    break;
                case 7:
                    visListe(register.sortertEtterTidspunkt());
                    break;
                case 8:
                    System.out.println(register);
                    break;
                case 9:
                    System.out.println("Avslutter...");
                    break;
                default:
                    System.out.println("Ugyldig valg. Prøv igjen.");
            }
        } while (valg != 9);

        scanner.close();
    }

    private static void visListe(List<Arrangement> liste) {
        if (liste.isEmpty()) {
            System.out.println("Ingen arrangementer funnet.");
        } else {
            for (Arrangement arr : liste) {
                System.out.println(arr);
            }
        }
    }
}
