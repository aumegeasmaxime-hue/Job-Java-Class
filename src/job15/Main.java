package job15;

public class Main {
    public static void main(){
        Joueur j1 = new Joueur("Bob");
        Joueur j2 = new Joueur("Berthe");
        JeuDeDes d1 = new JeuDeDes(j1,j2);
        JeuDeDes d2 = new JeuDeDes(j1,j2);

        d1.resultat(d1.des(),d2.des());
    }

}
