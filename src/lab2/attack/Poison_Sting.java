package lab2.attack;

import ru.ifmo.se.pokemon.*;

public class Poison_Sting extends PhysicalMove {
    public Poison_Sting(){
        super(Type.POISON, 15, 100);
    }
    @Override
    protected String describe(){
        return "жалит противника";
    }

    @Override
    protected void applyOppEffects(Pokemon p){

        p.addEffect(new Effect().condition(Status.POISON).chance(0.3));
    }
}