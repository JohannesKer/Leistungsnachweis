package com.JohannesGroup.Programmieren.Monopoli;

public class KontoEntity {

    private int id;
    private int Kontostand;

    public KontoEntity(int id, int kontostand) {
        this.id = id;
        Kontostand = kontostand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getKontostand() {
        return Kontostand;
    }

    public void setKontostand(int kontostand) {
        Kontostand = kontostand;
    }
}
