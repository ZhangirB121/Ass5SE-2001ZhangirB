package facade;

public class SpellFacade {
    private FireBall fireBall;
    private  IceSpear iceSpear;
    private Lightning lightning;

    public SpellFacade(){
        fireBall = new FireBall();
        iceSpear = new IceSpear();
        lightning = new Lightning();
    }

    public void useSpell(){
        fireBall.useSpell();
        iceSpear.useSpell();
        lightning.useSpell();
    }
}
