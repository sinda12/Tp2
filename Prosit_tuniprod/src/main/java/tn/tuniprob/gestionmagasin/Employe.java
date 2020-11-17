/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.tuniprob.gestionmagasin;

/**
 *
 * @author sinda
 */
abstract class Employe {
    private int id,nbrH;
    private String nom,adresse;

    public Employe() {
    }

    public Employe(int id, int nbrH, String nom, String adresse) {
        this.id = id;
        this.nbrH = nbrH;
        this.nom = nom;
        this.adresse = adresse;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNbrH() {
        return nbrH;
    }

    public void setNbrH(int nbrH) {
        this.nbrH = nbrH;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "," + "id=" + id + ", nbrH=" + nbrH + ", nom=" + nom + ", adresse=" + adresse + '}';
    }
    
    public abstract double Salaire();
      
    
    
    
}
