/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.util.Scanner;

/**
 *
 * @author isen
 */

public class Women extends Client {

    public Women() {
        super();
        setSexe ("féminin");
        
    }
    Scanner sc = new Scanner(System.in);
    
    
    
@Override    
public void presentYourself(){
        
        
        
        
    }
    
    
    
    
    
    
    @Override
    public void getInTheClub(Dansefloor myDansefloor) {
        System.out.println("Que voulez-vous dire au vigil? \n 1:Bonjour \n 2:Salut max, comment tu vas ? ! \n 3:Je crois que je vais vomir \n");
        String presentationChoice;
        presentationChoice = sc.nextLine();

        switch (presentationChoice) {
            case "1":
                System.out.println("Bonjour mademoiselle, allez y ");

                this.yourState(myDansefloor);

                break;
            case "2":
                System.out.println("Salut blabla");
                this.yourState(myDansefloor);

                break;
            case "3":
                System.out.println("t'as pas ta place ici , dégage!");
                this.inFrontOfTheClub(myDansefloor);

                break;

            default:
                System.out.println("erreur de saisie");
                this.getInTheClub(myDansefloor);

        }
    }
     public void draguerBarman(Dansefloor myDansefloor) {
 
        

    }

}
