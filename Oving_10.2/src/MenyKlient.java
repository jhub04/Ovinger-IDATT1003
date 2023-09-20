import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenyKlient {
    public static void main(String[] args) {
        // Testklient for MenyRegister
        MenyRegister register = new MenyRegister();
        Rett rett1 = register.opprettNyRett("Pasta Carbonara", "Hovedrett", 100, "Oppskrift1");
        Rett rett2 = register.opprettNyRett("Biff Stroganoff", "Hovedrett", 150, "Oppskrift2");
        Rett rett3 = register.opprettNyRett("Dumplings", "Forrett", 75, "Oppskrift3");
        Rett rett4 = register.opprettNyRett("Tiramisu", "Dessert", 95, "Oppskrift4");

        List<Rett> retter = new ArrayList<Rett>();
        retter.add(rett1);
        retter.add(rett2);
        retter.add(rett3);

        List<Rett> retter2 = new ArrayList<Rett>();
        retter2.add(rett2);
        retter2.add(rett3);
        retter2.add(rett4);

        register.opprettOgLeggTilNyMeny("Meny1");
        register.opprettOgLeggTilNyMeny("Meny2");
        register.leggTilRetterTilMeny(retter, "Meny1");
        register.leggTilRetterTilMeny(retter2, "Meny2");



        Scanner skanner = new Scanner(System.in);


        while (true){
            System.out.println("Velg en av følgende valg:\n1. Registrer en ny rett\n2. Finn en rett\n3. Finn retter av samme type\n4. Registerer ny meny\n5. Finn alle menyer med totalpris innenfor et gitt interval\n6. Vis alle retter\n7. Vis alle menyer\n8. Avslutt\nDitt valg: ");
            int valg = skanner.nextInt();
            skanner.nextLine();

            switch (valg){
                case 1:
                    System.out.println("Skriv inn navn på retten:");
                    String navn = skanner.nextLine();
                    System.out.println("Skriv inn type på retten:");
                    String type = skanner.nextLine();
                    System.out.println("Skriv inn pris på retten:");
                    int pris = skanner.nextInt();
                    skanner.nextLine();
                    System.out.println("Skriv inn oppskrift på retten:");
                    String oppskrift = skanner.nextLine();
                    register.opprettNyRett(navn, type, pris, oppskrift);
                    break;
                case 2:
                    System.out.println("Skriv inn navn på retten du vil finne:");
                    String navn2 = skanner.nextLine();
                    System.out.println(register.finnRett(navn2));
                    break;
                case 3:
                    System.out.println("Skriv inn type på retten du vil finne:");
                    String type2 = skanner.nextLine();
                    System.out.println(register.retterAvSammeType(type2));
                    break;
                case 4:
                    System.out.println("Skriv inn navn på menyen:");
                    String navn3 = skanner.nextLine();
                    Meny meny = register.opprettOgLeggTilNyMeny(navn3);
                    while (true){
                        System.out.println("Skriv inn navn på retten du vil legge til i menyen, eller skriv 'ferdig' for å avslutte:");
                        String rettNavn = skanner.nextLine();
                        if (rettNavn.equals("ferdig")){
                            break;
                        }
                        Rett funnetRett = register.finnRett(rettNavn);
                        if (funnetRett == null){
                            System.out.println("Fant ikke retten, prøv igjen");
                        } else {
                            meny.leggTilRett(funnetRett);
                        }
                    }
                    break;

                case 5:
                    System.out.println("Skriv inn minimumspris:");
                    int minstePris = skanner.nextInt();
                    System.out.println("Skriv inn maksimumspris:");
                    int hoyestePris = skanner.nextInt();
                    skanner.nextLine();
                    System.out.println(register.menyerInnenforPris(minstePris, hoyestePris).toString());
                    break;

                case 6:
                    System.out.println(" ");
                    for (Rett rett : register.getAlleRetter()){
                        System.out.println(rett.toString());
                    }
                    System.out.println(" ");
                    break;

                case 7:
                    System.out.println(" ");
                    for (Meny m : register.getMenyer()){
                        System.out.println(m.toString());
                    }
                    System.out.println(" ");
                    break;

                case 8:
                    System.exit(0);
                    break;
            }




        }






    }
}
