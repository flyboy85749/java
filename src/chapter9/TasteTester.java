package chapter9;

public class TasteTester {
    public static void main (String [] args){

        Cake cake = new Cake("Chocolate");
        cake.setPrice(29.99);

        System.out.println("Cake flavor: " + cake.getFlavor());
        System.out.println("Cake price: " + cake.getPrice());

        BirthdayCake birthdayCake = new BirthdayCake();
        birthdayCake.setPrice(49.95);
        System.out.println("Birthday cake flavor: " + birthdayCake.getFlavor());
        System.out.println("Birthday cake price: " + birthdayCake.getPrice());

        WeddingCake weddingCake = new WeddingCake();
        weddingCake.setFlavor("Pina Colada");
        System.out.println("Wedding cake flavor: " + weddingCake.getFlavor());
        System.out.println("Wedding cake price: " + weddingCake.getPrice());
    }
}
