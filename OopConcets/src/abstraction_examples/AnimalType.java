package abstraction_examples;
abstract class Animal{
    abstract void Sound();
}

class Dog extends Animal{
    @Override
    void Sound(){
        System.out.println("Dog Bark...");
    }
    void Color(){
        System.out.println("Black....");
    }
}
public class AnimalType {
    public AnimalType(){
        Dog d = new Dog();
        d.Color();
        d.Sound();
//        System.out.println("Abstraction Examples....");
    }
}
