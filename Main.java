package com.company;

public class Main {

    public static void main(String[] args) {
        Automobil Dacia= new Automobil(1," Dacia", 1.59f, 2018);
        Dacia.print();
        BMW seria_5=new BMW(2,"BMW",2.999f,2021,"Seria 5","Sedan");
        seria_5.printbmw();
        Service Tokyo= new Service("schimb ulei", 60, 100, seria_5);
        Tokyo.chitanta_service();
        Tunare dacie= new Tunare("Adaugat turbo", 2, 600,Dacia, 5,"neschimbata");
        dacie.chitanta_tunare();
    }
}
