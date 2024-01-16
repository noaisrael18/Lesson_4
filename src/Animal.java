// Add "abstract" so we can create methods without implementation
// For example for makeSound, we don't have to specify which sound but rather each animal (e.g: Dog) can define it for themselves
public abstract class Animal implements IAnimal{
    public String Type;
    public String Color;
    public String Kind;

// In abstract Class, we don't need a Constructor because it can't be instantiated into an Object, but we can do it anyways
    public Animal (String kind, String color, String type){
        this.Color = color;
        this.Kind = kind;
        this.Type = type;
    }

    // Defining the makeSound function but not implementing it:
    public abstract void makeSound();
}


