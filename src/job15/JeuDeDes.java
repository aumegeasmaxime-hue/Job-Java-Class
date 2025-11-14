package job15;

public class JeuDeDes {
    public Joueur nomJoueur1;
    public Joueur nomJoueur2;
    public int des;
    public JeuDeDes (Joueur nom1,Joueur nom2){
        this.nomJoueur1 = nom1;
        this.nomJoueur2 = nom2;
    }
    public int des (){
        des =(int) (Math.random()*7);
        return des;
    }
    public void resultat (int des1,int des2){
        if (des1 == des2){
            System.out.println("draw");
            System.out.println(des1 + " " + des2);
        } else if (des1 > des2) {
            System.out.println(des1 + " " + des2);
            System.out.println(nomJoueur1.nomJoueur + " win");
        }
        else {
            System.out.println(des1 + " " + des2);
            System.out.println(nomJoueur2.nomJoueur + " win");
        }
    }
}

