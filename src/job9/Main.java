package job9;

public class Main {
    public static void main (){
        Etudiant e1 = new Etudiant("Bob",10);
        Etudiant e2 = new Etudiant("Berte",9);
        Etudiant e3 = new Etudiant("Remon",5);
        Etudiant e4 = new Etudiant("Albert",15);

        e1.afficherInfo();
        e2.afficherInfo();
        e3.afficherInfo();
        e4.afficherInfo();

        System.out.println();

        System.out.println(e1.getMoyenne());
        System.out.println(e2.getMoyenne());
        System.out.println(e3.getMoyenne());
        System.out.println(e4.getMoyenne());

        System.out.println();

        e1.setMoyenne(20);
        e2.setMoyenne(20);
        e3.setMoyenne(20);
        e4.setMoyenne(20);

        System.out.println();

        e1.afficherInfo();
        e2.afficherInfo();
        e3.afficherInfo();
        e4.afficherInfo();





    }
}
