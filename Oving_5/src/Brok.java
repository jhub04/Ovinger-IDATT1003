public class Brok {

    public int teller;
    public int nevner;
    public Brok(int teller, int nevner){
        this.teller = teller;
        this.nevner = nevner;

        if (nevner == 0){
            throw new IllegalArgumentException("Nevner kan ikke være 0");
        }
    }

    public int GetNevner(){
        return this.nevner;
    }

    public int GetTeller(){
        return this.teller;
    }



    public Brok(int teller){
        this.teller = teller;
        this.nevner = 1;
    }

    public void Summere(Brok brok){
        this.teller = this.teller * brok.nevner + brok.teller * this.nevner;
        this.nevner = this.nevner * brok.nevner;
    }

    public void Subtrahere(Brok brok){
        this.teller = this.teller * brok.nevner - brok.teller * this.nevner;
        this.nevner = this.nevner * brok.nevner;
    }

    public void Multiplisere(Brok brok){
        this.teller = this.teller * brok.teller;
        this.nevner = this.nevner * brok.nevner;
    }

    public void Dividere(Brok brok){
        this.teller = this.teller * brok.nevner;
        this.nevner = this.nevner * brok.teller;
    }
}
