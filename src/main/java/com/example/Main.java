package com.example;

public class Main
{
    public static void main( String[] args )
    {
        Masina masina = new Masina("BMW");
        Roata r1 = new Roata(2);
        Roata r2 = new Roata(3);
        Roata r3 = new Roata(4);
        Roata r4 = new Roata(5);

        try
        {
            masina.adaugaRoata(r1);
            masina.adaugaRoata(r2);
            masina.adaugaRoata(r3);
            masina.adaugaRoata(r4);
        }
        catch (PreaMulteRoti e)
        {
            System.out.println(e.getMessage());
        }
        

        double arie = masina.calculeazaArieTotala();
        System.out.println(arie);
    }
}
