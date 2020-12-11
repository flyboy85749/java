package chapter10;

public class Dog extends Animal {
    @Override
    public void makeSound(){
        System.out.println("Woof!");
    }

    public void fetch(){
        System.out.println("I love to fetch things!");
    }
}
