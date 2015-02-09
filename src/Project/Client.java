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
public class Client {

    //variable d'instance
    private String sexe; // permet aux enfants de la classe mère d'utiliser ces variables d'instance 

    private int state;
    private int beauty;
    private int budget;
    private String nom;

    Scanner sc = new Scanner(System.in);

    //constructeur
    public Client() {
        sexe = "inconnu";
        budget = 0;
        beauty = 0;
        state = 0;
    }

    // Accesseurs
    public String getSexe() {
        return sexe;
    }

    public int getEtat() {
        return state;
    }

    public int getBeauty() {
        return beauty;
    }

    public int getBudget() {
        return budget;
    }

    public String getNom() {

        return nom;
    }

    //Mutateurs
    public void setNom(String newNom) {
        nom = newNom;
    }

    public void setSexe(String newSexe) {
        sexe = newSexe;
    }

    public void setEtat(int newEtat) {
        this.state = this.state + newEtat;
    }

    public void setBeauty(int bBeauty) {
        beauty = bBeauty;
    }

    public void setBudget(int bBudget) {
        this.budget = this.budget + bBudget;
    }

    //Les méthodes
    public void getInTheClub(Barman newBarman, Dancefloor myDansefloor) {

    }

    public void chat(Barman newBarman, Dancefloor myDansefloor) {

    }

    public void draguerBarman(Barman newBarman, Dancefloor myDansefloor) {

    }

    public void drague(Barman newBarman, Dancefloor myDansefloor) {

    }

    public void presentYourself(Barman newBarman) {

    }
    public void offerDrink(Barman newBarman, Dancefloor myDansefloor) throws barException{
        
        
    }
    
    public final void inFrontOfTheClub(Dancefloor myDansefloor) {

        System.out.println("Vous êtes actuellement devant une boite de nuit, que voulez vous faire ? \n 1- Entrer dans la boite de nuit \n 2- Rester devant la boite \n 3- Quitter le simulateur");
        String choice;
        int answer = 0;
        choice = sc.nextLine();

        switch (choice) {

            case "1":
                //answer = 1;
                clientCaract(myDansefloor);
                break;

            case "2":
                //answer =2;
                inFrontOfTheClub(myDansefloor);
                break;

            case "3":
                //answer = 3;
                System.out.println("merci! bye");
                System.exit(0);

                break;

            default:
                System.out.println("vous n'avez pas fait le bon numéro");
                this.inFrontOfTheClub(myDansefloor);
        }


    }

   
    public final Client clientCaract(Dancefloor myDansefloor) {

        Client newClient = null;

        Barman newBarman = null;

        /*if (this.age >= 50 || this.age < 18){
         System.out.println("Désolé, vous n'avaez pas l'age d'aller en boite !");
         ArriverDevantLaBoite();
         }*/
        System.out.println("êtes vous:\n 1)un homme \n 2)une femme ?");
        String sexe = sc.nextLine();

        System.out.println("\n Quel est votre nom ?");
        String nom = sc.nextLine();

        switch (sexe) {

            case "1":
                newClient = new Men(nom); // Men.getInTheClub();

                //myDansefloor.setBarman("1");
                newBarman = new BarmaidCool();

                System.out.println(newClient.sexe);

                break;

            case "2":
                newClient = new Women(nom);//  Women.getInTheClub();

                newBarman = new BarmanCool();

                // myDansefloor.setBarman("2");
                System.out.println(newClient.sexe);
                // System.out.println(newBarman.getSexe());
                break;

            default:
                System.out.println("erreur dans la saisie de la réponse");
                this.clientCaract(myDansefloor);

        }

        getInTheClub(newBarman, myDansefloor);
        newClient.getInTheClub(newBarman, myDansefloor);
        return newClient;

    }

    public final void yourState(Barman newBarman, Dancefloor myDansefloor) {

        System.out.println("Vous êtes dans la boite de nuit! Choisissez vore profil : \n");
        String state1;

        System.out.println("Votre etat: \n 1- Sobre \n 2- Joyeux/Joyeuse \n 3- Bourré(e)");
        state1 = sc.nextLine();

        switch (state1) {

            case "1":
                this.state = 0;
                break;

            case "2":
                this.state = 5;
                break;

            case "3":
                this.state = 8;
                break;

            default:
                System.out.println("erreur de saisie, merci de rentrer 1,2 ou 3");
                this.yourState(newBarman, myDansefloor);
        }

        System.out.println(this.state);
        this.yourBudget(newBarman, myDansefloor);
    }

    public final void yourBudget(Barman newBarman, Dancefloor myDansefloor) {

        String budget1;

        System.out.println("Votre budget: \n 1- 20 euros \n 2- 40euros \n 3-100euros");
        budget1 = sc.nextLine();

        switch (budget1) {

            case "1":
                this.budget = 20;
                break;

            case "2":
                this.budget = 40;
                break;

            case "3":
                this.budget = 100;
                break;

            default:
                System.out.println("Erreur de saisie, veuillez entrer 1,2 ou 3");
                this.yourBudget(newBarman, myDansefloor);
        }
        System.out.println(this.budget);
        this.yourBeauty(newBarman, myDansefloor);
    }

