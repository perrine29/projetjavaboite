/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjavaboite;
import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author isen
 */
public class Client {
    
    //variable d'instance
    public String sexe; // permet aux enfants de la classe mère d'utiliser ces variables d'instance 
    public int age;
    public String etat;
    public int beaute;
    public int budget;
    Scanner sc=new Scanner(System.in);
    //constructeur
    public Client(){
    sexe="inconnu";
    age=0;
    etat="inconnu";
        
    }
    // Accesseurs
    public String getSexe(){
        return sexe;
    }
    
    public int getAge(){
        return age;
    }
    public String getEtat(){
        return etat;
    }
    public int getBeauté(){
        return beaute;
    }
    public int getBudget(){
        return budget;
    }
    //Mutateurs
    public void setAge(int newAge){
        age=newAge;
    }
    public void setSexe(String newSexe){
        sexe=newSexe;
    }
    public void setEtat(String newEtat){
        etat=newEtat;
    }
    public void setBeaute(int bBeaute){
        beaute=bBeaute;
    }
    public void setBudget(int bBudget){
        budget=bBudget;
    }
    //Les méthodes
    
     public void getInTheClub(){
        
        
    }
 
    public int ArriverDevantLaBoite(){
    System.out.println("Vous êtes actuellement devant une boite de nuit, que voulez vous faire ? \n 1- Entrer dans la boite de nuit \n 2- Rester devant la boite \n 3- Quitter le simulateur");
       int choix=0;
       int reponse=0;
           
       
       choix= sc.nextInt();
       
            switch(choix){
               
               case 1:  
               reponse = 1;
               
                break;
               case 2: 
                   reponse =2;
               
               break;
               case 3:
                   reponse = 3;
                  
               break;
                   
               default: 
                    System.out.println("vous n'avez pas fait le bon numéro");
               this.ArriverDevantLaBoite();
           }
            
          return reponse; 
         }
    
    
    public void Age(){
        
      
     System.out.println("Bonjour, quel age avez-vous");
            this.age = sc.nextInt();
        
    
    
    
    
}
    
    
    public Client clientCaract(){
        
        Client newClient = null ;
        
        /*if (this.age >= 50 || this.age < 18){
            System.out.println("Désolé, vous n'avaez pas l'age d'aller en boite !");
            ArriverDevantLaBoite();
        }*/
       
            System.out.println("êtes vous un homme ou une femme ?");
            String sexe=sc.next();
            switch (sexe){
                case "homme" :
                      newClient = new Men(); // Men.getInTheClub();
                       System.out.println(newClient.sexe);
                       
                               
                    break;
                case "femme": 
                      newClient = new Women();//  Women.getInTheClub();
                       System.out.println(newClient.sexe);
                       
                       
                    break;
                    
                default : System.out.println("erreur dans la saisie de la réponse");   
                    this.clientCaract();
            }
  this.getInTheClub();
                        
 newClient.getInTheClub();
  return newClient;
    }
  
 public void SeDéplacer(){
     
     System.out.println("Vous êtes dans la boite de nuit! Que voulez vous faire: \n 1- aller au bar \n 2- aller danser \n 3- Jouer \n 4- Sortir de la boite"); 
     
     int choix = sc.nextInt();
     
     switch(choix){
         
         case 1:
             break;
         case 2:
             break;
         case 3:
             break;
         case 4: System.out.println("Merci d'être venu(e)");
         //ArriverDevantLaboite();
             
             break;
         default: System.out.println("erreur de saisie, veuillez reformuler votre choix");
                     
             
            
         
     }
     // aller au bar : commander budget, danser sur le bar: enerver le videur, voler un verre enerver le videur , jeu de la carte: budget
     
     // aller danser: danser comme un beau goss, danser comme un looser, draguer, renverser son verre 
     
     // 
 }
    
}

    

