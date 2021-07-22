package animalkingdom;

public class Birds extends Animal {
    public Birds(int id, String name, int yearNamed) {
        super(id, name, yearNamed);
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