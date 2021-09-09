package com.horizon.hapt.models;

public class ImageUser {
    private int id ;
    private String image ;

    public ImageUser(int id, String image) {
        this.setId(id);
        this.setImage(image);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    
}
