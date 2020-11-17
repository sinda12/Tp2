/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.tuniprob.gestionmagasin;

/**
 *
 * @author Sinda
 */
public class Responsable extends Employe {
    private double prime;

    public Responsable() {
    }

    public Responsable(double prime, int id, int nbrH, String nom, String adresse) {
        super(id, nbrH, nom, adresse);
        this.prime = prime;
    }

    public double getPrime() {
        return prime;
    }

    public void setPrime(double prime) {
        this.prime = prime;
    }

    @Override
    public String toString() {
        return "Responsable : {" + "prime=" + prime+"dt" + super.toString();
    }
    
    @Override
    public double Salaire() {
        int nbrH = super.getNbrH();
        double salaire=nbrH*10+prime;
        if (nbrH>160){
            salaire +=(nbrH-160)*0.2*10;
        }
        return salaire;
    }
    
    
}
