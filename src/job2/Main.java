package job2;

public class Main {
    public static void main(String[] args) {
        Personne p1 = new Personne();
        p1.nom = "Bob";
        p1.age = 45;
        p1.sePresenter();

        Personne p2 = new Personne();
        p2.nom = "Berte";
        p2.age = 20;
        p2.sePresenter();

        Personne p3 = new Personne();
        p3.nom = "Joe";
        p3.age = 30;
        p3.sePresenter();

    }
}
