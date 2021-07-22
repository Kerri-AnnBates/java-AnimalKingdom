package animalkingdom;

public class Fish extends Animal {
    public Fish(String name, int yearNamed) {
        super(name, yearNamed);
    }

    @Override
    public String move() {
        return "Move by swimming";
    }

    @Override
    public String breathe() {
        return "Breathe with gills";
    }

    @Override
    public String reproduce() {
        return "Reproduce via eggs";
    }
}