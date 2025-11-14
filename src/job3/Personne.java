package job3;

public class Personne {
    String nom;
    int age;


    public  Personne(String nom,int age) {
        this.nom = nom;
        this.age = age;

    }

    public void sePresenter(){
        System.out.println("Je m'appelle: " + nom + " et j’ai " + age + " ans.");
    }




}
