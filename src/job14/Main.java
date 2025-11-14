package job14;

public class Main {
    public static void main (){
        CompteClient c = new CompteClient("Bob");
        CompteEnBanque c1 = new CompteEnBanque(100,c);

        c1.afficher();
    }
}
