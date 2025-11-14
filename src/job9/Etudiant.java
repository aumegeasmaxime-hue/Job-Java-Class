package job9;

public class Etudiant {
    private String nom;
    private int moyenne;

    public Etudiant (String nom,int moyenne){
        this.nom = nom;
        this.moyenne = moyenne;
    }

    public String getNom(){
        return nom;
    }
    public int getMoyenne(){
        return moyenne;
    }
    public void setNom (String nom) {
        this.nom = nom;
    }
    public void setMoyenne(int moyenne){
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
