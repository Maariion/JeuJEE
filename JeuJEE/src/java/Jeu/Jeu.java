package Jeu;

public class Jeu implements API{
    private int grille[][];
    private int 
    @Override
    public void initialisation() {
        for(int i = 0; i < this.grille.length; i++){
            for(int j = 0; j < this.grille[i].length; i++){
                this.grille[i][j] = 0; 
   }
}
        
    }
    /**
     * 
     * @param coups
     * @param joueur
     * @return boolean true: coups possible, false: coups impossible
     */
    @Override
    public boolean action(int coups, int joueur) {
        if (coups <1 & coups >7){
            return false;         
        }
        else if(grille[coups-1][5]!=0)
        {
            return false;
        }
        else{
            Action act=new Action(joueur,coups,true);
            return true;
        }
    }

    @Override
    public int derniereAction() {
        
    }

    @Override
    public String status() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int vainqueur() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String affichage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public doAction
 
}
