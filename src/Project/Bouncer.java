/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

/**
 *
 * @author isen
 */
public class Bouncer  {
    
    protected int humor;
    
    public Bouncer(){
        
    super();
      humor=0;  
    }
    
    
   
    //Accumulateur 
    public int getHumor(){
        return humor;
    }
    
    public void setHumor(int newHumor){
       this.humor= this.humor + newHumor;  
       
    }
    
    
}
