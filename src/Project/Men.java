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
public class Men extends Client  {

    public Men(String nom) {

        super(); //cela permet de récupérer le constructeur de la classe mère
        setSexe("masculin");
        setNom(nom);

    }

    Scanner sc = new Scanner(System.in);

    @Override
    public void getInTheClub(Barman newBarman, Dancefloor myDansefloor) {

        System.out.println("Que voulez-vous dire au vigil? \n 1:Bonjour \n 2:Yo, mon pote ! \n 3:Je crois que je vais vomir \n");
        String presentationChoice;
        presentationChoice = sc.nextLine();

        switch (presentationChoice) {
            case "1": {
                String phrase[] = {"désolé, le videur est de mauvaise humeur,réessayer plus tard!", "Vous avez fait bonne impression, vous pouvez entrer in da club"};
                int idx = new Random().nextInt(phrase.length);
                String random = (phrase[idx]);
                System.out.println(random);

                switch (random) {

                    case "désolé, le videur est de mauvaise humeur,réessayer plus tard!":

                        this.inFrontOfTheClub(myDansefloor); // ajouter le cas ou le type peut entrer, sedeplacer
                        break;

                    case "Vous avez fait bonne impression, vous pouvez entrer in da club":
                        this.yourState(newBarman, myDansefloor);

                        break;

                    default:
                        System.out.println("erreur");

                }

            }
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

        try {

            System.out.println("Que voulez-vous faire :\n 1) Offrir un verre \n 2) draguer la serveuse \n 3) J'ai changé d'avis");
            String choice;
            choice = sc.nextLine();

            switch (choice) {
                case "1":

                    this.offerDrink(newBarman, myDansefloor);
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

        } catch (barException e) {
            System.out.println(e.getMessage());
            this.move(newBarman, myDansefloor);
        }

    }

    @Override
    public void draguerBarman(Barman newBarman, Dancefloor myDansefloor) {
        String choice;

        if (newBarman.getFun() > 0) {

            System.out.println("La serveuse a l'air de vous apprécier !");

            System.out.println("Que voulez-vous faire ? \n 1) la draguer  \n 2) vous présenter \n 3)En fait, elle ne m'interresse pas ");
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
                    System.out.println("Dommage, t'as loupé le coche, elle te kiffait !");
                    this.move(newBarman, myDansefloor);

                    break;

                default:
                    System.out.println("erreur de saisie");
                    draguerBarman(newBarman, myDansefloor);

            }

        } else {
            System.out.println("Désolé, la serveuse est déjà en train de discuter avec quelqun d'autre");
            chat(newBarman, myDansefloor);

        }

    }
/**
 
 * @param newBarman
 * @param myDansefloor
 * @throws barException 
 * 
 Vérifie que le budget de l’utilisateur est bien supérieur à 5 euros, si ce n’est pas le cas, message d’erreur grâce à l’exception :
 « Vous n'avez plus d'argent!! », sinon cela nous donne notre budget actuel, et demande au client quelle boisson il veut  offrir entre le champagne, le jagger ou bien finalement de se rétracter.
 
1er choix: (champagne): On vérifie que le budget est bien supérieur à 15, Exception à mettre si c’est le cas le client offre donc une coupe de champagne
à la serveuse, action qui a pour conséquence d’augmenter le niveau d’amusement de la serveuse à 4 (sur une échelle de 0 à 5)
on met également à jour le budget. Si le budget est inférieure à 15, on affiche un message « vous n’avez pas assez d’argent »

2ième choix : Le client choisi d’offrir un jagger à la serveuse, on vérifie que le budget est bien surpérieur à 5, Exception à mettre , si c’est le cas le client offre un jagger à la serveuse, mais cette fois son état d’amusement va seulement passer à 2. On met également le budget à jour.
3ième choix : SI le Client a finalement décidé de ne pas offrir de verre à la serveuse, on appelle la fonction move qui va lui proposer plusieurs activités (aller danser, aller draguer, aller au bar etc..)
Dans le cas où l’utilisateur n’a pas saisi correctement les chiffres, on met un message d’erreur et on rappelle la fonction pour qu’il puisse rééssayer et on rappelle le montant de notre budget.

 * 
 */
 

    
    public void offerDrink(Barman newBarman, Dancefloor myDansefloor) throws barException {

        if (getBudget() < 5) {
            throw new barException("\nVous n'avez plus d'argent!!");

        } else {
            //this.yourBudget();
            System.out.println("votre budget actuel est de :" + getBudget());

            System.out.println("Quelle boisson voulez-vous offrir ?\n 1) champagne: 15euros \n 2) jagger :5euros \n 3)finalement je n'ai pas envie de dépenser d'argent ");
            String choice;
            choice = sc.nextLine();

            switch (choice) {
                case "1":

                    if (getBudget() > 15) {
                        System.out.println("Laisser moi vous offrir une coupe de champagne");

                        newBarman.setFun(4);
                        this.setBudget(-15);
                        System.out.println(newBarman.getFun());
                    } else {
                        System.out.println("Vous n'avez pas assez d'argent pour offrir une coupe de champagne ");
                        move(newBarman, myDansefloor);
                    }
                    break;
                case "2":
                    System.out.println("Laisser moi vous offrir un jagger");
                    newBarman.setFun(2);
                    this.setBudget(-5);
                    System.out.println(newBarman.getFun());
                    break;
                case "3":
                    move(newBarman, myDansefloor);
                    break;

                default:
                    System.out.println("vous n'avez pas fait le bon numéro");
                    offerDrink(newBarman, myDansefloor);

            }
        }
        getBudget();
        System.out.println("votre budget actuel est de " + getBudget());

        move(newBarman, myDansefloor);
    }

    @Override
    public void presentYourself(Barman newBarman) {

        System.out.println(" Salut, je m'appelle  " + getNom());
        System.out.println("Cela n'interresse pas vraiment la serveuse");
        newBarman.setFun(-1);

    }

    @Override
    public void drague(Barman newBarman, Dancefloor myDansefloor) {

        {
            String phrase[] = {"Tu as un sourire qui remplace le soleil quand il pleut ", "Ton père est pas voleur par hasard ? Parce qu'il a volé toutes les étoiles pour les mettre dans tes yeux", "Si t'étais un sandwich au MacDo tu serai le Mac-nifique", " Si une goutte d'au voulait dire je t'aime, je t'offrirais l'océan"};
            int idx = new Random().nextInt(phrase.length);
            String random = (phrase[idx]);
            System.out.println(random);

            switch (random) {

                case "Tu as un sourire qui remplace le soleil quand il pleut ":
                    System.out.println("La serveuse aime votre éloquence");
                    newBarman.setFun(1);
                    if (newBarman.getFun() >= 10 && getBeauty() > 1) {
                        ((BarmaidCool) newBarman).embrasser();
                    }
                    chat(newBarman, myDansefloor);

                    break;

                case "Ton père est pas voleur par hasard ? Parce qu'il a volé toutes les étoiles pour les mettre dans tes yeux":
                    System.out.println("Vous avez trop parlé ! , la serveuse est blasée");
                    newBarman.setFun(-2);
                    if (newBarman.getFun() > 10 && getBeauty() > 1) {
                        ((BarmaidCool) newBarman).embrasser();
                    }
                    chat(newBarman, myDansefloor);

                    break;

                case "Si t'étais un sandwich au MacDo tu serai le Mac-nifique":
                    System.out.println("Vous avez trop parlé ! , la serveuse est blasée");
                    newBarman.setFun(-2);

                    chat(newBarman, myDansefloor);

                    break;

                case " Si une goutte d'au voulait dire je t'aime, je t'offrirais l'océan":
                    System.out.println("La serveuse aime votre éloquence");
                    newBarman.setFun(1);
                    if (newBarman.getFun() > 10) {
                        ((BarmaidCool) newBarman).embrasser();
                    }
                    chat(newBarman, myDansefloor);

                default:
                    System.out.println("erreur");
                    chat(newBarman, myDansefloor);

            }

        }
    }
}
