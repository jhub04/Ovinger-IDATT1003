import java.util.List;
import java.util.ArrayList;

public class MenyRegister {

    private List<Meny> menyer;
    private List<Rett> alleRetter;
    public MenyRegister(){
        this.menyer = new ArrayList<Meny>();
        this.alleRetter = new ArrayList<Rett>();
    }

    public Meny opprettOgLeggTilNyMeny(String navn){
        Meny meny = new Meny(navn);
        menyer.add(meny);
        return meny;
    }

    public void leggTilRetterTilMeny(List<Rett> retter, String menynavn){
    for (Meny meny : menyer){
            if (meny.getNavn().equals(menynavn)){
                for (Rett rett : retter){
                    meny.leggTilRett(rett);
                }
            }
        }

    }

    public Rett opprettNyRett(String navn, String type, int pris, String oppskrift){
        Rett rett = new Rett(navn, type, pris, oppskrift);
        alleRetter.add(rett);
        return rett;
    }

    public List<Meny> getMenyer(){
        return menyer;
    }

    public List<Rett> getAlleRetter(){
        return alleRetter;
    }


    public Rett finnRett(String navn){
        for (Rett rett : alleRetter){
            if (rett.getNavn().equals(navn)){
                return rett;
            }
        }
        return null;
    }

    public List<Rett> retterAvSammeType(String type){
        List<Rett> retter = new ArrayList<Rett>();
        for (Meny meny : menyer){
            for (Rett rett : meny.getRetter()){
                if (rett.getType().equals(type)){
                    retter.add(rett);
                }
            }
        }
        return retter;
    }

    public List<Meny> menyerInnenforPris(int minstePris, int hoyestePris){
        List<Meny> nyeMenyer= new ArrayList<Meny>();
        for (Meny meny : menyer){
            int totalpris = 0;
            for (Rett rett : meny.getRetter()){
                totalpris += rett.getPris();
            }
            if (totalpris >= minstePris && totalpris <= hoyestePris){
                nyeMenyer.add(meny);
            }
        }
        return nyeMenyer;
    }





}
