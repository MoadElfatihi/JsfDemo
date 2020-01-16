package com.jsf;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;

@ManagedBean
public class Instructor {

	@ManagedProperty(value = "#{user}")
	private User user;

	private String langueEnseignement ;
	
	private int annee_experience;
	
	private List<String> matieres;

	public Instructor() {
		super();
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getLangueEnseignement() {
		return langueEnseignement;
	}

	public void setLangueEnseignement(String langueEnseignement) {
		this.langueEnseignement = langueEnseignement;
	}

	public int getAnnee_experience() {
		return annee_experience;
	}

	public void setAnnee_experience(int annee_experience) {
		this.annee_experience = annee_experience;
	}

	public List<String> getMatieres() {
		return matieres;
	}

	public void setMatieres(List<String> matieres) {
		this.matieres = matieres;
	}	
}
