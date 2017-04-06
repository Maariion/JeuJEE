
package Jeu3;

import org.junit.After;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * JEU 3 : REVERSI 
 */
public class Jeu3Test 
{
    private int joueur1 = 1; 
    private int joueur2 = 2;
    
    private Jeu3 jeu3; // Jeu du reversi
    
        
       // Coups pour le jeu3 
    private int coups7 = 10;
    private int coups8 = 30;
    private int coups9 = 89;

    
       // Test sur le troisième jeu 
    
       @Before
    
    public void jeu3Test() 
    {
        jeu3 = new Jeu3();
    }
    
        @After
    public void tearDown() throws Exception 
    {
        
    }
       
    @Test
    public void testInitialisatioJeu3() 
    {
        this.jeu3.initialisation();
       
    }
    
     @Test
    public void testActionJeu3 ()
    {
     assertFalse(this.jeu3.action(coups7,joueur1));
     assertFalse(this.jeu3.action(coups8,joueur1));
     assertTrue(this.jeu3.action(coups9,joueur1));
     assertFalse(this.jeu3.action(coups7,joueur2));
     assertFalse(this.jeu3.action(coups8,joueur2));
     assertTrue(this.jeu3.action(coups9,joueur2));
    }
     @Test
    public void testVainqueurJoueur1Jeu3()
    {
        jeu3.action(35,1);
        jeu3.action(34,2);
        jeu3.action(33,1);
        jeu3.action(24,2);
        jeu3.action(23,1);
        jeu3.action(46,2);
        jeu3.action(36,1);
        jeu3.action(26,2);
        jeu3.action(37,1);
        jeu3.action(56,2);
        jeu3.action(66,1);
        jeu3.action(32,2);
        jeu3.action(31,1);
        jeu3.action(53,2);
        jeu3.action(64,1);
        jeu3.action(38,2);
        jeu3.action(16,1);
        jeu3.action(57,2);
        jeu3.action(28,1);
        jeu3.action(18,2);
        jeu3.action(67,1);
        jeu3.action(73,2);
        jeu3.action(74,1);
        jeu3.action(84,2);
        jeu3.action(52,1);
        jeu3.action(51,2);
        jeu3.action(63,1);
        jeu3.action(15,2);
        jeu3.action(14,1);
        jeu3.action(13,2);
        jeu3.action(12,1);
        jeu3.action(43,2);
        jeu3.action(68,1);
        jeu3.action(25,2);
        jeu3.action(65,1);
        jeu3.action(76,2);
        jeu3.action(87,1);
        jeu3.action(62,2);
        jeu3.action(61,1);
        jeu3.action(86,2);
        jeu3.action(83,1);
        jeu3.action(88,2);
        jeu3.action(27,1);
        jeu3.action(82,2);
        jeu3.action(85,1);
        jeu3.action(21,2);
        jeu3.action(81,1);
        jeu3.action(22,2);
        jeu3.action(11,1);
        jeu3.action(58,2);
        jeu3.action(77,1);
        jeu3.action(75,2);
        jeu3.action(72,1);
        jeu3.action(42,2);
        jeu3.action(41,1);
        jeu3.action(47,2);
        jeu3.action(48,1);
        jeu3.action(17,2);
        jeu3.action(78,1);
        jeu3.action(71,2);
        assertEquals(jeu3.vainqueur(),1);
    }
    
