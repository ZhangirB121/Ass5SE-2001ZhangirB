package bridge;

public abstract class Warrior {
    Weapon weapon;
    public void warriorWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    Warrior(Weapon weapon){
        this.weapon = weapon;
    }

    void info(){
        weapon.weapons();
    }

}
