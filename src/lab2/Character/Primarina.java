package lab2.Character;

import ru.ifmo.se.pokemon.*;
import lab2.attack.*;

public class Primarina extends Brionne {

    public Primarina(String name, int value){
        super(name, value);
        this.setStats(80.0,74.0,74.0,126.0,116.0,60.0);
        this.setType(Type.WATER,Type.FAIRY);
        setMove(new Aerial_Ace(), new Rest(), new Poison_Sting(), new Peck());
    }

}