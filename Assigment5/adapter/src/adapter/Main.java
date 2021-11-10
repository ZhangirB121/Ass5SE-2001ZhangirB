package adapter;

public class Main {

    public static void main(String[] args) {


        DarkMagician necromancer = new DarkMagician();
        Piromant pyromaniac = new Pyromaniac();
        Piromant darkMagicianAdapter = new DarkMagicianAdapter(necromancer);

        System.out.println("Necromancer:\n");
        necromancer.darkmagic();
        necromancer.nicromancy();


        System.out.println("\nPyromainac:\n");
        pyromaniac.firemagic();

        System.out.println("\nDarl Magician Adapter:\n");
        darkMagicianAdapter.firemagic();
    }
}
