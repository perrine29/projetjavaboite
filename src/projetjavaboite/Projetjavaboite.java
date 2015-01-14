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
public class Projetjavaboite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    
             /*String phrase=new String();
         //Scanner sc=new Scanner(System.in);
        // System.out.println("Saissisez une phrase");
        //phrase=sc.nextLine();
         phrase="virer pris";
         String[] mots = Pattern.compile("\\W+" ).split(phrase); //<<<<<<<<<<<<<<<<<

         Random r = new Random();
         String motAleatoire = mots[r.nextInt(mots.length)];
         System.out.println("Pas de chance, le videur est de mauvaise humeur ! " + motAleatoire);
       */
        
        
       Scanner sc = new Scanner(System.in);
       Client newclient = new Client();
        
        newclient.clientCaract();
        
        Bouncer momo=new Bouncer();
        System.out.println("yoo");
        Homme homme=new Homme();
        homme.getInTheClub();
        System.out.println("bibi");
    }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
}
