package lab2.Character;

import ru.ifmo.se.pokemon.*;
import lab2.attack.*;

public class Brionne extends Popplio {

    public Brionne(String name, int value){
        super(name, value);
        this.setStats(60.0,69.0,69.0,91.0,81.0,50.0);
        this.setType(Type.WATER);
        setMove(new Aerial_Ace(), new Rest(), new Poison_Sting());
    }

}