package com.example;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RoataTest
{
    @Test
    public void calculeazaArieCorect()
    {
        Roata r1 = new Roata(2);
        double arieDinMetoda = r1.calculeazaArie();
        double arieBriana = 3.14 * 3.14 * r1.getRaza();

        assertEquals(arieBriana, arieDinMetoda, 0.1);
    }
}