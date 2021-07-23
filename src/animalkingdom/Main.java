package animalkingdom;

import java.util.List;
import java.util.ArrayList;

public class Main {

    private static List<Animal> filteredList = new ArrayList<>();

    public static void main(String[] args) {
        // Mammals
        Mammal panda = new Mammal("Panda", 1869);
        Mammal zebra = new Mammal("Zebra", 1778);
        Mammal sloth = new Mammal("Sloth", 1804);
        Mammal kaola = new Mammal("Kaola", 1816);
        Mammal armadillo = new Mammal("Armadillo", 1758);
        Mammal raccoon = new Mammal("Raccon", 1758);
        Mammal bigfoot = new Mammal("Bigfoot", 2021);

        // Birds
        Bird pigeon = new Bird("Pigeon", 1837);
        Bird peacock = new Bird("Peacock", 1821);
        Bird parrot = new Bird("Parrot", 1824);
        Bird toucan = new Bird("Toucan", 1758);
        Bird swan = new Bird("Swan", 1758);

        // Fish
        Fish salmon = new Fish("Salmon", 1758);
        Fish catfish = new Fish("Catfish", 1817);
        Fish perch = new Fish("Perch", 1758);

        List<Animal> animals = new ArrayList<>();
        animals.add(panda);
        animals.add(zebra);
        animals.add(sloth);
        animals.add(armadillo);
        animals.add(raccoon);
        animals.add(bigfoot);
        animals.add(parrot);
        animals.add(pigeon);
        animals.add(peacock);
        animals.add(toucan);
        animals.add(swan);
        animals.add(salmon);
        animals.add(kaola);
        animals.add(catfish);
        animals.add(perch);

        System.out.println("\n*** List all the animals in descending order by year named ***");
        animals.sort((a1, a2) -> a2.getYearNamed() - a1.getYearNamed());
        System.out.println(animals);

        System.out.println("\n*** List all the animals alphabetically ***");
        animals.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        System.out.println(animals);

        System.out.println("\n*** List all the animals order by how they move ***");
        animals.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
        System.out.println(animals);

        System.out.println("\n*** List only those animals the breath with lungs ***");
        filteredList = Animal.filterAnimals(animals, (a) -> a.breathe().equalsIgnoreCase("lungs"));
        for (Animal animal : filteredList) {
            System.out.println(
                    animal.getName() + " " + animal.reproduce() + " " + animal.breathe() + " " + animal.getYearNamed());
        }

        System.out.println("\n*** List only those animals that breath with lungs and were named in 1758 ***");
        filteredList = Animal.filterAnimals(animals,
                (a) -> a.breathe().equalsIgnoreCase("lungs") && a.getYearNamed() == 1758);
        for (Animal animal : filteredList) {
            System.out.println(
                    animal.getName() + " " + animal.reproduce() + " " + animal.breathe() + " " + animal.getYearNamed());
        }

        System.out.println("\n*** List only those animals that lay eggs and breath with lungs ***");
        filteredList = Animal.filterAnimals(animals,
                (a) -> a.reproduce().equalsIgnoreCase("eggs") && a.breathe().equalsIgnoreCase("lungs"));
        for (Animal animal : filteredList) {
            System.out.println(
                    animal.getName() + " " + animal.reproduce() + " " + animal.breathe() + " " + animal.getYearNamed());
        }

        System.out.println("\n*** List alphabetically only those animals that were named in 1758 ***");
        filteredList = Animal.filterAnimals(animals, (a) -> a.getYearNamed() == 1758);
        filteredList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        for (Animal animal : filteredList) {
            System.out.println(
                    animal.getName() + " " + animal.reproduce() + " " + animal.breathe() + " " + animal.getYearNamed());
        }

        System.out.println("\n*** For the list of animals, list alphabetically those animals that are mammals ***");
        filteredList = Animal.filterAnimals(animals, (a) -> a instanceof Mammal);
        for (Animal animal : filteredList) {
            System.out.println(
                    animal.getName() + " " + animal.reproduce() + " " + animal.breathe() + " " + animal.getYearNamed());
        }
    }
}