package adapter;

public class DarkMagicianAdapter implements Piromant{
    Necromancer necromancer;

    public DarkMagicianAdapter(Necromancer necromancer){
        this.necromancer = necromancer;
    }


    @Override
    public void firemagic() {
        necromancer.darkmagic();
    }
}
