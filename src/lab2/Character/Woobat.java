package lab2.Character;

import ru.ifmo.se.pokemon.*;
import lab2.attack.*;

public class Woobat extends Pokemon {

    public Woobat(String name, int value){
        super(name, value);
        this.setStats(65.0,45.0,43.0,55.0,43.0,72.0);
        this.setType(Type.PSYCHIC, Type.FLYING);
        setMove(new Swagger(), new Confide(), new Bulldoze());
    }

}
