package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl [] ar = new Artikl[50];
    int br = 0;

    public boolean dodajArtikl(Artikl a)
    {
        if(br >= 50) return false;
        ar[br] = new Artikl(a.getNaziv(), a.getCijena(), a.getKod());
        br++;
        return true;
    }

    public Artikl izbaciArtiklSaKodom(String kod)
    {
        for(int i = 0; i < br; i++)
        {
            if(kod.equals(ar[i].getKod()))
            {
                Artikl rez = ar[i];
                for(int j = i; j < br - 1; j++)
                    ar[j] = ar[j + 1];
                ar[br - 1] = null;
                br--;
                return rez;
            }
        }
        return null;
    }

    public Artikl [] getArtikli() { return ar; }

    public int dajUkupnuCijenuArtikala()
    {
        int s = 0;
        for(int i = 0; i < br; i++)
            s += ar[i].getCijena();
        return s;
    }
}