    @Test
       public void testVainqueurJoueur2Jeu3()
    {
        jeu3.action(35,2);
        jeu3.action(34,1);
        jeu3.action(33,2);
        jeu3.action(24,1);
        jeu3.action(23,2);
        jeu3.action(46,1);
        jeu3.action(36,2);
        jeu3.action(26,1);
        jeu3.action(37,2);
        jeu3.action(56,1);
        jeu3.action(66,2);
        jeu3.action(32,1);
        jeu3.action(31,2);
        jeu3.action(53,1);
        jeu3.action(64,2);
        jeu3.action(38,1);
        jeu3.action(16,2);
        jeu3.action(57,1);
        jeu3.action(28,2);
        jeu3.action(18,1);
        jeu3.action(67,2);
        jeu3.action(73,1);
        jeu3.action(74,2);
        jeu3.action(84,1);
        jeu3.action(52,2);
        jeu3.action(51,1);
        jeu3.action(63,2);
        jeu3.action(15,1);
        jeu3.action(14,2);
        jeu3.action(13,1);
        jeu3.action(12,2);
        jeu3.action(43,1);
        jeu3.action(68,2);
        jeu3.action(25,1);
        jeu3.action(65,2);
        jeu3.action(76,1);
        jeu3.action(87,2);
        jeu3.action(62,1);
        jeu3.action(61,2);
        jeu3.action(86,1);
        jeu3.action(83,2);
        jeu3.action(88,1);
        jeu3.action(27,2);
        jeu3.action(82,1);
        jeu3.action(85,2);
        jeu3.action(21,1);
        jeu3.action(81,2);
        jeu3.action(22,1);
        jeu3.action(11,2);
        jeu3.action(58,1);
        jeu3.action(77,2);
        jeu3.action(75,1);
        jeu3.action(72,2);
        jeu3.action(42,1);
        jeu3.action(41,2);
        jeu3.action(47,1);
        jeu3.action(48,2);
        jeu3.action(17,1);
        jeu3.action(78,2);
        jeu3.action(71,1);
        assertEquals(jeu3.vainqueur(),2);
    }
       
    
     @Test
    public void testDerniereActionJeu3()
    {
        assertEquals(jeu3.derniereAction(),0);
        this.jeu3.action(coups8,joueur1); 
        assertEquals(jeu3.derniereAction(),coups8);
    }
    
      @Test
    public void testStatutJeu3()
    {
        jeu3.action(35,2);
        assertEquals(this.jeu3.statut(),"joueur1");
        
        jeu3.action(34,1);
        assertEquals(this.jeu3.statut(),"joueur2");
        
        jeu3.action(33,2);
        jeu3.action(24,1);
        jeu3.action(23,2);
        jeu3.action(46,1);
        jeu3.action(36,2);
        jeu3.action(26,1);
        jeu3.action(37,2);
        jeu3.action(56,1);
        jeu3.action(66,2);
        jeu3.action(32,1);
        jeu3.action(31,2);
        jeu3.action(53,1);
        jeu3.action(64,2);
        jeu3.action(38,1);
        jeu3.action(16,2);
        jeu3.action(57,1);
        jeu3.action(28,2);
        jeu3.action(18,1);
        jeu3.action(67,2);
        jeu3.action(73,1);
        jeu3.action(74,2);
        jeu3.action(84,1);
        jeu3.action(52,2);
        jeu3.action(51,1);
        jeu3.action(63,2);
        jeu3.action(15,1);
        jeu3.action(14,2);
        jeu3.action(13,1);
        jeu3.action(12,2);
        jeu3.action(43,1);
        jeu3.action(68,2);
        jeu3.action(25,1);
        jeu3.action(65,2);
        jeu3.action(76,1);
        jeu3.action(87,2);
        jeu3.action(62,1);
        jeu3.action(61,2);
        jeu3.action(86,1);
        jeu3.action(83,2);
        jeu3.action(88,1);
        jeu3.action(27,2);
        jeu3.action(82,1);
        jeu3.action(85,2);
        jeu3.action(21,1);
        jeu3.action(81,2);
        jeu3.action(22,1);
        jeu3.action(11,2);
        jeu3.action(58,1);
        jeu3.action(77,2);
        jeu3.action(75,1);
        jeu3.action(72,2);
        jeu3.action(42,1);
        jeu3.action(41,2);
        jeu3.action(47,1);
        jeu3.action(48,2);
        jeu3.action(17,1);
        jeu3.action(78,2);
        jeu3.action(71,1);
        assertEquals(this.jeu3.statut(),"finie");
    }
    
