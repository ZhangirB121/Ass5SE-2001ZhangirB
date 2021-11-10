package bridge;

public class Viking extends Warrior{
    Viking(Weapon weapon) {
        super(weapon);
    }

    public void info(){
        System.out.println("Your drakkar is at the bottom,\n" +
                "My heart is burning like a flame.\n" +
                "And the waters in the sea are cool,\n" +
                "But the soul does not know grief.\n" +
                "The day will come, the hour will come.\n" +
                "Death awaits each of us!\n");
        weapon.weapons();
    }
}
