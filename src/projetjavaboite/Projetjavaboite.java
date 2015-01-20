/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjavaboite;
import java.util.Random;
import java.util.Scanner;
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
       Client myClient = new Client();
       
        int c= myClient.ArriverDevantLaBoite();
        
        while( c != 4){
           
            switch(c){
                case 1:
                   myClient.clientCaract();
                    break;
                case 2:     
                myClient.ArriverDevantLaBoite(); // atention boucle ne se fini jamais, fonction à modifier
                  break;  
                case 3:
                  System.out.println(" Merci d'être venu à bientot");
                  
                  break;  
                case 4:
                  break;  
                    
                default:
                   System.out.println("Vous n'avez pas fait le bon numéro!");
               c = myClient.ArriverDevantLaBoite();
            }
            
            
        }
        
        
                
        
    }
}

    
    
    
    
    
    
    
    
    
    
    
    
    

