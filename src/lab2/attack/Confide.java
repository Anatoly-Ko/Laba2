package lab2.attack;

import ru.ifmo.se.pokemon.*;

public class Confide extends StatusMove {
    public Confide() {
        super(Type.NORMAL, 0, 100);
    }
    @Override
    protected String describe(){
        return "Работает";
    }
    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def) {
        return true;
    }

    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.ATTACK, 100);
        p.setMod(Stat.SPECIAL_ATTACK, 1);
    }
}
