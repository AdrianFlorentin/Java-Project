package com.company;

public class Automobil {
    protected int id_auto ;
    protected String nume;
    protected float capacitate_cilindrica;
    protected int an_fabricatie;


    public Automobil( int id_auto, String nume,  float capacitate_cilindrica , int an_fabricatie)
    {
        this.id_auto = id_auto;
        this.nume = nume;
        this.capacitate_cilindrica = capacitate_cilindrica;
        this.an_fabricatie = an_fabricatie;
    }
    public void print(){
        System.out.println("Masina prezentata "+this.nume+ " fabricata in anul "+this.an_fabricatie +" are o capacitate cilindrica de "
        +this.capacitate_cilindrica+ " si este evidentiata cu id-ul "+this.id_auto);
    }
}
