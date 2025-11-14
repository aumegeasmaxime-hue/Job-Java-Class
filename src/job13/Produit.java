package job13;

public class Produit {
    public String nom;
    public double prixHt;
    public int taxe;

    public Produit (String nom,double prix,int taxe){
        this.nom = nom;
        this.prixHt = prix;
        this.taxe = taxe;
    }
    public double prixTtc(){
        return prixHt + (prixHt*((double) taxe / 100));
    }
    public void afficher(){
        System.out.println("le produit: " + nom + " coûte: " + prixTtc() + " euros TTC");
    }
}
