/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jeu;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SERAZIN
 */
public class JeuTest {
    private Jeu jeu;
    private ArrayList<Action> actions;
    
    public JeuTest(ArrayList<Action> actions) {
        jeu = new Jeu();
        this.actions = actions;
    }
    
   
    @Test
    public void testJeu() {
        this.jeu.initialisation();
        for (Action action : actions) {
            assertEquals(jeu.action(action.getJoueur(), action.getAction()),action.isResult());
            
        }
    }
    
}
