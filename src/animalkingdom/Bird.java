package animalkingdom;

public class Bird extends Animal {
    public Bird(String name, int yearNamed) {
        super(name, yearNamed);
    }

    @Override
    public String move() {
        return "Move by flying";
    }

    @Override
    public String breathe() {
        return "Breathe with lungs";
    }

    @Override
    public String reproduce() {
        return "Reproduce via eggs";
    }
}