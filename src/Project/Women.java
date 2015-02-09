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

    public Women(String nom) {
        super();
        setSexe("féminin");
        setNom(nom);

    }

    Scanner sc = new Scanner(System.in);

  

    @Override
    public void getInTheClub(Barman newBarman, Dancefloor myDansefloor) {

        System.out.println("Que voulez-vous dire au vigil? \n 1:Bonjour \n 2:Salut Max, comment tu vas ?! \n 3: Heeeey Maxxou je suis bourréeee! \n");
        String presentationChoice;
        presentationChoice = sc.nextLine();

        switch (presentationChoice) {
            case "1":
                System.out.println("Vous avez fait bonne impression, vous pouvez entrer in da club");
                this.yourState(newBarman, myDansefloor);

                break;
            case "2":
                System.out.println("Salut  " + getNom() + ", vas-y entre");
                this.yourState(newBarman, myDansefloor);

                break;
            case "3":
                System.out.println("t'as pas ta place ici , dégage!");
                this.inFrontOfTheClub(myDansefloor);

                break;

            default:
                System.out.println("erreur de saisie");
                this.getInTheClub(newBarman, myDansefloor);

        }
    }

    @Override
    public void chat(Barman newBarman, Dancefloor myDansefloor) {

        System.out.println("Que voulez-vous faire :\n 1) Danser sur le bar \n 2) draguer le serveur \n 3) J'ai changé d'avis");
        String choice;
        choice = sc.nextLine();

        switch (choice) {
            case "1":

                super.danseOnTheBar(newBarman, myDansefloor);

                break;

            case "2":

                draguerBarman(newBarman, myDansefloor);

                break;

            case "3":
                this.move(newBarman, myDansefloor);
                break;

            default:
                System.out.println(" erreur de saisie");
                chat(newBarman, myDansefloor);
        }

    }

    @Override
    public void draguerBarman(Barman newBarman, Dancefloor myDansefloor) {
        String choice;

        if (newBarman.getFun() > 0) {

            System.out.println("Le serveur a l'air de vous apprécier !");

            System.out.println("Que voulez-vous faire ? \n 1) le draguer  \n 2) vous présenter \n 3)En fait, elle ne m'interresse pas ");
            choice = sc.nextLine();

            switch (choice) {

                case "1":

                    drague(newBarman, myDansefloor);

                    break;

                case "2":
                    presentYourself(newBarman);
                    chat(newBarman, myDansefloor);
                    break;

                case "3":
                    System.out.println("Dommage, t'as loupé le coche, il te kiffait !");
                    this.move(newBarman, myDansefloor);

                    break;

                default:
                    System.out.println("erreur de saisie");
                    draguerBarman(newBarman, myDansefloor);

            }

        } else {
            System.out.println("Désolé, le serveur est déjà en train de discuter avec quelqun d'autre et vous n'avez pas l'air de l'interesser");
            chat(newBarman, myDansefloor);

        }

    }

      @Override
    public void presentYourself(Barman newBarman) {

        System.out.println(" Salut, je m'appelle  " + getNom() + ", dit-elle avec des yeux de biches et un sourire ravageur.... ");
        System.out.println("Le serveur a l'air d'être interressé");
        newBarman.setFun(1);

    }

    @Override
    public void drague(Barman newBarman, Dancefloor myDansefloor) {

        System.out.println("Pourboire et danse sexy pour le barman....");
        newBarman.setFun(1);

    }
}
