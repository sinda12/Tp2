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
public class Caissier extends Employe{
    private int numeroDeCaisse;

    public Caissier() {
    }

    public Caissier(int numeroDeCaisse, int id, int nbrH, String nom, String adresse) {
        super(id, nbrH, nom, adresse);
        this.numeroDeCaisse = numeroDeCaisse;
    }

    public int getNumeroDeCaisse() {
        return numeroDeCaisse;
    }

    public void setNumeroDeCaisse(int numeroDeCaisse) {
        this.numeroDeCaisse = numeroDeCaisse;
    }

    @Override
    public String toString() {
        return "Caissier : {" + "numeroDeCaisse=" + numeroDeCaisse + super.toString();
    }

    @Override
    public double Salaire() {
        int nbrH = super.getNbrH();
        double salaire = nbrH*5;
        if (nbrH>180){
            salaire +=(nbrH-180)*0.15 *5;
        }
        return salaire;
    }
    

    
}
