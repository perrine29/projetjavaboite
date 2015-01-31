/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
import Project.exception.barException;
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
    
     @Override public void getInTheClub(Dansefloor myDansefloor){
         
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
                
            this.inFrontOfTheClub(myDansefloor); // ajouter le cas ou le type peut entrer, sedeplacer
            break;
                
            case  "Vous avez fait bonne impression, vous pouvez entrer in da club":
            this.yourState(myDansefloor);    
           
                break;
                
            default: System.out.println("erreur");
                
                
        }
        
        
 
            }
                break;
            case 2:
                System.out.println("Salut mon pote, vas-y entre");
                this.yourState(myDansefloor);
                
                break;
            case 3:
                System.out.println("t'as pas ta place ici , dégage!");
                this.inFrontOfTheClub(myDansefloor);
                
                break;
                
            default: System.out.println("erreur de saisie"); 
                this.getInTheClub(myDansefloor);
                
         }
     }
     
     
      public void chat(Barman newBarman,Dansefloor myDansefloor){
         
    try{     
         
          System.out.println("Que voulez-vous faire :\n 1) Offrir un verre \n 2) draguer la serveuse \n 3) J'ai changé d'avis" ); 
    String choice;
    choice=sc.nextLine();
    
    switch (choice){
        case "1":
            
        this.offerDrink(newBarman,myDansefloor);
        break;
            
        case "2":
            System.out.println("pas codé");
         break;
            
        case "3":
       this.move(myDansefloor); 
            break;
            
        default: System.out.println(" erreur de saisie");
     }
    
     }
    
      catch
        (barException e) {
            System.out.println(e.getMessage());
            this.move(myDansefloor);
  }
    
    
}   
    
         
}         
     
    
     
     
     
     

