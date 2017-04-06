/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Jeu2;

import org.junit.After;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * JEU 2 : PUISSANCE QUATRE 
 */
public class Jeu2Test 
{
    
    private int joueur1 = 1; 
    private int joueur2 = 2;
          // Coups pour le jeu2 
    private int coups4 = 0;
    private int coups5 = 3;
    private int coups6 = 8 ;
    
    private Jeu2 jeu2; // Jeu de puissance 4 
   

       @Before
    
    public void Jeu2Test() 
    {
        jeu2 = new Jeu2();
        this.jeu2.initialisation();
    }
    
        @After
    public void tearDown() throws Exception 
    {
        
    }
       
     @Test
    public void testActionJeu2 ()
    {
     assertFalse(this.jeu2.action(coups4,joueur1));
     assertFalse(this.jeu2.action(coups5,joueur1));
     assertTrue(this.jeu2.action(coups6,joueur1));
     assertFalse(this.jeu2.action(coups4,joueur2));
     assertFalse(this.jeu2.action(coups5,joueur2));
     assertTrue(this.jeu2.action(coups6,joueur2));
    }
    
     @Test
    public void testVainqueurJoueur1Jeu2()
    {
        jeu2.action(1,1);
        jeu2.action(7,2);
        jeu2.action(2,1);
        jeu2.action(6,2);
        jeu2.action(3,1);
        jeu2.action(5,2);
        jeu2.action(4,1);
        assertEquals(jeu2.vainqueur(),1);
    }
    
         @Test
    public void testVainqueurJoueur2Jeu2()
    {
        jeu2.action(1,2);
        jeu2.action(7,1);
        jeu2.action(2,2);
        jeu2.action(6,1);
        jeu2.action(3,2);
        jeu2.action(5,1);
        jeu2.action(4,2);
        assertEquals(jeu2.vainqueur(),2);
    }
    
    
     @Test
    public void testDerniereActionJeu2()
    {
        assertEquals(jeu2.derniereAction(),0);
        this.jeu2.action(coups5,joueur1); 
        assertEquals(jeu2.derniereAction(),coups5);
    }
    
      @Test
    public void testStatutJeu2()
    {
        jeu2.action(1,2);
        assertEquals(this.jeu2.statut(),"joueur1");
        
        jeu2.action(7,1);
        assertEquals(this.jeu2.statut(),"joueur2");
        
        jeu2.action(2,2);
        jeu2.action(6,1);
        jeu2.action(3,2);
        jeu2.action(5,1);
        jeu2.action(4,2);
        assertEquals(this.jeu2.statut(),"finie");
    }
    
      @Test
    public void testAffichageJoueur1Jeu2()
    {
        jeu2.action(1,1);
        jeu2.action(7,2);
        jeu2.action(2,1);
        jeu2.action(6,2);
        jeu2.action(3,1);
        jeu2.action(5,2);
        jeu2.action(4,1);

        assertEquals(jeu2.affichage(),"joueur1 gagne");
    }
    
       public void testAffichageJoueur2Jeu2()
    {
        jeu2.action(1,2);
        jeu2.action(7,1);
        jeu2.action(2,2);
        jeu2.action(6,1);
        jeu2.action(3,2);
        jeu2.action(5,1);
        jeu2.action(4,2);

        assertEquals(jeu2.affichage(),"joueur2 gagne");
    }
}