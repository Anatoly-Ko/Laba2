package lab2;
import lab2.Character.*;
import ru.ifmo.se.pokemon.*;

public class Main {

    public static void main(String[] args) {
        Battle b = new Battle();
        Brionne p1 = new Brionne("Britny",1);
        Primarina p2 = new Primarina("Primat", 1);
        Absol p3 = new Absol("Abs", 1);
        Woobat p4 = new Woobat("Wombat", 1);
        Popplio p5 = new Popplio("Poop", 1);
        Swoobat p6 = new Swoobat("Toucan", 1);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }
}
