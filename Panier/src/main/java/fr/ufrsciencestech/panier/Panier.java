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
    
    private ArrayList<Orange> alpanier; 
    private int taille;
    
    public Panier(){
        ArrayList<Orange> alpanier = new ArrayList<Orange>();
        taille = 5;
    }
    
    public Panier(int size){
        ArrayList alpanier = new ArrayList();
        taille = size;
    }
    
    public boolean estPlein(){
        boolean test=false;
         if(alpanier.size() == taille) 
       {
           test=true;
       } 
       return test;
    }
    
    public boolean estVide(){
        boolean test=false;
         if(alpanier.size() == 0) 
       {
           test=true;
       } 
       return test;
    }
    
    public void addPanier(Orange o){
       if(alpanier.size() <= taille) 
       {
           alpanier.add(o);
       } 
       else 
       {
           System.out.println("Plus de place dans le panier. /n");
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
     
     public void boycotteOrigine(String pays){
         for (Orange o : alpanier){
             if (o.getOrigine().equals(pays)) {
                 alpanier.remove(o);
             }
         }
     }
}
