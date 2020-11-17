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
        public class Main {
 Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //Produit p1 = new Produit();
        Produit p2 = new Produit(1021,"Lait","Delice");
        Produit p3 = new Produit(1021,"Yaourt","Vitalait");
        Produit p4 = new Produit(3250,"Tomate","Sicam",1.200);
        Magasin m1 = new Magasin(1,"Carrefour","Centre-Ville");
        Magasin m2 = new Magasin(1,"Monoprix","Menzah 6");

        //m1
        Vendeur m1v1 = new Vendeur(0.8f,22,40,"Ahlem","Menzah 7");
        Caissier m1c1 = new Caissier(1,01,122,"Ahmed","Tunis");
        Caissier m1c2 = new Caissier(2,02,188,"Maissa","Tunis");
        Responsable m1r1 = new Responsable(1200.5,3,19,"Wael","Aouina");
        //m2
        Caissier m2c1 = new Caissier(8,22,198,"Ahmed","Tunis");
        Vendeur m2v1 = new Vendeur(1.2f,4,40,"Manel","Menzah 6");
        Vendeur m2v2 = new Vendeur(2.8f,9,40,"Nour","Ariena");
        Vendeur m2v3 = new Vendeur(0.8f,12,40,"Wissal","Menzah 7");
        Responsable m2r1 = new Responsable(1000.5,32,29,"Majd","Aouina");
       
        
/*        
System.out.println("------------- Produit 1 (vide)------------");  
p1.afficher();
System.out.println("------------- Produit 2 ------------");  
p2.afficher();
System.out.println("------------- Produit 3 ------------");  
p3.afficher();
System.out.println("------------- Produit 4 ------------");  
p4.afficher();
System.out.println(Produit.getNbrP()); 


p2.setPrix(0.700);
System.out.println("------------- Produit 2 avec Prix------------");  
p2.afficher();

p1.setIdentifiant(2544);
p1.setLibelle("Canette");
p1.setMarque("Fanta");
p1.setPrix(0.900);
p3.setPrix(0.500);

Date d1 = new Date(121, 1, 6);
p1.setDate_ex(d1);
Date d2 = new Date(122, 2, 12);
p2.setDate_ex(d2);
Date d3 = new Date(120, 12, 11);
p3.setDate_ex(d3);
Date d4 = new Date(121, 4, 9);
p4.setDate_ex(d4);




System.out.println("------------- Produits avec modification------------");  
System.out.println("------------|                            |------------");  
System.out.println("------------- Produit 1 ------------");  
p1.afficher();
System.out.println("------------- Produit 2 ------------");  
p2.afficher();
System.out.println("------------- Produit 3 ------------");  
p3.afficher();
System.out.println("------------- Produit 4 ------------");  
p4.afficher();

System.out.println("------------- avec To String ------------"); 
System.out.println(p1.toString());
System.out.println(p2.toString());
System.out.println(p3.toString());
System.out.println(p4.toString());*/

//ajout des produit
m1.ajouterProduit(1230,"pain","saida",0.2);
m1.ajouterProduit(1240,"pain","saida",0.21);
m1.ajouterProduit(p2);

m2.ajouterProduit(p3);
m2.ajouterProduit(p4);
m2.ajouterProduit(2015,"chocolat", "west",24);

System.out.println(Produit.getNbrP());



        //ajout m1
        m1.ajouterEmploye(m1v1);
        m1.ajouterEmploye(m1c1);
        m1.ajouterEmploye(m1c2);
        m1.ajouterEmploye(m1r1);
        //ajout m2
        m2.ajouterEmploye(m2v1);
        m2.ajouterEmploye(m2v2);
        m2.ajouterEmploye(m2v3);
        m2.ajouterEmploye(m2c1);
        m2.ajouterEmploye(m2r1);

System.out.println("--------------------les enmployes de Magasin 1--------------------");
m1.afficheEmploye();
System.out.println("--------------------les enmployes de Magasin 2--------------------");
m2.afficheEmploye();
System.out.println("--------------------|               | --------------------");
System.out.println("--------------------Magasin 1 --------------------");
m1.afficheMagasin();
System.out.println("--------------------Magasin 1 --------------------");
m2.afficheMagasin();

    }
    
}
