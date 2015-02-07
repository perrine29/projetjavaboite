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
public abstract class Barman {

    //variable d'instance

    private String sexe; // permet aux enfants de la classe mère d'utiliser ces variables d'instance 
    private int age;
   
    private int beauty;
    private int fun;

    //constructeur
    public Barman() {
        sexe = "inconnu";
        age = 25;
       fun=0;
        
    }

    // Accesseurs
    public String getSexe() {
        return sexe;
    }

    public int getAge() {
        return age;
    }

    public int getBeauty() {
        return beauty;
    }

    public int getFun() {
        return fun;
    }

    //Mutateurs
    public void setAge(int newAge) {
        age = newAge;
    }

    public void setSexe(String newSexe) {
        sexe = newSexe;
    }

    public void setBeauty(int bBeaute) {
        beauty = bBeaute;
    }

    public void setFun(int newFun) {
        this.fun = this.fun + newFun;

    }

   
    public abstract void refuserDeServir();
    
    
    
    
  
}


// si le client est trop saoul, le barman ne sert plus d'alcool
