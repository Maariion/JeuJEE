package Jeu;

public class Jeu implements API{
    private int grille[][];//vertical puis horizontal
    private int dernierCoups;
    private String state;
    @Override
    public void initialisation() {
        state="joueur1";
        for(int i = 0; i < 7; i++){
            for(int j = 0; j < 6; i++){
                this.grille[i][j] = 0; //i=vertical et j horizontal
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
    public boolean action(int joueur, int coups) {
        if (coups <1 & coups >7){
            return false;         
        }
        else if(grille[6][5]!=0)
        {
            return false;
        }
        else{
            return true;
        }
    }

    @Override
    /**
     * @return int dernier coups valide joué
     */
    public int derniereAction() {
        return dernierCoups;
    }

    @Override
    public String statut() {
        return state;
    }

    @Override
    /**
     * @return int 1 si joueur un gagne, 2 si p2 et 0 si match null
     */
    public int vainqueur() {
        
    }

    @Override
    public String affichage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     //grille[][];//vertical puis horizontal
    //envoyer i j a 0 0 lors de l'appel de la fonction
    public boolean winner(int cpt,int joueur,int i,int j,int iX, int jY){
        if (cpt==4)
            return true;
        else if(i>6 | j>5)
            return false;
        for (int axeY=j;axeY<7;axeY++){
            for(int axeX=i;axeX;axeX++)
            if (grille[i+iX][j+jY]==joueur){
                winner(cpt+1,joueur,i+iX,j+jY,iX,jY);
            }
        
    }
        
        if val=
        while(grille[i][j]!=0){
            
        }
            
    }
 
    /**
     * 
     * @return grille tableau d'integer a deux dimensions
     */
    public int[][] getGrille(){
        return grille;
    }

    public void doAction(int joueur,int coups){
        
        for(int i=0; i<grille[coups-1].length;i++){
            if(grille[coups-1][i]==0){
                grille[coups-1][i]=joueur;
                dernierCoups=coups;
            }
        }
    }
    
    
}
