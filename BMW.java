package com.company;

import java.sql.SQLOutput;

public class BMW extends Automobil{
    private   String model;
    private String tip_autovehicul;
    public BMW(int id_auto, String nume, float capacitate_cilindrica, int an_fabricatie, String model, String tip_autovehicul) {
        super(id_auto, nume, capacitate_cilindrica, an_fabricatie);
        this.model = model;
        this.tip_autovehicul = tip_autovehicul;
    }

public void printbmw()
{
    System.out.println("Automobilul " +this.nume+", modelul "+this.model+", de tip "+this.tip_autovehicul+ " in anul "+this.an_fabricatie+
            ", are o capacitate cilindrica de" +this.capacitate_cilindrica+" este identificat prin id-ul "+this.id_auto);

}


}
