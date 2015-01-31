/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
import java.util.Random;
import java.util.Scanner;
import Project.Bouncer;
import Project.Dansefloor;
import Project.exception.barException;
import Project.beerPong;
/**
 *
 * @author isen
 */
public class Client {
    
    //variable d'instance
    public String sexe; // permet aux enfants de la classe mère d'utiliser ces variables d'instance 
    public int age;
    public int state;
    public int beauty;
    public int budget;
    
    Scanner sc=new Scanner(System.in);
    
    
    
    //constructeur
public Client(){
    sexe="inconnu";
    age=0;
    budget= 0;
    beauty=0;
    state= 0;   
    }


    // Accesseurs
public String getSexe(){
        return sexe;
}
    
public int getAge(){
        return age;
}

public int getEtat(){
        return state;
}

public int getBeauté(){
        return beauty;
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
        this.state= this.state + newEtat;
    }
    
    public void setBeaute(int bBeaute){
        beauty= bBeaute;
    }
    
    public void setBudget(int bBudget){
        this.budget=this.budget + bBudget;
    }
    
    
Bouncer bouncer1= new Bouncer();
BarmaidCool newBarmaid=new BarmaidCool();
beerPong newPlayer= new beerPong();
    //Les méthodes
    
public void getInTheClub(){
        
        
}
     
public void chat(){
    
     
   
}
    public void offerDrink(BarmaidCool newBarmaid) throws barException{
        
        if (this.budget< 5) {
        throw new barException("\nVous n'avez plus d'argent!!");
        }
    
    else {
        //this.yourBudget();
        System.out.println("votre budget actuel est de :"+ budget);
        
        System.out.println("Quelle boisson voulez-vous offrir ?\n 1) champagne: 15euros \n 2) jagger :5euros \n 3)finalement je n'ai pas envie de dépenser d'argent ");
        int choice;
        choice=sc.nextInt();
    
    switch (choice){
        case 1:
            
        if (budget>15)
        System.out.println("Laisser moi vous offrir une coupe de champagne");   
        newBarmaid.setFun(4);
        this.setBudget(-15);
        case 2:
        System.out.println("Laisser moi vous offrir une coupe de champagne");
        newBarmaid.setFun(2);
        this.setBudget(5);   
        case 3:
        move();
        default: 
            System.out.println("vous n'avez pas fait le bon numéro");
            offerDrink(newBarmaid);
        
    }
        }
        getBudget();
        System.out.println("votre budget actuel est de "+budget);
        
        offerDrink(newBarmaid);  
    }
    
    
    public void draguerBarmaid(){
    if (newBarmaid.getFun() > 3)
            System.out.println("La serveuse a l'air de vous apprécier !");
    
}
 
public int inFrontOfTheClub(){
    System.out.println("Vous êtes actuellement devant une boite de nuit, que voulez vous faire ? \n 1- Entrer dans la boite de nuit \n 2- Rester devant la boite \n 3- Quitter le simulateur");
    String choice;
    int answer = 0;
    choice= sc.nextLine();
       
        switch(choice){
               
            case "1":  
            answer = 1;
            break;
                
            case "2": 
            answer =2;
            break;
                
            case "3":
            answer = 3;
            break;
                   
            default: 
            System.out.println("vous n'avez pas fait le bon numéro");
            this.inFrontOfTheClub();
           }
            
return answer; 
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
  
    
    
public void yourState(){
       
System.out.println("Vous êtes dans la boite de nuit! Choisissez vore profil : \n");
String state1;

System.out.println("Votre etat: \n 1- Sobre \n 2- Joyeux/Joyeuse \n 3- Bourré(e)");
state1 = sc.nextLine();
     
    switch (state1){
        
        case "1": 
        this.state= 0;
        break;
            
        case "2":
        this.state=3;
        break;
            
        case "3":
        this.state=5;
        break;
            
        default: System.out.println("erreur de saisie, merci de rentrer 1,2 ou 3");
        this.yourState();
    }
     
System.out.println(this.state);
this.yourBudget();  
} 
    

public void yourBudget(){
       
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
        this.yourBudget();
    }  
System.out.println(this.budget);  
this.yourBeauty();  
} 
    
public void yourBeauty(){

String beauté1;      
System.out.println("Votre beauté: \n 1- beau/belle \n 2- moche \n 3- ni l'un, ni l'autre");
beauté1= sc.nextLine();
     
    switch (beauté1 ){
     
        case"1":
        this.beauty= 3;
        break;
            
        case"2":
        this.beauty=1;
        break;
            
        case"3":
        this.beauty=2;
        break;
             
        default: System.out.println("Erreur de saisie, veuillez entrer 1,2 ou 3");
        this.yourBeauty();
    }  
System.out.println(this.beauty);
this.move();  
}
    
    
    
