package com.horizon.hapt.models;
import java.util.Date;

public class Formation {
    private int id ;
    private String nom ;
    private String dure;
    private Date debut ;
    private Date fin ;
    private String programme ;
    private String certification ;

    public Formation(int id, String nom, String dure, Date debut, Date fin, String programme, String certification) {
        this.setId(id);
        this.setNom(nom);
        this.setDure(dure);
        this.setDebut(debut);
        this.setFin(fin);
        this.setProgramme(programme);
        this.setCertification(certification);
    }

    public String getCertification() {
        return certification;
    }

    public void setCertification(String certification) {
        this.certification = certification;
    }

    public String getProgramme() {
        return programme;
    }

    public void setProgramme(String programme) {
        this.programme = programme;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

    public Date getDebut() {
        return debut;
    }

    public void setDebut(Date debut) {
        this.debut = debut;
    }

    public String getDure() {
        return dure;
    }

    public void setDure(String dure) {
        this.dure = dure;
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
