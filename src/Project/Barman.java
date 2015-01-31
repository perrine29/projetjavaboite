/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

/**
 *
 * @author isen
 */
public class Barman {
      //variable d'instance
    public String sexe; // permet aux enfants de la classe mère d'utiliser ces variables d'instance 
    public int age;
    public int humor;
    public int beauty;
    public int fun;
  
    //constructeur
public Barman(){
    sexe="inconnu";
    age=0;
    beauty=0;
    fun=0;   
    }


    // Accesseurs
public String getSexe(){
        return sexe;
}
    
public int getAge(){
        return age;
}

public int getBeauté(){
        return beauty;
}
  
public int getFun(){
        return fun;
}


    //Mutateurs
public void setAge(int newAge){
age=newAge;
}
    
public void setSexe(String newSexe){
sexe=newSexe;
}
   
    
public void setBeaute(int bBeaute){
beauty= bBeaute;
}

public void setFun(int newFun){
this.fun= this.fun + newFun ;   
    
}

 public void setHumor(int newHumor){
        humor=newHumor+ humor ;
 }
}

// si le client est trop saoul, le barman ne sert plus d'alcool