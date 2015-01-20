/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjavaboite;

/**
 *
 * @author isen
 */
public class Bouncer extends BoiteDeNuit {
    
    protected int humor;
    
    public Bouncer(){
    super();
       this.humor=0;  
    }
    
    //Accumulateur 
    public int getHumor(){
        return humor;
    }
    
    public void setHumor(int newHumor){
       this.humor= this.humor + newHumor;   
    }
}
