package edu.ip.agendanumerique;

import java.io.Serializable;

public class Contact implements Serializable {
    
    //DECLARATION DES ATTRIBUTS
    private String matricule;
    private String nom;
    private String prenom;
    private String numeroTelephone;
    
    //DEFINITION DES METHODES
    
    /*definition du constructeur*/
    public Contact(String matricule,String nom,String prenom,String numeroTelephone){
        this.matricule=matricule;
        this.nom=nom;
        this.prenom=prenom;
        this.numeroTelephone=numeroTelephone;
    }
    /*definition des methodes de lecture et de modification*/

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNumeroTelephone() {
        return numeroTelephone;
    }

    public void setNumeroTelephone(String numeroTelephone) {
        this.numeroTelephone = numeroTelephone;
    }
    
    
}
