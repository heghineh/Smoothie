package com.company;

public class Ingredients {

    //region Properties
    private int prise;
    private String name;
    //endregion

    //region Constructors
    public Ingredients() {
    }

    public Ingredients(int prise, String name) {
        this.prise = prise;
        this.name = name;
    }
    //endregion

    //region Public Methods

    //endregion

    //region Getters and Setters
    public int getPrise() {
        return prise;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //endregion
}
