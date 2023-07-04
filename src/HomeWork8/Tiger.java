package HomeWork8;

public class Tiger extends Animal {
    @Override
    void voice() {
        System.out.println("RRRRRRR");
    }

    @Override
    void eat(String food) {
        switch (food) {
            case "Meat" -> System.out.println("good");
            case "Grass" -> System.out.println("Bad");
        }
    }
}
