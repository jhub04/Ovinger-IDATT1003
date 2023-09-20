public class OppgaveOversiktKlient {
    public static void main(String[] args) {
        OppgaveOversikt oversikt = new OppgaveOversikt();
        oversikt.regNyStudent("Per Ole", 3);
        oversikt.regNyStudent("Line", 4);
        oversikt.regNyStudent("Ole", 2);

        System.out.println(oversikt.toString());

        oversikt.regNyStudent("Kari", 5);

        System.out.println(oversikt.toString());

        oversikt.okAntallOppg("Per Ole", 2);

        System.out.println(oversikt.toString());

        System.out.println("Antall studenter: " + oversikt.finnAntStud());
        System.out.println("Oppgaver til Line: " + oversikt.finnAntOppgaver("Line"));

    }
}
