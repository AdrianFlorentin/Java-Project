package com.company;

public class Tunare extends Service{
    private int modificari_adaugate;
    private String culoare_modificata;
    public Tunare(String nume_activitate, int durata, int cost, Automobil auto, int modificari_adaugate, String culoare_modificata) {
        super(nume_activitate, durata, cost, auto);
        this.modificari_adaugate = modificari_adaugate;
        this.culoare_modificata = culoare_modificata;
    }
    public void chitanta_tunare(){
        System.out.println("Masina "+auto.nume+" a intrat in service pentru "+this.nume_activitate+". In urma acestei activitati" +
                ", automobilul are un numar de "+this.modificari_adaugate+ " modificari adaugate si o culoare "+this.culoare_modificata+"" +
                ". Aceasta activitate a durat "+this.durata+" zile si are un cost de"+this.cost+ " de lei.");
    }
}
