package animalkingdom;

import java.util.List;
import java.util.ArrayList;

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

    static List<Animal> filterAnimals(List<Animal> animals, CheckAnimal tester) {
        List<Animal> tempList = new ArrayList<>();

        for (Animal animal : animals) {
            if (tester.test(animal)) {
                tempList.add(animal);
            }
        }

        return tempList;
    }

    @Override
    public String toString() {
        return "Animals {id=" + getId() + ", name='" + getName() + "', yearNamed=" + getYearNamed() + "}\n";
    }
}