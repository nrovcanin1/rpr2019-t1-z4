package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl [] ar = new Artikl[1000];
    int br = 0;

    public boolean dodajArtikl(Artikl a)
    {
        if(br >= 1000) return false;
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
                Artikl a = ar[i];
                for(int j = i; j < br - 1; j++)
                    ar[j] = ar[j + 1];
                ar[br - 1] = null;
                br--;
                return a;
            }
        }
        return null;
    }

    public Artikl [] getArtikli() { return ar; }


}
