/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.tuniprob.gestionmagasin;

import java.util.Scanner;

/**
 *
 * @author sinda
 */
public class Magasin {
    static Scanner sc = new Scanner(System.in);
    private int identifiantMag;
    private String adresse, nom;
    private final int capaciteMag =50;
    public static int nbrTotalP = 0;
    private int nbrP = 0,nbrE=0;
    public Produit[] produits = new Produit[capaciteMag];
    public Employe[] employe = new Employe[20];
    
    
    public Magasin(int identifiantMag, String nom, String adresse) {
        this.identifiantMag = identifiantMag;
        this.adresse = adresse;
        this.nom = nom;
    }

    public Magasin(int identifiantMag, String adresse) {
        this.identifiantMag = identifiantMag;
        this.adresse = adresse;
    }

    public int getIdentifiantMag() {
        return identifiantMag;
    }

    public void setIdentifiantMag(int identifiantMag) {
        this.identifiantMag = identifiantMag;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public static int getNbrTotalP() {
        return nbrTotalP;
    }

    public static void setNbrTotalP(int nbrTotalP) {
        Magasin.nbrTotalP = nbrTotalP;
    }

    public int getNbrP() {
        return nbrP;
    }

    public void setNbrP(int nbrP) {
        this.nbrP = nbrP;
    }
    
    //deja enregistrer dans Produit
    public void ajouterProduit(Produit p) {
        try{
        //if (nbrP < 50) {
            if (!chercher(p)) {
                produits[nbrP] = p;
                nbrP++;
                nbrTotalP++;
            } else {
                System.out.println("le produit existe");
            }

        }  
        catch (Exception e){
            System.out.println("Vous avez atteint la capacité maximale");
        }
    }
    //new Produit
        public void ajouterProduit(int identifiant, String libelle, String marque, double prix) {
        if (nbrP < 50) {
            Produit p = new Produit(identifiant, libelle, marque, prix);
            if (!chercher(p)) {
                produits[nbrP] = p;
                nbrP++;
                nbrTotalP++;
            } else {
                System.out.println("Le produit existe déjà");
            }

        } else {
            System.out.println("Magasin plein");
        }
    }
    
    
     public boolean chercher(Produit p) {
        for (int i = 0; i < nbrP; i++) {
            if (p.comparer(produits[i])) {
                return true;
            }
        }
        return false;
    }
    public void afficher() {
        System.out.println("l'identifiant de magasin :" + identifiantMag + " nom : " + nom + " addresse : " + adresse);

        for (int i = 0; i < nbrP; i++) {
            System.out.println(produits[i]);
        }
    }
    public int trouverProduit(Produit p) {
        for (int i = 0; i < nbrP; i++) {
            if (p.comparer(produits[i])) {
                return i;
            }
        }
        return -1;
    }    
        public void supprimerProduit(Produit p) {
        int indice = trouverProduit(p);

        if (indice != -1) {
            produits[indice] = produits[nbrP - 1];
            nbrP--;
            nbrTotalP--;
        } else {
            System.out.println("le produit selectionné n'existe pas dans ce magasin");
        }
    }
    public static Magasin comparerNbrProduits(Magasin m1, Magasin m2) {
        if (m1.getNbrP() > m2.getNbrP()) {
            return m1;
        }
        return m2;
    }
    public void ajouterEmploye(Vendeur v){
       if (nbrE<20){
           employe[nbrE]=v;
           nbrE++;
       }
       else {System.out.println("Vous avez atteint le nombre maximum des employes ");}
        
        
    }
     public void ajouterEmploye(Caissier c){
       if (nbrE<20){
           employe[nbrE]=c;
           nbrE++;
       }
       else {System.out.println("Vous avez atteint le nombre maximum des employes ");}
        
        
    }
      public void ajouterEmploye(Responsable r){
       if (nbrE<20){
           employe[nbrE]=r;
           nbrE++;
       }
       else {System.out.println("Vous avez atteint le nombre maximum des employes ");}
        
        
    }
      public void afficheEmploye(){
          for(int i=0;i<nbrE;i++){
              System.out.println(employe[i]+" Salaire : "+employe[i].Salaire()+"dt" );
              
          }
      }
     
    
    public void afficheMagasin(){
        System.out.println("Magasin: id=" + identifiantMag + " nom= " + nom + " addresse=" + adresse);
        
        for (int i=0;i<nbrP;i++){
            System.out.println(produits[i]);
        }
        /*for (int i=0;i<nbrE;i++){
            System.out.println(employe[i]);
        }*/
        afficheEmploye();
        
    }

    @Override
    public String toString() {
        return "Magasin{" + "identifiantMag=" + identifiantMag + ", adresse=" + adresse + ", nom=" + nom + ", capaciteMag=" + capaciteMag + ", nbrP=" + nbrP + ", nbrE=" + nbrE + ", produits=" + produits + ", employe=" + employe + '}';
    }
    
    
   
    
    
}
