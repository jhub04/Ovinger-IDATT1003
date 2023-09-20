public class TekstBehandling {

    private String tekst;
    public TekstBehandling(String tekst){
        this.tekst = tekst;
    }

    public int antallOrd(){
        String[] splittet = this.tekst.split(" ");
        return splittet.length;
    }

    public double ordlengde(){
        double bokstaverTotalt = 0;
        String[] splittet = this.tekst.split(" ");
        for (String ord : splittet){
            bokstaverTotalt += ord.length();
        }

        return bokstaverTotalt / antallOrd();
    }

    public double ordPerPeriode(){
        double ordTotalt = 0;
        String[] perioder = this.tekst.split("[.!:;,?]+");
        double antallPerioder = perioder.length;
        for (String periode : perioder){
            String renPeriode = periode.strip();
            String[] splittetPeriode = renPeriode.split(" ");
            ordTotalt += splittetPeriode.length;


        }
        return ordTotalt / antallPerioder;

        }

    public String bytteUtOrd(String ord, String erstatning) {
        String[] biter = this.tekst.split("(?<=[^a-zA-ZæøåÆØÅ0-9])|(?=[^a-zA-ZæøåÆØÅ0-9])");

        String nyTekst = "";

        for (int i = 0; i < biter.length; i++) {
            if (biter[i].strip().toLowerCase().equals(ord.toLowerCase())) {
                biter[i] = erstatning;
            }
            nyTekst += (biter[i]);
        }

        return nyTekst;
    }

    public String hentTekst(){
        return this.tekst;
    }

    public String hentTekstStor(){
        return this.tekst.toUpperCase();
    }
}
