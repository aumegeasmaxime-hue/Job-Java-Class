package job6;

public class Main {
    public static void main(){
        Voiture voiture1 = new Voiture("toyota",130);
        Voiture voiture2 = new Voiture("nissan",150);
        Voiture voiture3 = new Voiture("renault",100);

        voiture1.acceler();
        voiture2.acceler();
        voiture3.acceler();
        voiture1.acceler();
        voiture2.acceler();
        voiture3.acceler();
    }
}