 public void move(){
     
 
System.out.println("Vous êtes dans la boite de nuit! Que voulez vous faire: \n 1- aller au bar \n 2- draguer \n 3- Jouer \n 4- Sortir de la boite");     
String choix = sc.nextLine();
     
    switch(choix){
         
        case "1": 
        this.goToTheBar();
        break;
            
        case "2":
        chat();
        break;
            
        case "3":
       
       newPlayer.play();
       
        break;
            
        case "4": System.out.println("Merci d'être venu(e)");
        this.inFrontOfTheClub();
        break;
            
        default: System.out.println("erreur de saisie, veuillez reformuler votre choix");
        this.move();          
       
     }
   
   
  
     // aller au bar : commander budget, danser sur le bar: enerver le videur, voler un verre enerver le videur , jeu de la carte: budget
     
     // aller danser: danser comme un beau goss, danser comme un looser, draguer, renverser son verre 
     
     // 
 }

 
public void goToTheBar() {
      
    try{
         
        System.out.println("Vous êtes au bar !!! Que voulez-vous faire: \n 1- Prendre un verre \n 2- Jouer au jeu de la carte (mise de 25euros)  \n 3- Danser sur le bar \n 4- Quitter le bar");   
         
        String choiceBar = sc.nextLine();
         
        switch(choiceBar){
             
            case "1":  
            this.drink();
            break;
                 
            case "2": 
                 this.creditCardGame();
                 break;
                 
            case"3":
                this.danseOnTheBar(bouncer1);
                break;
                 
            case"4":
                this.move();
                break;
                 
            
                
            default: System.out.println("erreur de saisie, merci de reformuler votre choix par 1,2,3 ,4 ou 5");
            this.goToTheBar();
        }
    }
     
    catch
        (barException e) {
            System.out.println(e.getMessage());
            this.move();
  }
}    
 
 
 public void drink() throws barException {
     
    if (this.budget< 5) {
        throw new barException("\nVous n'avez plus d'argent!!");
        }
    
    else {
     
        System.out.println("\n Que voulez-vous commander? \n 1- une bière: 5euros \n 2-un cocktail: 10euros\n 3- un soft: 5euros\n 4- Je n'ai plus soif ");  
        String boisson= sc.nextLine();

     
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
            else 
                {System.out.println("Vous n'avez pas assez d'argent pour un cocktail");
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
 /**
 
 fonction creditcardgame permet de blabla

 */       
public void creditCardGame()throws barException{
          
System.out.println("La carte bleu qui sera tiré au sort devra payer à boire à toute la table !!! ");  
          
    if (this.budget< 25) 
        throw new barException("\nVous n'avez pas assez d'argent, vous devez disposer de 25 euros!!");
          
    else{
                    
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
}
      
    
public void danseOnTheBar(Bouncer bouncer1){
  
    if (this.beauty > 1 || this.state < 5 || bouncer1.humor <4 )
    { 
         
        System.out.println("\n Vous mettez l'ambiance comme jamais !!!" + "\n Attention de ne pas trop énerver le videur ..."); 
        bouncer1.setHumor(1);
        System.out.println(bouncer1.getHumor());
        this.goToTheBar();
     } 
          
    else{
         
        System.out.println("Le videur n'apprécie pas votre danse ! \n Au revoir ! ");
        this.inFrontOfTheClub();
    }
         
}
  


      
      
}
 

 
 
 


    

