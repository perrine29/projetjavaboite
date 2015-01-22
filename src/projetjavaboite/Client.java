/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjavaboite;
import java.util.Random;
import java.util.Scanner;
import projetjavaboite.Bouncer;
import projetjavaboite.BoiteDeNuit;
import projetjavaboite.exception.barException;
/**
 *
 * @author isen
 */
public class Client {
    
    //variable d'instance
    public String sexe; // permet aux enfants de la classe mère d'utiliser ces variables d'instance 
    public int age;
    public int etat;
    public int beaute;
    public int budget;
    
    Scanner sc=new Scanner(System.in);
    //constructeur
    public Client(){
    sexe="inconnu";
    age=0;
    budget= 0;
    beaute=0;
    etat= 0;
        
    }
    // Accesseurs
    public String getSexe(){
        return sexe;
    }
    
    public int getAge(){
        return age;
    }
    public int getEtat(){
        return etat;
    }
    public int getBeauté(){
        return beaute;
    }
    public int getBudget(){
        
        return budget ;
    }
    
  
    //Mutateurs
    public void setAge(int newAge){
        age=newAge;
    }
    public void setSexe(String newSexe){
        sexe=newSexe;
    }
    public void setEtat(int newEtat){
        this.etat= this.etat + newEtat;
    }
    public void setBeaute(int bBeaute){
        beaute= bBeaute;
    }
    public void setBudget(int bBudget){
        this.budget=this.budget + bBudget;
        
        
    }
     Bouncer bouncer1= new Bouncer();

    //Les méthodes
    
     public void getInTheClub(){
        
        
    }
     
   public void draguer(){
     
   
  } 
 
