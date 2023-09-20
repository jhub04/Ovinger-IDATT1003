import java.util.List;
import java.util.ArrayList;

public class Meny {

    private String navn;
    private List<Rett> retter;
    public Meny(String navn){
        this.navn = navn;
        this.retter = new ArrayList<>();
    }

    public String getNavn() {
        return navn;
    }

    public List<Rett> getRetter() {
        return retter;
    }

    public void leggTilRett(Rett rett){
        retter.add(rett);
    }

    public String toString(){
        return navn + " " + retter;
    }
}
