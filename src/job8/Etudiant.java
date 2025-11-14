package job8;

public class Etudiant {
    String nom;
    int moyenne;

    public Etudiant (String nom,int moyenne){
        this.nom = nom;
        this.moyenne = moyenne;
    }
    public void afficherInfo(){
        if (moyenne >= 10){
            System.out.println("L'etudiant " + nom + " est admis");
        }
        else {
            System.out.println("L'etudiant " + nom + " est refusé");
        }
    }
}
