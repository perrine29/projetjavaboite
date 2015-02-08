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
public class BarmaidCool extends Barman implements BarmanAction{

    public BarmaidCool() {
        super(); //cela permet de récupérer le constructeur de la classe mère
        setSexe ("feminin");
        
        setBeauty(3);
        
        setFun(4);
        
    }
    
    
  @Override
     public  void refuserDeServir(){
      System.out.println("Vous êtes trop saoul monsieur, je ne peux plus vous servir !");     
       
     }
     
     @Override
     public void embrasser(){
         
         System.out.println("kiou");
     }
     
    
}

