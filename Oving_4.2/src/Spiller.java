import java.util.Random;

public class Spiller {
    int sumPoeng;
    String navn;
    public Spiller(String SpillerNavn){
        sumPoeng = 0;
        navn = SpillerNavn;
    }

    public int getSumPoeng(){
        return sumPoeng;
    }

    public int kastTerningen(){
        Random terning = new Random();
        int terningkast = terning.nextInt(6);
        return terningkast+1;
    }

    public boolean erFerdig(){
        if (sumPoeng == 100){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean erOver(){
        if (sumPoeng > 100){
            return true;
        }
        else {
            return false;
        }
    }

}



