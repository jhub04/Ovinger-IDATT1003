import java.util.List;
import java.util.ArrayList;

public class OppgaveOversikt {

    private Student[] studenter;
    private int antStud;
    public OppgaveOversikt() {
        this.studenter = new Student[10];
        this.antStud = 0;
    }

    public int finnAntStud() {
        return antStud;
    }

    public int finnAntOppgaver(String navn) {
        for (int i = 0; i < antStud; i++) {
            if (studenter[i].getNavn().equals(navn)) {
                return studenter[i].getAntOppg();
            }
        }
        return -1;
    }

    public void regNyStudent(String navn, int antOppg){
        if (antStud < studenter.length) {
            studenter[antStud] = new Student(navn, antOppg);
            antStud++;
        } else {
            Student[] nyStudenter = new Student[studenter.length + 1];
            for (int i = 0; i < studenter.length; i++) {
                nyStudenter[i] = studenter[i];
            }
            nyStudenter[studenter.length] = new Student(navn, antOppg);
            studenter = nyStudenter;
            antStud++;
        }


    }

    public void okAntallOppg(String navn, int okning){
        for (int i = 0; i < antStud; i++) {
            if (studenter[i].getNavn().equals(navn)) {
                studenter[i].okAntOppg(okning);
            }
        }
    }

    public String toString(){
        String resultat = "";
        System.out.println("Antall studenter: " + antStud);
        System.out.println("Studenter: " + studenter);
        for (int i = 0; i < antStud; i++) {
            resultat += studenter[i].toString() + "\n";
        }
        return resultat;
    }


}
