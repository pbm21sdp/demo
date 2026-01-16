package com.example;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MasinaTest
{
    @Test
    public void testAdaugaRoata() throws PreaMulteRoti
    {
        Masina masina = new Masina("BMW");
        Roata roata = new Roata(2);
        
        masina.adaugaRoata(roata);
        assertEquals(1, masina.getNumarRoti());
    }

    @Test
    public void testExceptie() throws PreaMulteRoti
    {
        Masina masina = new Masina("BMW");
        Roata roata1= new Roata(2);
        Roata roata2 = new Roata(3);
        Roata roata3 = new Roata(4);
        Roata roata4 = new Roata(6);
        Roata roata5 = new Roata(7);

        try
        {
            masina.adaugaRoata(roata1);
            masina.adaugaRoata(roata2);
            masina.adaugaRoata(roata3);
            masina.adaugaRoata(roata4);
            masina.adaugaRoata(roata5);
        }
        catch (PreaMulteRoti e)
        {
            assertEquals("Masina contine deja 4 roti!", e.getMessage());
        }
        
    }
}