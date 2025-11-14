package job14;

public class CompteEnBanque {
    public int solde;
    public CompteClient nom;

    public CompteEnBanque(int solde,CompteClient nom){
        this.solde = solde;
        this.nom = nom;
    }
    public void afficher(){
        System.out.println("le nom du client est " + nom.nom + " sont solde est de: " + solde + ".");
    }

}
