package bridge;

public class Samurai extends Warrior{
    Samurai(Weapon weapon){
        super(weapon);
    }

    public void info(){
        System.out.println("This is my bushido way\n");
        weapon.weapons();
    }
}
