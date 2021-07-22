package animalkingdom;

public class Fish extends Animal {
    public Fish(int id, String name, int yearNamed) {
        super(id, name, yearNamed);
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