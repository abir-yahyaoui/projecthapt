package com.horizon.hapt.models;
import java.util.Date;
import java.util.List;

public class User {
    private long id ;
    private String mail;
    private String password ;
    private String nom;
    private String prenom;
    private String adresse;
    private int tel;
    private  Date dateN ;
    private int cin;
    private String niveau;
    private List <Role> listRole;
    private List <Etudiant> listEtudiant ;
    private List<Formateur> listFormateur ;
    private List<Entreprise> listEntreprise ;

    public User(String mail, String password, String nom, String prenom, String adresse, int tel, Date dateN, int cin,
            String niveau,long id) {
        this.setMail(mail);
        this.setPassword(password);
        this.setNom(nom);
        this.setPrenom(prenom);
        this.setAdresse(adresse);
        this.setTel(tel);
        this.setDateN(dateN);
        this.setCin(cin);
        this.setNiveau(niveau);
        this.setId(id);
    }
    public List<Entreprise> getListEntreprise() {
        return listEntreprise;
    }
    public void setListEntreprise(List<Entreprise> listEntreprise) {
        this.listEntreprise = listEntreprise;
    }
    public List<Formateur> getListFormateur() {
        return listFormateur;
    }
    public void setListFormateur(List<Formateur> listFormateur) {
        this.listFormateur = listFormateur;
    }
    public List <Etudiant> getListEtudiant() {
        return listEtudiant;
    }
    public void setListEtudiant(List <Etudiant> listEtudiant) {
        this.listEtudiant = listEtudiant;
    }
    public List <Role> getListRole() {
        return listRole;
    }
    public void setListRole(List <Role> listRole) {
        this.listRole = listRole;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNiveau() {
        return niveau;
    }
    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }
    public int getCin() {
        return cin;
    }
    public void setCin(int cin) {
        this.cin = cin;
    }
    public Date getDateN() {
        return dateN;
    }
    public void setDateN(Date dateN) {
        this.dateN = dateN;
    }
    public int getTel() {
        return tel;
    }
    public void setTel(int tel) {
        this.tel = tel;
    }
    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    

   
    
   
}
