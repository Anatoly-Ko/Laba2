package lab2.attack;

import ru.ifmo.se.pokemon.*;

public class Ice_Beam extends SpecialMove {
    public Ice_Beam(){
        super(Type.ICE, 90, 100);
    }
    @Override
    protected String describe(){
        return "замораживает противника";
    }

    @Override
    protected void applyOppEffects(Pokemon p){

        p.addEffect(new Effect().condition(Status.FREEZE).chance(0.1));
    }
}
