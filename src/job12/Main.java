package job12;

public class Main {
    public static void main() {
        Livre l1 = new Livre("ou est charlie","charlie",30);
        Livre l2 = new Livre("Moby-dick","Herman Melville",944);

        l1.afficherInfo();
        l1.estLong();

        System.out.println();

        l2.afficherInfo();
        l2.estLong();



    }
}
