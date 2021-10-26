package lab2.Character;

import ru.ifmo.se.pokemon.*;
import lab2.attack.*;

public class Popplio extends Pokemon {

    public Popplio(String name, int value){
        super(name, value);
        this.setStats(50.0,54.0,54.0,66.0,56.0,40.0);
        this.setType(Type.WATER);
        setMove(new Aerial_Ace(), new Rest());
    }

}