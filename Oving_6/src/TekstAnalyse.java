import java.util.ArrayList;

public class TekstAnalyse {
    // CharAt() method
    // length() method
    private int[] antallTegn = new int[30];

    public TekstAnalyse(String tekst) { // "Jeg heter Jonathan"
        for (int i = 0; i < tekst.length(); i++) {
            char tegn = tekst.charAt(i);
            // Ascii 'a' = 97 og 'å' = 125. å-a = 28
            if (tegn >= 'a' && tegn <= 'å') {
                antallTegn[tegn - 'a']++;
            } else if (tegn >= 'A' && tegn <= 'Å') {
                antallTegn[tegn - 'A']++;
            } else {
                antallTegn[29]++;
            }
        }
    }

    public int antallForskjellige(){
        int antall = 0;
        for (int i = 0; i < antallTegn.length-1; i++){
            if (antallTegn[i] > 0){
                antall ++;
            }
        }
        return antall;
    }

    public int antallTotalt(){
        int antall = 0;
        for (int i = 0; i < antallTegn.length-1; i++){
            antall += antallTegn[i];
        }
        return antall;
    }

    public double prosentIkkeTekst(){
        double prosent = (double ) antallTegn[29] / (antallTegn[29] + antallTotalt())* 100;
        return prosent;
    }

    public int antallAvBokstav(char bokstav){
        int antall = 0;
        if (bokstav >= 'a' && bokstav <= 'å'){
            antall = antallTegn[bokstav - 'a'];
        } else if (bokstav >= 'A' && bokstav <= 'Å'){
            antall = antallTegn[bokstav - 'A'];
        }
        return antall;
    }

    private char indexTilBokstav(int index) {
        return (char) ('a' + index);
    }

    public ArrayList<Character> flestForekommende(){
        ArrayList<Character> liste = new ArrayList<Character>();
        int hoyest = 0;

        for (int i = 0; i < antallTegn.length-1; i++){
            if (antallTegn[i] > hoyest){
                hoyest = antallTegn[i];
            }
        }

        for (int i = 0; i< antallTegn.length-1; i++){
            if (antallTegn[i] == hoyest){
                liste.add(indexTilBokstav(i));
            }
        }
        return liste;
    }


}
