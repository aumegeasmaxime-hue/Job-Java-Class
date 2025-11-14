package job3;

public class Main {
    public static void main(String[] args) {
        Personne p1 = new Personne("joe",20);
        p1.nom = "Bob";
        p1.age = 45;
        p1.sePresenter();

        Personne p2 = new Personne("joe",20);
        p2.nom = "Berte";
        p2.age = 20;
        p2.sePresenter();

        Personne p3 = new Personne("joe",20);


        p3.sePresenter();

    }
}
