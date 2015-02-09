/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import Project.Barman;

/**
 *
 * @author isen
 */
public class BarmanCool extends Barman {
    
      public BarmanCool() {
        super(); //cela permet de récupérer le constructeur de la classe mère
        setSexe("masculin");

        setBeauty(3);

        setFun(4);

    }
    

    @Override
    public void refuserDeServir() {
        System.out.println("Vous êtes trop saoul madame, je vais devoir dire non à ce si beau sourire... ");

    }
}