        @Test
    public void testAffichageJoueur1Jeu3()
    {
        jeu3.action(35,1);
        jeu3.action(34,2);
        jeu3.action(33,1);
        jeu3.action(24,2);
        jeu3.action(23,1);
        jeu3.action(46,2);
        jeu3.action(36,1);
        jeu3.action(26,2);
        jeu3.action(37,1);
        jeu3.action(56,2);
        jeu3.action(66,1);
        jeu3.action(32,2);
        jeu3.action(31,1);
        jeu3.action(53,2);
        jeu3.action(64,1);
        jeu3.action(38,2);
        jeu3.action(16,1);
        jeu3.action(57,2);
        jeu3.action(28,1);
        jeu3.action(18,2);
        jeu3.action(67,1);
        jeu3.action(73,2);
        jeu3.action(74,1);
        jeu3.action(84,2);
        jeu3.action(52,1);
        jeu3.action(51,2);
        jeu3.action(63,1);
        jeu3.action(15,2);
        jeu3.action(14,1);
        jeu3.action(13,2);
        jeu3.action(12,1);
        jeu3.action(43,2);
        jeu3.action(68,1);
        jeu3.action(25,2);
        jeu3.action(65,1);
        jeu3.action(76,2);
        jeu3.action(87,1);
        jeu3.action(62,2);
        jeu3.action(61,1);
        jeu3.action(86,2);
        jeu3.action(83,1);
        jeu3.action(88,2);
        jeu3.action(27,1);
        jeu3.action(82,2);
        jeu3.action(85,1);
        jeu3.action(21,2);
        jeu3.action(81,1);
        jeu3.action(22,2);
        jeu3.action(11,1);
        jeu3.action(58,2);
        jeu3.action(77,1);
        jeu3.action(75,2);
        jeu3.action(72,1);
        jeu3.action(42,2);
        jeu3.action(41,1);
        jeu3.action(47,2);
        jeu3.action(48,1);
        jeu3.action(17,2);
        jeu3.action(78,1);
        jeu3.action(71,2);
        assertEquals(jeu3.affichage(),"joueur1 gagne");
    }
    
       public void testAffichageJoueur2Jeu3()
    {
        jeu3.action(35,2);
        jeu3.action(34,1);
        jeu3.action(33,2);
        jeu3.action(24,1);
        jeu3.action(23,2);
        jeu3.action(46,1);
        jeu3.action(36,2);
        jeu3.action(26,1);
        jeu3.action(37,2);
        jeu3.action(56,1);
        jeu3.action(66,2);
        jeu3.action(32,1);
        jeu3.action(31,2);
        jeu3.action(53,1);
        jeu3.action(64,2);
        jeu3.action(38,1);
        jeu3.action(16,2);
        jeu3.action(57,1);
        jeu3.action(28,2);
        jeu3.action(18,1);
        jeu3.action(67,2);
        jeu3.action(73,1);
        jeu3.action(74,2);
        jeu3.action(84,1);
        jeu3.action(52,2);
        jeu3.action(51,1);
        jeu3.action(63,2);
        jeu3.action(15,1);
        jeu3.action(14,2);
        jeu3.action(13,1);
        jeu3.action(12,2);
        jeu3.action(43,1);
        jeu3.action(68,2);
        jeu3.action(25,1);
        jeu3.action(65,2);
        jeu3.action(76,1);
        jeu3.action(87,2);
        jeu3.action(62,1);
        jeu3.action(61,2);
        jeu3.action(86,1);
        jeu3.action(83,2);
        jeu3.action(88,1);
        jeu3.action(27,2);
        jeu3.action(82,1);
        jeu3.action(85,2);
        jeu3.action(21,1);
        jeu3.action(81,2);
        jeu3.action(22,1);
        jeu3.action(11,2);
        jeu3.action(58,1);
        jeu3.action(77,2);
        jeu3.action(75,1);
        jeu3.action(72,2);
        jeu3.action(42,1);
        jeu3.action(41,2);
        jeu3.action(47,1);
        jeu3.action(48,2);
        jeu3.action(17,1);
        jeu3.action(78,2);
        jeu3.action(71,1);
        assertEquals(jeu3.affichage(),"joueur2 gagne");
    }
}