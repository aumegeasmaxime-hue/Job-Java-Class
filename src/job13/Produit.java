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
        double result = prixHt + (prixHt*(taxe/100));
        return result;
    }
    public void afficher(){
        System.out.println("le produit: " + nom + " coûte: " + prixTtc() + " euros TTC");
    }
}
