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

    public Men() {
        super(); //cela permet de récupérer le constructeur de la classe mère
        setSexe( "masculin");
    }

    Scanner sc = new Scanner(System.in);

        
@Override
public void presentYourself(Barman newBarman){
   
    System.out.println(" Salut, je m'appelle Henri ");
    System.out.println("Cela n'interresse pas vraiment la serveuse");
    newBarman.setFun(-1);
        
       
    }
@Override    
public void drague(Barman newBarman,Dansefloor myDansefloor){
    
    {
                String phrase[] = {"Tu as un sourire qui remplace le soleil quand il pleut ", "Ton père est pas voleur par hasard ? Parce qu'il a volé toutes les étoiles pour les mettre dans tes yeux", "Si t'étais un sandwich au MacDo tu serai le Mac-nifique"," Si une goutte d'au voulait dire je t'aime, je t'offrirais l'océan"};
                int idx = new Random().nextInt(phrase.length);
                String random = (phrase[idx]);
                System.out.println(random);

                switch (random) {

                    case "Tu as un sourire qui remplace le soleil quand il pleut ":
                        System.out.println("La serveuse aime votre éloquence");
                        newBarman.setFun(1);
                         if ( newBarman.getFun()> 10)
                    {
                     ((BarmaidCool)newBarman).embrasser();
                }
                       chat(newBarman, myDansefloor);
                        
                        break;

                    case "Ton père est pas voleur par hasard ? Parce qu'il a volé toutes les étoiles pour les mettre dans tes yeux":
                        System.out.println("Vous avez trop parlé ! , la serveuse est blasée");
                        newBarman.setFun(-2);
                         if ( newBarman.getFun()> 10)
                    {
                     ((BarmaidCool)newBarman).embrasser();
                }
                        chat(newBarman,myDansefloor);
                       

                        break;
                        
                    case "Si t'étais un sandwich au MacDo tu serai le Mac-nifique":
                        System.out.println("Vous avez trop parlé ! , la serveuse est blasée");
                        newBarman.setFun(-2);
                        
                        chat(newBarman,myDansefloor);
                        
                        
                            break;
                                    
                    case " Si une goutte d'au voulait dire je t'aime, je t'offrirais l'océan":
                         System.out.println("La serveuse aime votre éloquence");
                        newBarman.setFun(1);
                         if ( newBarman.getFun()> 10)
                    {
                     ((BarmaidCool)newBarman).embrasser();
                }
                      chat(newBarman,  myDansefloor);
                    
                    default:
                        System.out.println("erreur");
                        chat(newBarman,myDansefloor);

                }
                
   
}
}
    
 @Override
    public void getInTheClub(Barman newBarman,Dansefloor myDansefloor) {

        System.out.println("Que voulez-vous dire au vigil? \n 1:Bonjour \n 2:Yo, mon pote ! \n 3:Je crois que je vais vomir \n");
        int presentationChoice;
        presentationChoice = sc.nextInt();

        switch (presentationChoice) {
            case 1: {
                String phrase[] = {"désolé, le videur est de mauvaise humeur,réessayer plus tard!", "Vous avez fait bonne impression, vous pouvez entrer in da club"};
                int idx = new Random().nextInt(phrase.length);
                String random = (phrase[idx]);
                System.out.println(random);

                switch (random) {

                    case "désolé, le videur est de mauvaise humeur,réessayer plus tard!":

                        this.inFrontOfTheClub(myDansefloor); // ajouter le cas ou le type peut entrer, sedeplacer
                        break;

                    case "Vous avez fait bonne impression, vous pouvez entrer in da club":
                        this.yourState(newBarman,myDansefloor);

                        break;

                    default:
                        System.out.println("erreur");

                }

            }
            break;
            case 2:
                System.out.println("Salut mon pote, vas-y entre");
                this.yourState(newBarman,myDansefloor);

                break;
            case 3:
                System.out.println("t'as pas ta place ici , dégage!");
                this.inFrontOfTheClub(myDansefloor);

                break;

            default:
                System.out.println("erreur de saisie");
                this.getInTheClub(newBarman,myDansefloor);

        }
    }
@Override
    public void chat(Barman newBarman, Dansefloor myDansefloor) {

        try {

            System.out.println("Que voulez-vous faire :\n 1) Offrir un verre \n 2) draguer la serveuse \n 3) J'ai changé d'avis");
            String choice;
            choice = sc.nextLine();

            switch (choice) {
                case "1":

                    this.offerDrink(newBarman, myDansefloor);
                    break;

                case "2":
                    
                        
                    draguerBarman(newBarman,myDansefloor);
                    
                    
                 
                    
                    break;

                case "3":
                    this.move(newBarman,myDansefloor);
                    break;

                default:
                    System.out.println(" erreur de saisie");
                  chat(newBarman,myDansefloor);
            }

        } catch (barException e) {
            System.out.println(e.getMessage());
            this.move(newBarman,myDansefloor);
        }

    }
    
    @Override
    public void draguerBarman( Barman newBarman, Dansefloor myDansefloor) {
         String choice; 
         
       
         
        if (newBarman.getFun() > 0) {
            
          System.out.println("La serveuse a l'air de vous apprécier !");
          
                
                System.out.println("Que voulez-vous faire ? \n 1) la draguer  \n 2) vous présenter \n 3)En fait, elle ne m'interresse pas ");
            choice= sc.nextLine();
                  
            switch (choice) {
                
            
            case "1": 
            
            drague(newBarman,myDansefloor); 
            
                
            break;
                
                
            case "2":
             presentYourself(newBarman);   
             chat( newBarman, myDansefloor);
             break;   
                
            case "3":
                System.out.println("Dommage, t'as loupé le coche, elle te kiffait !");
                this.move(newBarman,myDansefloor);

         

                break;

            default:
                System.out.println("erreur de saisie");
                draguerBarman(newBarman,myDansefloor);

        }
            
            }
            
        else{
            System.out.println("Désolé, la serveuse est déjà en train de discuter avec quelqun d'autre");
             chat(newBarman,myDansefloor);
            
        }
       
    
     }
    
        

}

