package HomeWork8;

public class Dog extends Animal {
    @Override
    void voice() {
        System.out.println("Gow gow");
    }

    @Override
    void eat(String food) {
        switch (food) {
            case "Meat" -> System.out.println("good");
            case "Grass" -> System.out.println("Bad");
        }
    }
}
