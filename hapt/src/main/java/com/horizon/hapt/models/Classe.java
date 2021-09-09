package com.horizon.hapt.models;

public class Classe {
    private int id ;
    private String nom ;
    private int nbPlace;
    
    public Classe(int id, String nom, int nbPlace) {
        this.setId(id);
        this.setNom(nom);
        this.setNbPlace(nbPlace);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbPlace() {
        return nbPlace;
    }

    public void setNbPlace(int nbPlace) {
        this.nbPlace = nbPlace;
    }




    
   
    
    
}
