package bridge;

public class Main {

    public static void main(String[] args) {
        Warrior samurai = new Samurai(new Katana());

        samurai.info();
        samurai.warriorWeapon(new Tetsubo());
        samurai.info();
        System.out.println("---------------------------------------------------------------------");

        Warrior viking = new Viking(new Axe());
        viking.info();
    }
}
