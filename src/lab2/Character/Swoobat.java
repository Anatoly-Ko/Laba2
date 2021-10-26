package lab2.Character;

import ru.ifmo.se.pokemon.*;
import lab2.attack.*;

public class Swoobat extends Woobat {

    public Swoobat(String name, int value){
        super(name, value);
        this.setStats(67.0,57.0,55.0,77.0,55.0,114.0);
        this.setType(Type.PSYCHIC, Type.FLYING);
        setMove(new Swagger(), new Confide(), new Bulldoze(), new Rock_Tomb());
    }

}