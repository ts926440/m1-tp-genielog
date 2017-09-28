/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

/**
 *
 * @author ts926440
 */

import java.util.ArrayList;


public class Panier {
    
    private ArrayList alpanier; 
    private int taille;
    
    public Panier(){
        ArrayList alpanier = new ArrayList();
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
}
