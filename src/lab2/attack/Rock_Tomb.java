package lab2.attack;

import ru.ifmo.se.pokemon.*;

public class Rock_Tomb extends PhysicalMove {
    public Rock_Tomb(){
        super(Type.ROCK, 60, 95);
    }

    @Override
    protected String describe(){
        return "трясет противника";
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.SPEED, -1);
    }
}
