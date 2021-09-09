package com.horizon.hapt.models;



public class Formateur {
    private long id ;
    private int experience ;

    public Formateur(long id, int experience) {
        this.setId(id);
        this.experience = experience;
    }

    
    public long getId() {
        return id;
    }


    public void setId(long id) {
        this.id = id;
    }


    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
    
   
    
    

   
   

    
}
