package animalkingdom;

abstract class Animal {
    private static int maxid = 0;
    protected int id;
    protected String name;
    protected int yearNamed;

    public Animal(String name, int yearNamed) {
        this.name = name;
        this.yearNamed = yearNamed;
        this.id = maxid;
        maxid++;
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