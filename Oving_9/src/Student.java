public class Student {

    private final String navn;
    private int antOppg;
    public Student(String navn, int antOppg){
        this.navn = navn;
        this.antOppg = antOppg;
    }

    public Student(String navn){
        this.navn = navn;
        this.antOppg = 0;
    }

    public String getNavn(){
        return navn;
    }

    public int getAntOppg(){
        return antOppg;
    }

    public void okAntOppg(int okning){
        antOppg += okning;
    }

    public String toString(){
        return "Navn: " + navn + ", antall oppgaver godkjent: " + antOppg;
    }

    //Testprogram
    /*public static void main(String[] args){
        Student s1 = new Student("Per Ole", 3);
        System.out.println(s1);
        s1.okAntOppg(2);
        System.out.println(s1);
    }*/
}
