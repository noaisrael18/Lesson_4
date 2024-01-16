public class Cat extends Animal {

    //Constructor
    public Cat (String type, String color){
        super("Cat", color, type);
    }

    //Behavior
    public void makeSound(){
        System.out.println("Meow!");
    }
}

