/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
import java.util.Random;
import Project.Client;

/**
 *
 * @author isen
 */
public class beerPong {
    
   
    
    int max1=5,max2=11,min1=0,min2=6;
    int nombreAleatoire1,nombreAleatoire2;
    int i,j,k,l,m,n,o,p,a,nombreManche=0;
    
    Random rand = new Random();
    
    String array1[][]= {{" "," ","*"," "," "},{" ","*"," ","*"," "},{"*"," ","*"," ","*"}};
    String array2[][]={{"*"," ","*"," ","*"},{" ","*"," ","*"," "},{" "," ","*"," "," "}};
    
    boolean array1bis[]= new boolean[12];
   
   
    
    
public void printBeerPong(){
       
    for ( k=0;k<3;k++){
        
        for ( l=0;l<5;l++){
        System.out.print(array2[k][l]);
        }
    System.out.println();
    }
   
System.out.println();
  
    for ( i = 0; i < 3; i++){  
    
        for( j = 0; j < 5; j++){
        System.out.print(array1[i][j]);
        }

    System.out.println();
    }
    
System.out.println();
      
}
      
    
  
   
public void play(){
        
do {
       
    nombreManche= nombreManche + 1;
    
    System.out.println("Numéro de la manche :" +nombreManche);
    System.out.println("joueur 1: a votre tour!" );   
    player1();
    printBeerPong();
  
        if (isArrayEmpty())
        break;
        
    System.out.println("joueur 2: a votre tour!" );
    player2();
    printBeerPong();
    }
while ( isArrayEmpty() == false);
  
this.move();


}


public boolean isArrayEmpty(){
   
 
    if (array1bis[0]==true && array1bis[1]== true&& array1bis[2]== true && array1bis[3]== true && array1bis[4]== true &&array1bis[5]== true){
    System.out.println("le joueur 2 a gagné! ");
    
        if (nombreManche > 5)
        System.out.println("Vous avez gagné avec beaucoup de difficultés");
        return true;
    }
 
    if (array1bis[6]==true && array1bis[7]== true&& array1bis[8]== true && array1bis[9]== true && array1bis[10]== true &&array1bis[11]== true){
    System.out.println("le joueur 1 a gagné! ");
        if (nombreManche > 5)
        System.out.println("avec des difficultés");
        return true ;
    }

return false;
       
}
   
          
public void player1() {  
    
    nombreAleatoire1 = rand.nextInt(max2 - min2 + 1) + min2;
    System.out.println("le premier nombre aléatoire est :" + nombreAleatoire1);
    System.out.println();
      
    array1bis[nombreAleatoire1]=true;
    tableau();
    System.out.println();
        
}
      
public void player2(){
    nombreAleatoire2 = rand.nextInt(max1 - min1 + 1) + min1;
    System.out.println("le deuxieme nombre aléatorie est :"+ nombreAleatoire2);
    System.out.println();
           
    array1bis[nombreAleatoire2]=true;
    tableau();
      
}
      
public void tableau(){
    
    if (array1bis[0]==true)
    {array1[0][2]=" ";}
        
    if (array1bis[1]== true)
    {array1[1][1]=" ";}
        
    if (array1bis[2]== true)
    {array1[1][3]=" "; }
         
    if (array1bis[3]== true)
    {array1[2][0]=" ";}
        
    if (array1bis[4]== true)
    {array1[2][2]=" ";}
        
    if (array1bis[5]== true)
    {array1[2][4]=" ";}
       
    if (array1bis[6]== true)
    {array2[0][0]=" ";}
    
    if (array1bis[7]== true)
    {array2[0][2]=" ";}
         
    if (array1bis[8]== true)
    {array2[0][4]=" ";}
        
    if (array1bis[9]== true)
    {array2[1][1]=" ";}
        
    if (array1bis[10]== true)
    {array2[1][3]=" ";}
         
    if (array1bis[11]== true)
    {array2[2][2]=" ";}
         
        
      }
}
    
    
    
    

