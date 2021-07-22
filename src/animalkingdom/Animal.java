package animalkingdom;

abstract class Animal {
    protected int id;
    protected String name;
    protected int yearNamed;

    public Animal(int id, String name, int yearNamed) {
        this.id = id;
        this.name = name;
        this.yearNamed = yearNamed;
    }

    abstract String move();

    abstract String breathe();

    abstract String reproduce();

    void eat() {
        System.out.println("Chomp Chomp!");
    }

    int getId() {
        return id;
    }

    void setId(int id) {
        this.id = id;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getYearNamed() {
        return yearNamed;
    }

    void setYearNamed(int yearNamed) {
        this.yearNamed = yearNamed;
    }

}