package chapter10;

public class Zoo {
    public static void main (String [] args) {
        Dog Rocky = new Dog();
        Rocky.fetch();
        Rocky.makeSound();
        feed(Rocky);

        Animal Sasha = new Dog();
        Sasha.makeSound();
        feed(Sasha);

        Sasha = new Cat();
        Sasha.makeSound();
        // casting example
        ((Cat) Sasha).scratch();
        feed(Sasha);

    }

    public static void feed (Animal animal){
    if (animal instanceof Dog) {
        System.out.println("Here's your dog food.");
    }

    else if (animal instanceof Cat){
        System.out.println("Here's your cat food.");
    }
    }
}
