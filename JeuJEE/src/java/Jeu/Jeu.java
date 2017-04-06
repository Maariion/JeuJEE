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
    public String affichage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
        
    public boolean yaGagnant(int xmin, int xmax, int ymin, int ymax, int dx, int dy) {
        for (int i = xmin; i <= xmax; i++) {
            for (int j = ymin; j <= ymax; j++){
                if (grille[i][j]!=0
                        && grille[i][j] == grille[i + dx][j + dy]
                        && grille[i][j] == grille[i + 2 * dx][j + 2 * dy]
                        && grille[i][j] == grille[i + 3 * dx][j + 3 * dy]) {
                    return true;
                }
            }
        }
        return false;
 
    }    
    @Override  
    public int vainqueur() { //On ne gere pas le match nul
        int gagnant=0;
        if (state=="joueur1"){
            gagnant=1;
            state="joueur2";
        }
        else{
            gagnant=2;
            state="joueur1";
        }
        if (yaGagnant(0, 3, 0,5, 1, 0)) { // Vérifie si 4 pions sont alignés horizontalement
            state="finie";
            return gagnant;
        }
        if (yaGagnant(0, 6, 0, 2, 0, 1)) { // Vérifie si 4 pions sont alignés verticalement
            state="finie";
            return gagnant;
        }
        if (yaGagnant(0, 3,0,2, 1, 1)) { // Vérifie si 4 pions sont alignés sur les diagonales à pente positive
            state="finie";
            return gagnant;
        }
        if (yaGagnant(0,3,0,2, 1, -1)) { // Vérifie si 4 pions sont alignés sur les diagonales à pente négative
            state="finie";
            return gagnant;
        }
        
        return 0;
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
