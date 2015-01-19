/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjavaboite;
import java.util.Scanner;
/**
 *
 * @author isen
 */
    
    
    public class Women extends Client {
    
    public Women(){
        super();
        this.sexe="féminin";
    }
      Scanner sc=new Scanner(System.in);



     @Override public void getInTheClub(){
System.out.println("Que voulez-vous dire au vigil? \n 1:Bonjour \n 2:Salut max, comment tu vas ? ! \n 3:Je crois que je vais vomir \n");
        int presentationChoice;
        presentationChoice=sc.nextInt();
        
        switch (presentationChoice){
              case 1: System.out.println("Bonjour mademoiselle, allez y ");
       
        ArriverDevantLaBoite();
            
                break;
            case 2:
                System.out.println("Salut blabla");
                SeDéplacer();
                
                break;
            case 3:
                System.out.println("t'as pas ta place ici , dégage!");
                ArriverDevantLaBoite();
                
                break;
                
            default: System.out.println("erreur de saisie"); 
                getInTheClub();
                
         }
     }
     
     
     
     
    }