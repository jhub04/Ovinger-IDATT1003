
public class NyString {

    private String tekst;
    public NyString(String tekst){
        this.tekst = tekst.toLowerCase();
    }

    public String forkorting(){
        String[] splittet = this.tekst.split(" ");
        String splittet_str = "";
        for (String ord : splittet){
            splittet_str += ord.charAt(0);
        }
        return splittet_str;

    }

    public String fjernTegn(char tegn){
        String nyTekst = "";
        for (int i = 0; i < this.tekst.length(); i++){
            if (this.tekst.charAt(i) != tegn){
                nyTekst += this.tekst.charAt(i);
            }
        }
        return nyTekst;
    }

    public static void main(String[] args) {
        NyString minTekst = new NyString("Hei jeg heter Jonathan");
        System.out.println(minTekst.tekst);
        System.out.println(minTekst.forkorting());
        System.out.println(minTekst.fjernTegn('j'));

    }
}
