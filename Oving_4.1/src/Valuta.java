public class Valuta {
    private double kurs;
    public Valuta(double kurs){
        this.kurs = kurs;
    }

    public double tilNok(double belop){
        return belop * kurs;
    }

    public double fraNok(double belop){
        return belop / kurs;
    }
}
