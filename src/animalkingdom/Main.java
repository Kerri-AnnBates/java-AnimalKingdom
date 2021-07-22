package animalkingdom;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Mammals
        Mammal panda = new Mammal("Panda", 1869);
        Mammal zebra = new Mammal("Zebra", 1778);
        Mammal sloth = new Mammal("Sloth", 1804);
        Mammal armadillo = new Mammal("Armadillo", 1758);
        Mammal raccoon = new Mammal("Raccon", 1758);
        Mammal bigfoot = new Mammal("Bigfoot", 2021);

        // Birds
        Bird pigeon = new Bird("Pigeon", 1837);
        Bird peacock = new Bird("Peacock", 1821);
        Bird toucan = new Bird("Parrot", 1824);
        Bird swan = new Bird("Swan", 1758);

        // Fish
        Fish salmon = new Fish("Salmon", 1758);
        Fish catfish = new Fish("catfish", 1817);
        Fish perch = new Fish("Perch", 1758);

        List<Animal> animals = new ArrayList<>();
        animals.add(panda);
        animals.add(zebra);
        animals.add(sloth);
        animals.add(armadillo);
        animals.add(raccoon);
        animals.add(bigfoot);
        animals.add(pigeon);
        animals.add(peacock);
        animals.add(toucan);
        animals.add(swan);
        animals.add(salmon);
        animals.add(catfish);
        animals.add(perch);
    }
}