    public final void yourBeauty(Barman newBarman, Dancefloor myDansefloor) {

        String beauté1;
        System.out.println("Votre beauté: \n 1- beau/belle \n 2- moche \n 3- ni l'un, ni l'autre");
        beauté1 = sc.nextLine();

        switch (beauté1) {

            case "1":
                this.beauty = 3;
                break;

            case "2":
                this.beauty = 1;
                break;

            case "3":
                this.beauty = 2;
                break;

            default:
                System.out.println("Erreur de saisie, veuillez entrer 1,2 ou 3");
                this.yourBeauty(newBarman, myDansefloor);
        }
        System.out.println(this.beauty);
        this.move(newBarman, myDansefloor);
    }

    public final void move(Barman newBarman, Dancefloor myDansefloor) {

        System.out.println("Vous êtes dans la boite de nuit! Que voulez vous faire: \n 1- aller au bar \n 2- draguer \n 3- Jouer \n 4- Sortir de la boite");
        String choix = sc.nextLine();

        switch (choix) {

            case "1":
                this.goToTheBar(newBarman, myDansefloor);
                break;

            case "2":
                chat(newBarman, myDansefloor);
                break;

            case "3":
                myDansefloor.newPlayer.play(myDansefloor);
                move(newBarman, myDansefloor);
                //Dansefloor.newPlayer.play();

                break;

            case "4":
                System.out.println("Merci d'être venu(e)");
                this.inFrontOfTheClub(myDansefloor);
                break;

            default:
                System.out.println("erreur de saisie, veuillez reformuler votre choix");
                this.move(newBarman, myDansefloor);

        }

       
    }

    public final void goToTheBar(Barman newBarman, Dancefloor myDansefloor) {

        try {

            System.out.println("Vous êtes au bar !!! Que voulez-vous faire: \n 1- Prendre un verre \n 2- Jouer au jeu de la carte (mise de 25euros)  \n 3- Danser sur le bar \n 4- Quitter le bar");

            String choiceBar = sc.nextLine();

            switch (choiceBar) {

                case "1":
                    this.drink(newBarman, myDansefloor);
                    break;

                case "2":
                    this.creditCardGame(newBarman, myDansefloor);
                    break;

                case "3":
                    danseOnTheBar(newBarman, myDansefloor);
                    break;

                case "4":
                    this.move(newBarman, myDansefloor);
                    break;

                default:
                    System.out.println("erreur de saisie, merci de reformuler votre choix par 1,2,3 ,4 ou 5");
                    this.goToTheBar(newBarman, myDansefloor);
            }
        } catch (barException e) {
            System.out.println(e.getMessage());
            this.move(newBarman, myDansefloor);
        }
    }

    public final void drink(Barman newBarman, Dancefloor myDansefloor) throws barException {

        if (state > 9) {
            newBarman.refuserDeServir();
            goToTheBar(newBarman, myDansefloor);
        }

        if (budget < 5) {
            throw new barException("\n Désolé  " + getNom() + " Vous n'avez plus d'argent!!");

        } else {

            System.out.println("\n Que voulez-vous commander? \n 1- une bière: 5euros \n 2-un cocktail: 10euros\n 3- un soft: 5euros\n 4- Je n'ai plus soif ");
            String boisson = sc.nextLine();

            switch (boisson) {

                case "1":
                    this.setBudget(-5);
                    this.setEtat(1);
                    break;

                case "2":

                    if (this.budget >= 10) {
                        this.setBudget(-10);
                        this.setEtat(1);
                    } else {
                        System.out.println("Vous n'avez pas assez d'argent pour un cocktail");
                        this.goToTheBar(newBarman, myDansefloor);
                    }
                    break;

                case "3":
                    this.setBudget(-5);
                    this.setEtat(0);
                    break;

                case "4":
                    this.goToTheBar(newBarman, myDansefloor);
                    break;

                default:
                    System.out.println("erreur de saisie, veuillez entrer 1,2,3 ou 4");
                    this.drink(newBarman, myDansefloor);
            }

            System.out.println(" Votre budget est maintenant de :" + this.budget);
            this.drink(newBarman, myDansefloor);
        }
    }

    /**
     *
     * fonction creditcardgame permet de blabla
     *
     */
    public final void creditCardGame(Barman newBarman, Dancefloor myDansefloor) throws barException {

        System.out.println("La carte bleu qui sera tiré au sort devra payer à boire à toute la table !!! ");

        if (this.budget < 25) {
            throw new barException("\n Désolé  " + getNom() + "   Vous n'avez pas assez d'argent, vous devez disposer de 25 euros!!");
        } else {

            String test[] = {"Vous avez perdu", "Vous avez gagné"};
            int idx = new Random().nextInt(test.length);
            String random = (test[idx]);
            System.out.println(random);

            switch (random) {

                case "Vous avez perdu":

                    this.setBudget(-25);
                    this.setEtat(1);
                    break;

                case "Vous avez gagné":
                    this.setEtat(1);
                    break;

                default:
                    System.out.println("erreur");
            }

            System.out.println("Votre budget est de:" + this.budget);
            this.goToTheBar(newBarman, myDansefloor);
        }
    }

    public final void danseOnTheBar(Barman newBarman, Dancefloor myDansefloor) {

        if (this.beauty > 2 || this.state < 6 || myDansefloor.bouncer1.humor <= 4) {

            System.out.println("\n Vous mettez l'ambiance comme jamais !!!" + "\n Attention de ne pas trop énerver le videur ...");
            myDansefloor.bouncer1.setHumor(2);
            System.out.println(myDansefloor.bouncer1.getHumor());
            this.goToTheBar(newBarman, myDansefloor);
        } else {

            System.out.println("Le videur n'apprécie pas votre danse ! \n Au revoir ! ");
            this.inFrontOfTheClub(myDansefloor);
        }

    }

}
