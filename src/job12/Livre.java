package job12;

public class Livre {
    public String titre;
    public String auteur;
    public int nbPages;

    public Livre (String titre,String auteur,int nbPages){
        this.titre = titre;
        this.auteur = auteur;
        this.nbPages = nbPages;
    }
    public void afficherInfo (){
        System.out.println("le titre du livre est: " + titre);
        System.out.println("le nom de l'auteur est: " + auteur);
        System.out.println("il y a " + nbPages + " pages dans ce livre");
    }
    public void  estLong (){
        if (nbPages >= 300) {
            System.out.println("Ce livre est long");
        }
        else {
            System.out.println("Ce livre est bref");
        }
    }
}
