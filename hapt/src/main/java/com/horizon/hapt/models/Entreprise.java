package com.horizon.hapt.models;

public class Entreprise {
    private long id ;
    private String raison;
    private String matriculeFiscale ;
    private String rc ;
    
    public Entreprise(long id, String raison, String matriculeFiscale, String rc) {
        this.setId(id);
        this.setRaison(raison);
        this.setMatriculeFiscale(matriculeFiscale);
        this.setRc(rc);
    }

    public String getRc() {
        return rc;
    }

    public void setRc(String rc) {
        this.rc = rc;
    }

    public String getMatriculeFiscale() {
        return matriculeFiscale;
    }

    public void setMatriculeFiscale(String matriculeFiscale) {
        this.matriculeFiscale = matriculeFiscale;
    }

    public String getRaison() {
        return raison;
    }

    public void setRaison(String raison) {
        this.raison = raison;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    

    
}
