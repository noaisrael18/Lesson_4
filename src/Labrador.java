// Labrador State and Behavior is inherited from Class Dog
public class Labrador extends Dog{
    public Labrador (String color){
        super("Labrador", color); //super inherits state from Class Dog, but type is already defined, just need to receive color from user
    }
}
