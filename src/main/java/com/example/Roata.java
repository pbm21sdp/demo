package com.example;

public class Roata 
{
    private int raza;

    public Roata(int r)
    {
        this.raza = r;
    }

    public double calculeazaArie()
    {
        double arie = 3.14 * 3.14 * raza;

        return arie;
    }

    public double getRaza() 
    {
        return this.raza;
    }
}