package job5;

public class Voiture {
    String marque;
    int vitesse;

    public Voiture(String marque, int vitesse) {
        this.marque = marque;
        this.vitesse = vitesse;
    }
    public void acceler (){
        vitesse += 10;
        System.out.println("la marque " + marque + " roule a une vitesse de : " + vitesse);
    }

}