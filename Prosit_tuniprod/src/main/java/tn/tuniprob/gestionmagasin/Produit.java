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

import java.util.Date;
import java.util.Scanner;
import java.text.*;

public class Produit {
    Scanner sc = new Scanner(System.in);
    int identifiant;
    String libelle;
    String marque ;
    double prix;
    Date date_ex=new Date();
    SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
    public static int nbrP;
    int n=0;

    
    public Produit() {nbrP++;}

    public Produit(int Validentifiant, String Vallibelle, String Valmarque) {
        identifiant = Validentifiant;
        libelle = Vallibelle;
        marque = Valmarque; 
        nbrP++;
    }

    public Produit(int Validentifiant, String Vallibelle, String Valmarque, double Valprix) {
        identifiant = Validentifiant;
        libelle = Vallibelle;
        marque = Valmarque;
        prix = Valprix;
        nbrP++;
    }
    
    /*public void afficher(){
    System.out.println("identifiant : "+identifiant);    
    System.out.println("libelle : "+libelle);
    System.out.println("marque : "+marque);
    System.out.println("prix : "+prix);
    System.out.println(sdf.format(date_ex));
    }*/
    
    public void afficher(){
        System.out.println(identifiant + "" + this.libelle + " "+ this.marque +" "+this.prix);
    }
    

    public double getPrix() {
        return prix;
    }
    

    public void setPrix(double prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Produit : {"  + "identifiant=" + identifiant + ", libelle=" + libelle + ", marque=" + marque + ", prix=" + prix + '}';
    }
    
    


    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }
    
    
    public Date getDate_ex() {
        return date_ex;
    }

    public void setDate_ex(Date date_ex) {
        this.date_ex = date_ex;
    }

    public static int getNbrP() {
        return nbrP;
    }

    public static void setNbrP(int nbrP) {
        Produit.nbrP = nbrP;
    }
    public boolean comparer(Produit p) {
        return ((this.identifiant == p.getIdentifiant() )
                && (this.libelle.equalsIgnoreCase(p.getLibelle()))
                && (this.prix == p.getPrix()));
    }
    
    public static boolean comparer(Produit p1, Produit p2) {
        return ((p1.getIdentifiant()== p2.getIdentifiant())
                && (p1.getLibelle().equalsIgnoreCase(p2.getLibelle()))
                && (p1.getPrix() == p2.getPrix()));
    }    

 

  
    
    
    
    
    
    
}

