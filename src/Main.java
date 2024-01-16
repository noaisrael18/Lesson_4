// Entry point of our program - every program must have a Main

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Dog myDog = new Dog ("Labrador","white");
        // System.out.println("My dog is a " + myDog.Type + "\nHe is " + myDog.Color);
        // myDog.makeSound();

        // Labrador myDog = new Labrador ("black");
        // System.out.println("My dog is a " + myDog.Type + "\nHe is " + myDog.Color);
        // myDog.makeSound();

        // Chihuahua myDog = new Chihuahua ("brown");
        // System.out.println("My dog is a " + myDog.Type + "\nHe is " + myDog.Color);
        // myDog.makeSound();

        // Polymorphism - can access Labrador functionality through Dog because they have the same state and behavior
        Dog myDog = new Labrador("black");
        System.out.println("My dog is a " + myDog.Type + "\nHe is " + myDog.Color);

        Animal myAnimal1 = new Labrador("black");
        Animal myAnimal2 = new Cat("Persian", "white");

        // Creating a list of Animals (items don't have to be the same Object, but they have to be the same Abstract Class)
        List<Animal> myList = new ArrayList<>();
        myList.add(myAnimal1);
        myList.add(myAnimal2);

        for (Animal myAnimal : myList) {
            System.out.println("My " + myAnimal.Kind + " is a " + myAnimal.Type + "\nHe is " + myAnimal.Color);
            myAnimal.makeSound();
        }

    }
}
