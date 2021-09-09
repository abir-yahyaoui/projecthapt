package com.horizon.hapt.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(schema = "haptdb" ,uniqueConstraints =@UniqueConstraint(columnNames = "nom")) /**rechercher par le nom d'user par le nom de role  */
public class Role implements Serializable{
    public static final long serialVersionUID=1l ;
    @Column
    private long id ;
    @Column
    private String nom;

    public Role (long id , String nom){
        this.id=id;
        this.nom=nom;
    }

    public long getId(){
        return id;
    }
    public void setId(long id ){
        this.id=id ;
    }

    public String getNom(){
        return nom;
    }
    public void setNom(String nom){
        this.nom=nom;
    }

    public long getSerialVersionUID() {
        return serialVersionUID;
    }
    

    


    
}
