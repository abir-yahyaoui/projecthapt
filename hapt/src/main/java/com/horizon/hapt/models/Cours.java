package com.horizon.hapt.models;

public class Cours {
    private int id;
    private String nom;
    private String doc ;
    private String decsription;
    private int nbHeurs;

    public Cours(int id, String nom, String doc, String decsription, int nbHeurs) {
        this.setId(id);
        this.setNom(nom);
        this.setDoc(doc);
        this.setDecsription(decsription);
        this.setNbHeurs(nbHeurs);
    }

    public int getNbHeurs() {
        return nbHeurs;
    }

    public void setNbHeurs(int nbHeurs) {
        this.nbHeurs = nbHeurs;
    }

    public String getDecsription() {
        return decsription;
    }

    public void setDecsription(String decsription) {
        this.decsription = decsription;
    }

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
