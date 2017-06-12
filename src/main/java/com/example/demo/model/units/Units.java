package com.example.demo.model.units;

/**
 * Created by hitek on 12.06.2017.
 */
public class Units {
    private int ID;
    private String NAME;
    private String COUNTRY;
    private int DEFENCE;
    private int ATTACE;

    public Units(int ID, String NAME, String COUNTRY, int DEFENCE, int ATTACE) {
        this.ID = ID;
        this.NAME = NAME;
        this.COUNTRY = COUNTRY;
        this.DEFENCE = DEFENCE;
        this.ATTACE = ATTACE;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getCOUNTRY() {
        return COUNTRY;
    }

    public void setCOUNTRY(String COUNTRY) {
        this.COUNTRY = COUNTRY;
    }

    public int getDEFENCE() {
        return DEFENCE;
    }

    public void setDEFENCE(int DEFENCE) {
        this.DEFENCE = DEFENCE;
    }

    public int getATTACE() {
        return ATTACE;
    }

    public void setATTACE(int ATTACE) {
        this.ATTACE = ATTACE;
    }
}
