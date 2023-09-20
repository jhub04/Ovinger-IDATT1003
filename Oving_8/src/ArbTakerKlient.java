import java.util.Scanner;

public class ArbTakerKlient {
    public static void main(String[] args) {
        Person person = new Person("Ola", "Nordmann", 1969);
        ArbTaker arbTaker = new ArbTaker(person, 123456, 2010, 100000, 22);
        Scanner skanner = new Scanner(System.in);

        while (true){
            System.out.println("Fornavn: " + arbTaker.getPersonalia().getFornavn());
            System.out.println("Etternavn: " + arbTaker.getPersonalia().getEtternavn());
            System.out.println("Formelt navn: " + arbTaker.formelltNavn());
            System.out.println("Fødselsår: " +arbTaker.getPersonalia().getFodselsaar());
            System.out.println("Alder: " + arbTaker.alder());
            System.out.println("Arbeidstakernummer: " + arbTaker.getArbtakernr());
            System.out.println("Ansettelsesår: " + arbTaker.getAnsettelsesaar());
            System.out.println("Månedslønn: " + arbTaker.getMaanedslonn());
            System.out.println("Skatteprosent: " + arbTaker.getSkatteprosent());
            System.out.println("Skattetrekk per måned: " + arbTaker.skattetrekkPerMaaned());
            System.out.println("Bruttolønn per år: " + arbTaker.bruttoLonnPerAar());
            System.out.println("Skattetrekk per år: " + arbTaker.skattetrekkPerAar());
            System.out.println("\nVil du\n1. endre månedslønn?\n2. endre skatteprosent?\n3. avslutte?\nDitt svar: ");
            int svar = skanner.nextInt();
            if (svar == 1){
                System.out.println("Skriv inn ny månedslønn:");
                double nyMaanedslonn = skanner.nextDouble();
                arbTaker.setMaanedslonn(nyMaanedslonn);
            } else if (svar == 2){
                System.out.println("Skriv inn ny skatteprosent:");
                int nySkatteprosent = skanner.nextInt();
                arbTaker.setSkatteprosent(nySkatteprosent);
            } else if (svar == 3){
                break;
            }




        }


    }
}
