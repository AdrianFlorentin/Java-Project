package com.company;

public class Service {
    protected String nume_activitate;
    protected int durata;
    protected int cost;
   protected com.company.Automobil auto;

    public Service(String nume_activitate, int durata, int cost, Automobil auto) {
        this.nume_activitate = nume_activitate;
        this.durata = durata;
        this.cost = cost;
        this.auto = auto;
    }
    public void chitanta_service()
    {
        System.out.println("Masina din service "+auto.nume+" cu id-ul "+auto.id_auto+" intrat in service pentru "+this.nume_activitate+
                " cu o durata de rezolvare de "+this.durata+ ". Suma de plata va fi "+this.cost);
    }
}