package bridge;

public class Knight extends Warrior{
    Knight(Weapon weapon) {
        super(weapon);
    }

    public void info(){
        System.out.println("The chivalrous times have not passed. It's just that the dragons have changed.\n");
        weapon.weapons();
    }
}
