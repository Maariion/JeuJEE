package Jeu;


public class Main {
    private Jeu jeuActu;
    private int x;

    public void main(String[] args) {
        jeuActu.initialisation();
        while(jeuActu.statut()!="finie"){
            if(jeuActu.statut()=="joueur1"){
                if(jeuActu.action(1, x)){
                    jeuActu.doAction(1,x);
                    if jeuActu.Victoire(){
                        System.out.println("gagne");
                    }
            }
            else{
                
            }
            }
        }
    }
    
}
