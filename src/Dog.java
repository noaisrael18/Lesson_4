// We inherit State and Behavior from Animal Class
public class Dog extends Animal {

    //State - for properties of classes, use uppercase
        //public String Type;
        //public String Color;

    //Constructor - for declaring objects, you can use lowercase
    // Assigning data we receive to our Class
    public Dog (String type, String color){
        super("Dog", color, type);
    }

    //Behavior
    public void makeSound(){
        System.out.println("Woof Woof");
    }
}
