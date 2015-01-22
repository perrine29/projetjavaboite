/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author isen
 */

public class Men extends Client {
    public Men(){
        super(); //cela permet de récupérer le constructeur de la classe mère
        this.sexe="masculin";    
    }
     
    Scanner sc=new Scanner(System.in);
    
     @Override public void getInTheClub(){
         
        System.out.println("Que voulez-vous dire au vigil? \n 1:Bonjour \n 2:Yo, mon pote ! \n 3:Je crois que je vais vomir \n");
        int presentationChoice;
        presentationChoice=sc.nextInt();
        
        switch (presentationChoice){
              case 1: {
        String phrase[]={"désolé, le videur est de mauvaise humeur,réessayer plus tard!","Vous avez fait bonne impression, vous pouvez entrer in da club"};
        int idx = new Random().nextInt(phrase.length);
        String random = (phrase[idx]);
        System.out.println(random);
        
      
        switch(random){
            
            case "désolé, le videur est de mauvaise humeur,réessayer plus tard!":
                
            this.inFrontOfTheClub(); // ajouter le cas ou le type peut entrer, sedeplacer
            break;
                
            case  "Vous avez fait bonne impression, vous pouvez entrer in da club":
            this.yourState();    
           
                break;
                
            default: System.out.println("erreur");
                
                
        }
        
        
 
            }
                break;
            case 2:
                System.out.println("Salut mon pote, vas-y entre");
                this.yourState();
                
                break;
            case 3:
                System.out.println("t'as pas ta place ici , dégage!");
                this.inFrontOfTheClub();
                
                break;
                
            default: System.out.println("erreur de saisie"); 
                this.getInTheClub();
                
         }
     }
     
     
     public void chat(){
        
         
         
     }
     
     
     
     
     
     }
     
    
         
         
     
     
     
     
     
     

