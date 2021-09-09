package com.horizon.hapt.models;


public class Etudiant {
	private long id ;
	private int contactF ;
	private String mail;
	

	

	public Etudiant(long id, int contactF, String mail) {
		this.setId(id);
		this.contactF = contactF;
		this.setMail(mail);
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getContactF() {
		return contactF;
	}

	public void setContactF(int contactF) {
		this.contactF = contactF;
	}
   

    
    



    
}
