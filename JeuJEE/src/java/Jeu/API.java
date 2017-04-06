/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jeu;

/**
 *
 * @author SERAZIN
 */
public interface API {
       abstract void initialisation();
    abstract boolean action(int coups, int joueur);
    abstract int derniereAction();
    abstract String status();
    abstract int vainqueur();
    abstract String affichage();
}
