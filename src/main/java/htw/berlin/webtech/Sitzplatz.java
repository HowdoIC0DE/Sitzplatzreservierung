package htw.berlin.webtech;

public class Sitzplatz {

    int reihe;
    int spalte;
    int nr;
    int kundenNummer = -1;
    boolean reserviert = false;

    public Sitzplatz(int reihe, int spalte){

        if (reihe>=1 & reihe <=5){
            reihe = reihe;
        }
        else
            throw new IndexOutOfBoundsException();

        if (spalte>=1 & spalte <=5){
            spalte = spalte;
        }
        else
            throw new IndexOutOfBoundsException();

        nr = (reihe*10)+spalte;
    }

    int getReihe() {return reihe;}

    int getSpalte () {return spalte;}

    int getNr () {return nr;}

    int getKundenNummer () {return kundenNummer;}

    boolean reservieren (int nr, int kundenNummer)
    {
        if (!reserviert)
        {
            reserviert = true;
            kundenNummer = kundenNummer;

            return true;
        }

        return false;
    }

    void freigeben (int nr)
    {
        kundenNummer = -1;

        reserviert = false;
    }
}