    public int ArriverDevantLaBoite(){
    System.out.println("Vous êtes actuellement devant une boite de nuit, que voulez vous faire ? \n 1- Entrer dans la boite de nuit \n 2- Rester devant la boite \n 3- Quitter le simulateur");
        String choix;
      int reponse = 0;
           
       
       choix= sc.nextLine();
       
            switch(choix){
               
               case "1":  
               reponse = 1;
               
                break;
               case "2": 
                   reponse =2;
               
               break;
               case "3":
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
            String sexe =sc.nextLine();
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
  
    
    
   public void tonEtat(){
       
       System.out.println("Vous êtes dans la boite de nuit! Choisissez vore profil : \n");
     String etat1;
     
     System.out.println("Votre etat: \n 1- Sobre \n 2- Joyeux/Joyeuse \n 3- Bourré(e)");
     etat1 = sc.nextLine();
     
     switch (etat1){
         case "1": 
             this.etat= 0;
             break;
         case "2":
             this.etat=3;
             break;
         case "3":
             this.etat=5;
             break;
         default: System.out.println("erreur de saisie, merci de rentrer 1,2 ou 3");
        this.tonEtat();
     }
     
       System.out.println(this.etat);
    this. tonBudget();  
        
   } 
    
  public void tonBudget(){
       
        String budget1;
        
     System.out.println("Votre budget: \n 1- 20 euros \n 2- 40euros \n 3-100euros");
     budget1= sc.nextLine();
     
     switch (budget1) {
         
         case "1":
             this.budget= 20;
             break;
             
        case"2":
            this.budget= 40;
            break;
        case "3":
            this.budget=100;
            break;
     
        default: System.out.println("Erreur de saisie, veuillez entrer 1,2 ou 3");
         this.tonBudget();
    }  
      System.out.println(this.budget);  
    this. taBeauté();  
 
  } 
    
    public void taBeauté(){
       
        String beauté1;
        
     System.out.println("Votre beauté: \n 1- beau/belle \n 2- moche \n 3- ni l'un, ni l'autre");
     beauté1= sc.nextLine();
     
     switch (beauté1 ){
     
         
         case"1":
             this.beaute= 3;
             break;
        case"2":
            this.beaute=1;
            break;
        case"3":
            this.beaute=2;
            break;
             
        default: System.out.println("Erreur de saisie, veuillez entrer 1,2 ou 3");
         this.taBeauté();
    }  
        System.out.println(this.beaute);
    this. SeDéplacer();  
    }
    
    
    
 public void SeDéplacer(){
     
   
     System.out.println("Vous êtes dans la boite de nuit! Que voulez vous faire: \n 1- aller au bar \n 2- aller danser \n 3- Jouer \n 4- Sortir de la boite"); 
     
     String choix = sc.nextLine();
     
     switch(choix){
         
         case "1": 
             this.goToTheBar();
             break;
         case "2":
             break;
         case "3":
             break;
         case "4": System.out.println("Merci d'être venu(e)");
         this.ArriverDevantLaBoite();
             
             break;
         default: System.out.println("erreur de saisie, veuillez reformuler votre choix");
           this.SeDéplacer();          
             
            
         
     }
     // aller au bar : commander budget, danser sur le bar: enerver le videur, voler un verre enerver le videur , jeu de la carte: budget
     
     // aller danser: danser comme un beau goss, danser comme un looser, draguer, renverser son verre 
     
     // 
 }
 
  public void goToTheBar() {
      
     try{
         
         System.out.println("Vous êtes au bar !!! Que voulez-vous faire: \n 1- Prendre un verre \n 2- Jouer au jeu de la carte (mise de 25euros) \n 3- Draguer la serveuse/le serveur \n 4- Danser sur le bar \n 5- Quitter le bar");   
         
         String choiceBar = sc.nextLine();
         
         switch(choiceBar){
             
             
             case "1":  
                 this.drink();
                 break;
                 
             case "2": 
                 this.jeuDeLaCarte();
                 break;
                 
             case"3":
                 this.draguer();
                 break;
                 
             case"4":
                 this.danseOnTheBar(bouncer1);
                 break;
                 
             case "5": 
                 this.SeDéplacer();
                 break;
             default: System.out.println("erreur de saisie, merci de reformuler votre choix par 1,2,3 ,4 ou 5");
                 this.goToTheBar();
         }
         }
     
     catch
             (barException e) {
            System.out.println(e.getMessage());
            this.SeDéplacer();
  }
  }    
 
 
 public void drink() throws barException {
     
       if (this.budget< 5) {
            throw new barException("\nVous n'avez plus d'argent!!");
            
            
        } else {
     
     System.out.println("\n Que voulez-vous boire? \n 1- une bière: 5euros \n 2-un cocktail: 10euros\n 3- un soft: 5euros\n 4- Je n'ai plus soif ");  
     String boisson= sc.nextLine();
     
    // if(this.budget ==0 ){
      //   System.out.println("Vous n'avez plus d'argent");
     //}
     //else{
     
         switch(boisson){
          
             case "1":
  
                 this.setBudget(-5);
                 this.setEtat(1);

                 break;
                 
             case "2":
                 if (this.budget >=10){
                 this.setBudget(-10);
                 this.setEtat(1);
                         }
             else { System.out.println("Vous n'avez pas assez d'argent pour un cocktail");
            this.goToTheBar();}
              break;
              
             case "3":
  
              this.setBudget(-5);
              this.setEtat(0);
              
                 break;
             case "4" :
                 this.goToTheBar();
                 break;
                 
             default: System.out.println("erreur de saisie, veuillez entrer 1,2,3 ou 4");
                 this.drink();
                                                                                                                                            
         }
         System.out.println(" Votre budget est maintenant de :" + this.budget);
       this.drink();
    
       
     }
 }
         
      public void jeuDeLaCarte()throws barException{
          
          System.out.println("La carte bleu qui sera tiré au sort devra payer à boire à toute la table !!! ");  
          
          
           if (this.budget< 25) 
            throw new barException("\nVous n'avez pas assez d'argent, vous devez disposer de 25 euros!!");
          else{
                    
                    }
        String test[]={"Vous avez perdu","Vous avez gagné"};
        int idx = new Random().nextInt(test.length);
        String random = (test[idx]);
        System.out.println(random);
        
      
        switch(random){
            
            case "Vous avez perdu":
                
            this.setBudget(-25);
            this.setEtat(1);
            break;
                
            case  "Vous avez gagné":
            this.setEtat(1);    
           
                break;
                
            default: System.out.println("erreur");
                 
        }     
        
          
          System.out.println("Votre budget est de:" + this.budget);   
          this.goToTheBar();
      }   
      
      
    
  public void danseOnTheBar(Bouncer bouncer1){
  
    
      
      if (this.beaute > 1 || this.etat < 5)
      { 
         
         
          System.out.println("\n Vous mettez l'ambiance comme jamais !!!"
                  + "\n Attention de ne pas trop énerver le videur ..."); 
          
            bouncer1.setHumor(1);
            System.out.println(bouncer1.getHumor());
          
          this.goToTheBar();
      } 
          
      else    
      {
         
          System.out.println("Le videur n'apprécie pas votre danse ! \n Au revoir ! ");
          this.ArriverDevantLaBoite();
      }
     
      
  }
  
  
      
      
     
 }
 

 
 
 


    

