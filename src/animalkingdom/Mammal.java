package animalkingdom;

public class Mammal extends Animal {

    public Mammal(String name, int yearNamed) {
        super(name, yearNamed);
    }

    @Override
    public String move() {
        return "Move by walking";
    }

    @Override
    public String breathe() {
        return "Breathe with lungs";
    }

    @Override
    public String reproduce() {
        return "Reproduce via live birth";
    }
}