/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
test
 * and open the template in the editor.
 */
package Jeu1;


import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * JEU 1 : BATAILLE NAVALE 
 */
public class Jeu1Test
{
   
    private int joueur1 = 1; 
    private int joueur2 = 2;
    
    //Tableau d'integer qui représentent les bateaux pour la bataille navale
    private ArrayList <int[]> bateauJ1;
    private ArrayList <int[]> bateauJ2;
    
    private Jeu1 jeu1; // Jeu de la bataille navale 
    
    
    // Coups pour le jeu1 
    private int coups1 = 10;
    private int coups2 = 100;
    private int coups3 = 50 ;

    
    @Before
    public void jeu1Test() 
    {
        jeu1 = new Jeu1();
        this.jeu1.initialisation(bateauJ1,bateauJ2);
    }
    
    @After
    public void tearDown() throws Exception 
    {
        
    }
   

     @Test
    public void testActionJeu1 ()
    {
     assertFalse(this.jeu1.action(coups1,joueur1));
     assertFalse(this.jeu1.action(coups2,joueur1));
     assertTrue(this.jeu1.action(coups3,joueur1));
     assertFalse(this.jeu1.action(coups1,joueur2));
     assertFalse(this.jeu1.action(coups2,joueur2));
     assertTrue(this.jeu1.action(coups3,joueur2));
    }
    
     @Test
    public void testVainqueurJoueur2Jeu1()
    {
        jeu1.action(bateauJ1.get(0),2);
        jeu1.action(11,1);
        jeu1.action(bateauJ1.get(1),2);
        jeu1.action(25,1);
        jeu1.action(bateauJ1.get(2),2);
        jeu1.action(30,1);
        jeu1.action(bateauJ1.get(3),2);
        jeu1.action(55,1);
        jeu1.action(bateauJ1.get(4),2);
        jeu1.action(72,1);

        assertEquals(jeu1.vainqueur(),2);
    }
    
    @Test
    public void testVainqueurJoueur1Jeu1()
    {
        jeu1.action(bateauJ2.get(0),1);
        jeu1.action(11,2);
        jeu1.action(bateauJ2.get(1),1);
        jeu1.action(25,2);
        jeu1.action(bateauJ2.get(2),1);
        jeu1.action(30,2);
        jeu1.action(bateauJ2.get(3),1);
        jeu1.action(55,2);
        jeu1.action(bateauJ2.get(4),1);
        jeu1.action(72,2);

        assertEquals(jeu1.vainqueur(),1);
    }
    
        @Test
    public void testVainqueurEgaliteJeu1()
    {
        jeu1.action(bateauJ1.get(0),2);
        jeu1.action(bateauJ2.get(0),1);
        jeu1.action(bateauJ1.get(1),2);
        jeu1.action(bateauJ2.get(1),1);
        jeu1.action(bateauJ1.get(2),2);
        jeu1.action(bateauJ2.get(2),1);
        jeu1.action(bateauJ1.get(3),2);
        jeu1.action(bateauJ2.get(3),1);
        jeu1.action(bateauJ1.get(4),2);
        jeu1.action(bateauJ2.get(4),1);

        assertEquals(jeu1.vainqueur(),0);
    }
    
     @Test
    public void testDerniereActionJeu1()
    {
        assertEquals(jeu1.derniereAction(),0);
        this.jeu1.action(coups3,joueur1); 
        assertEquals(jeu1.derniereAction(),coups3);
    }
    
     @Test
    public void testStatutJeu1()
    {
        jeu1.action(bateauJ1.get(0),2);
        assertEquals(this.jeu1.statut(),"joueur1");
        
        jeu1.action(bateauJ2.get(0),1);
        assertEquals(this.jeu1.statut(),"joueur2");
        
        jeu1.action(bateauJ1.get(1),2);
        jeu1.action(bateauJ2.get(1),1);
        jeu1.action(bateauJ1.get(2),2);
        jeu1.action(bateauJ2.get(2),1);
        jeu1.action(bateauJ1.get(3),2);
        jeu1.action(bateauJ2.get(3),1);
        jeu1.action(bateauJ1.get(4),2);
        jeu1.action(bateauJ2.get(4),1);
        assertEquals(this.jeu1.statut(),"finie");
    }
    
     @Test
    public void testAffichageJoueur2Jeu1()
    {
        jeu1.action(bateauJ1.get(0),2);
        jeu1.action(11,1);
        jeu1.action(bateauJ1.get(1),2);
        jeu1.action(25,1);
        jeu1.action(bateauJ1.get(2),2);
        jeu1.action(30,1);
        jeu1.action(bateauJ1.get(3),2);
        jeu1.action(55,1);
        jeu1.action(bateauJ1.get(4),2);
        jeu1.action(72,1);

        assertEquals(jeu1.affichage(),"joueur2 gagne");
    }
    
      @Test
    public void testAffichageJoueur1Jeu1()
    {
        jeu1.action(bateauJ2.get(0),1);
        jeu1.action(11,2);
        jeu1.action(bateauJ2.get(1),1);
        jeu1.action(25,1);
        jeu1.action(bateauJ2.get(2),1);
        jeu1.action(30,1);
        jeu1.action(bateauJ2.get(3),1);
        jeu1.action(55,1);
        jeu1.action(bateauJ2.get(4),1);
        jeu1.action(72,1);

        assertEquals(jeu1.affichage(),"joueur1 gagne");
    }
    
        @Test
    public void testAffichageEgaliteJeu1()
    {
        jeu1.action(bateauJ1.get(0),2);
        jeu1.action(bateauJ2.get(0),1);
        jeu1.action(bateauJ1.get(1),2);
        jeu1.action(bateauJ2.get(1),1);
        jeu1.action(bateauJ1.get(2),2);
        jeu1.action(bateauJ2.get(2),1);
        jeu1.action(bateauJ1.get(3),2);
        jeu1.action(bateauJ2.get(3),1);
        jeu1.action(bateauJ1.get(4),2);
        jeu1.action(bateauJ2.get(4),1);
        
        assertEquals(jeu1.affichage(),"egalite");
    }
}