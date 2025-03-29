// 5) Wildlife Simulation (Abstract Class & Interface)

abstract class Animal{
    public abstract void makeSound();
}

interface Flyable{
    void fly();
}

class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Bark");
    }
} 

class Cuckoo extends Animal implements Flyable{
    @Override
    public void makeSound(){
        System.out.println("cuckoo");
    }
    @Override
    public void fly(){
        System.out.println("Yeah! Cuckoo is flyable");
    }

}


public class Task5{
    public static void main(String[] args) {
        Animal dog=new Dog();
        Animal cuckoo= new Cuckoo();

        dog.makeSound();
        cuckoo.makeSound();

        if (cuckoo instanceof Flyable) {
            ((Flyable) cuckoo).fly();
        }
    }
}