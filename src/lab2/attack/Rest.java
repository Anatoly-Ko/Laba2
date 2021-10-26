package lab2.attack;
import ru.ifmo.se.pokemon.*;
public class Rest extends StatusMove {
    public Rest(){

        super(Type.PSYCHIC, 0, 100);
    }

    @Override
    protected String describe(){
        return "На чиле,на расслабоне";
    }
    protected void applySelfEffects(Pokemon p){
        Effect e = new Effect().turns(2).condition(Status.SLEEP);
        p.setCondition(e);
        p.setMod(Stat.HP, (int)(49 - p.getHP()));
    }
}
