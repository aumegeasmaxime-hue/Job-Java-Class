package job7;

public class CompteBanquaire {
    double solde;

    public CompteBanquaire (double solde){
        this.solde = solde;
    }

    public double depot(double depot){
        solde += depot;
        return solde;
    }

    public double retrait (double retrait){
        if (solde >= retrait) {
            solde -= retrait;
        }
        else {
            System.out.println("Solde insuffisant");
        }
        return solde;
    }
    public void afficherSolde (){
        System.out.println("le solde est de : " + solde);



    }




}
