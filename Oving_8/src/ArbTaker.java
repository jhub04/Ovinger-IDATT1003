import java.util.GregorianCalendar;

public class ArbTaker {

    GregorianCalendar kalender = new GregorianCalendar();
    private int aar = kalender.get(java.util.Calendar.YEAR);
    private Person personalia;
    private int arbtakernr;
    private int ansettelsesaar;
    private double maanedslonn;
    private int skatteprosent;
    public ArbTaker(Person personalia, int arbtakernr, int ansettelsesaar, double maanedslonn, int skatteprosent){
        this.personalia = personalia;
        this.arbtakernr = arbtakernr;
        this.ansettelsesaar = ansettelsesaar;
        this.maanedslonn = maanedslonn;
        this.skatteprosent = skatteprosent;
    }

    public Person getPersonalia() {
        return personalia;
    }

    public int getArbtakernr() {
        return arbtakernr;
    }

    public int getAnsettelsesaar() {
        return ansettelsesaar;
    }

    public double getMaanedslonn() {
        return maanedslonn;
    }

    public int getSkatteprosent() {
        return skatteprosent;
    }

    public void setMaanedslonn(double maanedslonn) {
        this.maanedslonn = maanedslonn;
    }

    public void setSkatteprosent(int skatteprosent) {
        this.skatteprosent = skatteprosent;
    }

    public double skattetrekkPerMaaned(){
        return maanedslonn * skatteprosent / 100;
    }

    public double bruttoLonnPerAar(){
        return maanedslonn * 12;
    }

    public double skattetrekkPerAar(){
        return skattetrekkPerMaaned() * 10.5;
    }

    public String formelltNavn(){
        return personalia.getEtternavn() + ", " + personalia.getFornavn();
    }

    public int alder(){
        return aar - personalia.getFodselsaar();
    }

    public int antallAarAnsatt(){
        return aar - ansettelsesaar;
    }

    public boolean ansattMerEnn(int aar){
        return antallAarAnsatt() > aar;
    }


}
