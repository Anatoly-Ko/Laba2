package lab2.Character;

import ru.ifmo.se.pokemon.*;
import lab2.attack.*;

public class Absol extends Pokemon {

    public Absol(String name, int value){
        super(name, value);
        this.setStats(65.0,130.0,60.0,75.0,60.0,75.0);
        this.setType(Type.DARK);
        setMove(new Swagger(), new Frost_Breath(), new Facade(), new Ice_Beam());
    }

}