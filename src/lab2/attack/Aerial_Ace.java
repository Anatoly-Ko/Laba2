package lab2.attack;

import ru.ifmo.se.pokemon.*;

public class Aerial_Ace extends PhysicalMove {
    public Aerial_Ace(){
        super(Type.FLYING, 60,100);
    }
    @Override
    protected String describe(){
        return "Воздушит противника";
    }

}
