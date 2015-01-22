/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjavaboite.exception;

/**
 *
 * @author isen
 */
public class barException extends Exception{
    
    
    
    /**
     * annonce à l'utilisateur que son panier est vide.
     *
     * @param message le message qui sera délivré a l'utilisateur.
     */
    public barException(String message) {
        super(message);
    }

    
    
    
}
