package lab2.attack;

import ru.ifmo.se.pokemon.*;

public class Frost_Breath extends SpecialMove {
    public Frost_Breath(){
        super(Type.ICE, 60, 90);
    }

    @Override
    protected String describe(){
        return "замораживает противника";
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        applyOppDamage(p, 90);
    }

}
