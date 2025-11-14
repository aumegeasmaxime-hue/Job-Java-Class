package job8;

public class Main {
    public static void main(){
        Etudiant e1 = new Etudiant("Bob",10);
        Etudiant e2 = new Etudiant("Berte",9);
        Etudiant e3 = new Etudiant("Remon",5);
        Etudiant e4 = new Etudiant("Albert",15);

        e1.afficherInfo();
        e2.afficherInfo();
        e3.afficherInfo();
        e4.afficherInfo();
    }
}
