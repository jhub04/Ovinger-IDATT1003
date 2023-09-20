
public final class Matrise {

    private final int[][] data;

    public Matrise(int[][] data){
        // Lager matrisen manuelt for å unngå at brukeren kan endre på den
        this.data = new int[data.length][data[0].length];
        for (int i = 0; i < data.length; i++){
            for (int j = 0; j < data[0].length; j++){
                this.data[i][j] = data[i][j];
            }
        }
    }

    public int[][] addert(Matrise nyMatrise){
        // Sjekker om matrisene er like store
        if (this.data.length != nyMatrise.data.length || this.data[0].length != nyMatrise.data[0].length){
            throw new IllegalArgumentException("Matrisene er ikke like store");
        }

        // Lager en ny matrise som skal returneres
        int[][] nyData = new int[this.data.length][this.data[0].length];

        // Går gjennom alle elementene i matrisen
        for (int i = 0; i < this.data.length; i++){
            for (int j = 0; j < this.data[0].length; j++){
                // Legger sammen elementene i matrisene
                nyData[i][j] = this.data[i][j] + nyMatrise.data[i][j];
            }
        }

        return nyData;
    }

    public int[][] multiplisert(Matrise nyMatrise){
        // Sjekker om den nye matrisen har like mange rader som den gamle har kolonner
        if (this.data[0].length != nyMatrise.data.length){
            throw new IllegalArgumentException("Matrisene kan ikke multipliseres");
        }

        int[][] data = new int[this.data.length][nyMatrise.data[0].length];
        for (int i = 0; i < this.data.length; i++){
            for (int j = 0; j < nyMatrise.data[0].length; j++){
                for (int k = 0; k < this.data[0].length; k++){
                    data[i][j] += this.data[i][k] * nyMatrise.data[k][j];
                }
            }
        }
        return data;
    }

    public int[][] transpose(){
        int[][] nyData = new int[this.data[0].length][this.data.length];
        for (int i = 0; i < this.data.length; i++){
            for (int j = 0; j < this.data[0].length; j++){
                nyData[j][i] = this.data[i][j];
            }
        }
        return nyData;
    }


}
