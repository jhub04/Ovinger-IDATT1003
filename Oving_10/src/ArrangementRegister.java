import java.util.*;
import java.util.stream.Collectors;


public class ArrangementRegister {

    private final List<Arrangement> arrangementer = new ArrayList<>();

    public ArrangementRegister(){
        this.arrangementer.add(new Arrangement(1, "Rockekonsert", "Oslo", "Oslo Events", "Konsert", 202309201900L));
        this.arrangementer.add(new Arrangement(2, "Barneteater", "Bergen", "Bergen Scene", "Teater", 202309221400L));
        this.arrangementer.add(new Arrangement(3, "Foredrag om Java", "Trondheim", "NTNU", "Foredrag", 202309241200L));
    }

    public void leggTilArrangement(Arrangement arrangement) {
        arrangementer.add(arrangement);
    }

    public int getAntallArrangementer(){
        return arrangementer.size();
    }

    public List<Arrangement> sammeSted(String sted) {
        return arrangementer.stream()
                .filter(a -> a.getSted().equalsIgnoreCase(sted))
                .collect(Collectors.toList());
    }

    public List<Arrangement> sammeDato(int dato){
        return arrangementer.stream()
                .filter(a -> a.getDato() == dato)
                .collect(Collectors.toList());
    }

    public List<Arrangement> innenforDatoer (int startDato, int sluttDato){
        return arrangementer.stream()
                .filter(a -> a.getDato() >= startDato && a.getDato() <= sluttDato)
                .sorted(new DatoComparator())
                .collect(Collectors.toList());
    }

    public List<Arrangement> sortertEtterSted(){
        return arrangementer.stream()
                .sorted(new StedComparator())
                .collect(Collectors.toList());
    }

    public List<Arrangement> sortertEtterType(){
        return arrangementer.stream()
                .sorted(new TypeComparator())
                .collect(Collectors.toList());
    }

    public List<Arrangement> sortertEtterTidspunkt(){
        return arrangementer.stream()
                .sorted(new TidspunktComparator())
                .collect(Collectors.toList());
    }
    private static class DatoComparator implements Comparator<Arrangement> {
        @Override
        public int compare(Arrangement a1, Arrangement a2) {
            return Integer.compare(a1.getDato(), a2.getDato());
        }
    }
    private static class StedComparator implements Comparator<Arrangement> {
        @Override
        public int compare(Arrangement a1, Arrangement a2) {
            return a1.getSted().compareTo(a2.getSted());
        }
    }

    private static class TypeComparator implements Comparator<Arrangement> {
        @Override
        public int compare(Arrangement a1, Arrangement a2) {
            return a1.getType().compareTo(a2.getType());
        }
    }

    private static class TidspunktComparator implements Comparator<Arrangement> {
        @Override
        public int compare(Arrangement a1, Arrangement a2) {
            return Long.compare(a1.getTidspunkt(), a2.getTidspunkt());
        }
    }


    public String toString(){
        String utskrift = "";
        for (Arrangement arrangement : arrangementer) {
            utskrift += arrangement.toString() + "\n";
        }
        return utskrift;
    }
}


