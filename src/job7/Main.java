package job7;

public class Main {
    public static void main(){
        CompteBanquaire p1 = new CompteBanquaire(100.23);
        CompteBanquaire p2 = new CompteBanquaire(80.50);

        p1.depot(100.10);
        p2.depot(100.20);
        p1.afficherSolde();
        p2.afficherSolde();
        p1.retrait(200.00);
        p2.retrait(300.00);
        p1.afficherSolde();
        p2.afficherSolde();


    }
}
