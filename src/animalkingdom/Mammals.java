package animalkingdom;

public class Mammals extends Animal {

    public Mammals(int id, String name, int yearNamed) {
        super(id, name, yearNamed);
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