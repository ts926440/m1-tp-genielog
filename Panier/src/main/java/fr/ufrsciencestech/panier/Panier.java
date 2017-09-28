/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

/**
 *
 * @author ts926440
 * 
 * modif push
 */

import java.util.ArrayList;
import fr.ufrsciencestech.panier.Orange;


public class Panier {
    
    private ArrayList<Orange> alpanier= new ArrayList<Orange>(); 
    private int taille;
    
    public Panier(){
        ArrayList<Orange> alpanier = new ArrayList<Orange>();
        taille = 5;
    }
    
    public Panier(int size){
        ArrayList<Orange> alpanier = new ArrayList<Orange>();
        taille = size;
    }
    
    public boolean estPlein(){
       boolean test = false;
      if (alpanier != null){ 
               if(alpanier.size() == taille) 
                {
                   test=true;
                } 
      }      
       return test;
    }
    
    public boolean estVide(){
        boolean test=false;
         if(alpanier.isEmpty()) 
       {
           test=true;
       } 
       return test;
    }
    
    public void addPanier(Orange o){
        
       if(this.estPlein()==false) 
       {
           alpanier.add(o);
       } 
       else 
       {
           System.out.println("Plus de place dans le panier. /n");
       }
       
    }
    
    public void addPanier(String pays, double prix){
       
       if(this.estPlein()!=false) 
       {
           System.out.println("Plus de place dans le panier. /n");
       } 
       else 
       {
           Orange o = new Orange(pays,prix);
           alpanier.add(o);
       }
       
    }
    
     public void retirePanier(){
       if (alpanier.size()>0){
       alpanier.remove(alpanier.size()-1);
       }
       else { System.out.println("Panier déjà vide");}
    }
     
     public double getPrix(){
         double prixTotal=0;
         for (int i = 0 ; i<alpanier.size();i++){
            prixTotal+=alpanier.get(i).getPrix();
         }
         
         return prixTotal;
     }
     
     public void boycotteOrigine(String pays){ //liste en cours de modif = erreur
         for (Orange o : alpanier){
             if (o.getOrigine().equals(pays)) {
                 alpanier.remove(o);
             }
         }
     }
}
