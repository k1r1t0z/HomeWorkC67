package HomeWork8;

public class Rabbit extends Animal {
    @Override
    void voice() {
        System.out.println("FfFfFf");
    }

    @Override
    void eat(String food) {
        switch (food) {
            case "Grass" -> System.out.println("Good");
            case "Meat" -> System.out.println("Bad");
        }
    }
}
