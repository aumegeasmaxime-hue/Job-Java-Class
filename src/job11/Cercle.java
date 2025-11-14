package job11;

public class Cercle {
    public int rayon;

    public Cercle (int rayon){
        this.rayon = rayon;
    }
    public void perimetre (){
        double peri = 2 * 3.14 * rayon;
        System.out.println("le perimetre est: " + peri);
    }
    public void aire (){
        double aire = 3.14 * rayon * rayon;
        System.out.println("l'aire est de: " + aire);
    }
}
