package com.example;

public class Masina 
{
    private String marca;
    private Roata[] roti;
    private int numarRoti;

    public Masina(String m)
    {
        this.roti = new Roata[4];
        this.marca = m;
        this.numarRoti = 0;
    }

    public void adaugaRoata(Roata r) throws PreaMulteRoti
    {
        if(numarRoti >= 4)
        {
            throw new PreaMulteRoti("Masina contine deja 4 roti!");
        }

        roti[numarRoti] = r;
        numarRoti++;
    }

    public int getNumarRoti()
    {
        return this.numarRoti;
    }

    public double calculeazaArieTotala()
    {
        int i;
        double sumaTotala = 0;

        for(i = 0; i < 4; i++)
        {
            double arie = roti[i].calculeazaArie();
            sumaTotala = sumaTotala + arie;
        }

        return sumaTotala;
    }
}
