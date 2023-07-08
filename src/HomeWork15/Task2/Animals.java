package HomeWork15.Task2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Animals {
    LinkedList<String> list = new LinkedList<>() {{
       add("Frog");
       add("Tiger");
       add("Elephant");
    }};

    public List<String> getList() {
        return list;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "list=" + list +
                '}';
    }

    void addAnimals (String animal) {
        list.addLast(animal);
    }

    void removeAnimal () {
        list.removeFirst();
    }
}
