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
public class Vendeur extends Employe{
    private float tauxDeVente;

    public Vendeur() {
    }

    public Vendeur(float tauxDeVente, int id, int nbrH, String nom, String adresse) {
        super(id, nbrH, nom, adresse);
        this.tauxDeVente = tauxDeVente;
    }

    public float getTauxDeVente() {
        return tauxDeVente;
    }

    public void setTauxDeVente(float tauxDeVente) {
        this.tauxDeVente = tauxDeVente;
    }

    @Override
    public String toString() {
        return "Vendeur : {" + "tauxDeVente=" + tauxDeVente + super.toString();
    }

    @Override
    public double Salaire() {
       int nbrH=super.getNbrH();
       double salaire=450*tauxDeVente;
       return salaire;
    }


    
    
    
}
