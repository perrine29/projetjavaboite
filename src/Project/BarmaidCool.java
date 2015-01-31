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
public class BarmaidCool extends Barman{
    
    public BarmaidCool(){
        super(); //cela permet de récupérer le constructeur de la classe mère
        this.sexe="feminin";    
        this.age=25;
        this.humor=0;
        this.beauty=3;
         
    }
    /*
   // Accesseurs
    public String getSexe(){
        return sexe;
    }
    public int getAge(){
        return age;
    }
    public int getHumor(){
        return humor;
    }
    public int getBeauty(){
        return beauty;
    }
    
    // Mutateurs
    public void setSexe(String newSexe){
        sexe=newSexe;
    }
    public void setAge(int newAge){
        age=newAge;
    }
    public void setHumor(int newHumor){
        humor=newHumor+ humor ;
    }
    public void setBeauty(int newBeauty){
        beauty=newBeauty; */
    }

