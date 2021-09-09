package com.horizon.hapt.models;

import java.util.Date;

public class Inscription {
    private int id;
    private Date dateI ;
    private int tranche ;

    public Inscription(int id, Date dateI, int tranche) {
        this.setId(id);
        this.setDateI(dateI);
        this.setTranche(tranche);
    }

    public int getTranche() {
        return tranche;
    }

    public void setTranche(int tranche) {
        this.tranche = tranche;
    }

    public Date getDateI() {
        return dateI;
    }

    public void setDateI(Date dateI) {
        this.dateI = dateI;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
