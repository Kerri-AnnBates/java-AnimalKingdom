package animalkingdom;

public class Main {
    public static void main(String[] args) {
        Fish salmon = new Fish("Salmon", 1758);
        Birds pigeon = new Birds("Pigeon", 1837);

        System.out.println(salmon.getId());
        System.out.println(pigeon.getId());
    }
}