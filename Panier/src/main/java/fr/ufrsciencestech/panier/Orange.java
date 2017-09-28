package fr.ufrsciencestech.panier;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ts926440
 */
public class Orange {
    private String origine;
    private double prix;
    
    public Orange(){
        origine="France";
        prix=2.00;
    }
    public Orange(String pays, double p){
        origine=pays;
        prix=p;
    }
    
    public double getPrix(){
        return prix;
    }
    public String getOrigine(){
        return origine;
    }
    
    /*public boolean equals(Orange o){
        
        return this.;
    }*/
}
