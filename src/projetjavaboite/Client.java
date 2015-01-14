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
        System.out.println("tg");
        
    }
 
    public void ArriverDevantLaBoite(){
    System.out.println("Vous êtes actuellement devant une boite de nuit, que voulez vous faire ? \n 1- Entrer dans la boite de nuit \n 2- Rester devant la boite \n 3- Quitter le simulateur");
       int choix= sc.nextInt();
          
           
           switch(choix){
               
               case 1:  
               clientCaract();
                break;
               case 2: 
               ArriverDevantLaBoite();
               break;
               case 3:
               System.out.println(" Merci d'être venu à bientot");    
               break;
                   
               default: System.out.println("vous n'avez pas fait le bon numéro");
               ArriverDevantLaBoite();
                   
           }
           
         }
           
    public void clientCaract(){
        System.out.println("Bonjour, quel age avez-vous");
        this.age =sc.nextInt();
        if (this.age >= 50)
            System.out.println("Désolé, vous êtes trop vieux pour aller en boîte !");
        
        else if(this.age>=18) {
            System.out.println("êtes vous un homme ou une femme : homme\n 2:femme");
            String sexe=sc.nextLine();
            switch (sexe){
                case "homme" :
                        Homme.getInTheClub();
                    break;
                case "femme": 
                        Femme.getInTheClub();
                    break;
                        }
        
       System.out.println("Vous avez l'âge requis pour entrer en boite");
        }
                    
        else 
            System.out.println("Désolé vous n'avez pas l'âge requis pour entrer en boite, veuillez rentrez chez vous");
          
    }
  
     
  
 public void SeDéplacer(){
     
     System.out.println("Vous êtes dans la boite de nuit! Que voulez vous faire: \n 1- aller au bar \n 2- aller danser \n 3- "); 
     
     // aller au bar : commander budget, danser sur le bar: enerver le videur, voler un verre enerver le videur , jeu de la carte: budget
     
     // aller danser: danser comme un beau goss, danser comme un looser, draguer, renverser son verre 
     
     // 
 }
    
}

    

