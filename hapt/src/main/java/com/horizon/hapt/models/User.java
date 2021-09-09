package com.horizon.hapt.models;
import java.io.Serializable;
import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
@Table(schema = "haptdb",uniqueConstraints =@UniqueConstraint(columnNames = "mail"))
public class User implements Serializable /**pour incrementation  */ {
    private static final long serialVersionUID=1l ; /**incrementation */
    @Column
    private long id ;
    @Column
    private String mail;
    @Column
    private String password ;
    @Column
    private String nom;
    @Column
    private String prenom;
    @Column
    private String adresse;
    @Column
    private int tel;
    @Column
    private  Date dateN ;
    @Column
    private int cin;
    @Column
    private String niveau;
    @JoinColumn(name = "role",referencedColumnName = "id")
    @ManyToOne
    private Role role;
    

    public User(long id, String mail, String password, String nom, String prenom, String adresse, int tel, Date dateN,
            int cin, String niveau, Role role) {
        this.id = id;
        this.mail = mail;
        this.password = password;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.tel = tel;
        this.dateN = dateN;
        this.cin = cin;
        this.niveau = niveau;
        this.role = role;
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

    public Role getRole() {
        return role;
    }
    public void setRole(Role role) {
        this.role = role;
    }

    public long getSerialVersionUID() {
        return serialVersionUID;
    }
    


    

   
    
   
}
