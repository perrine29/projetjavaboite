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
public class Dansefloor {
    


    Bouncer bouncer1 = new Bouncer();

  // Barman newBarman = new Barman();

    beerPong newPlayer = new beerPong();
    
    
   
    
  
    
    public void setBarman(String sexe){
        
        if ( sexe.equalsIgnoreCase("1"))
        {
         
            Barman newBarman= new BarmaidCool();
            
        }
  
       if (sexe.equalsIgnoreCase("2")) 
       {
          Barman newBarman= new BarmanCool();
       }
                
    }
    
    
}
