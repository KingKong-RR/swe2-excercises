package ch.juventus.object;

public class Application {
    public static void main(String[] args){
        Person person1 = new Person("Rexhep", "Rexhepi", 30, true);
        Address address1 = new Address("Preyenstrasse", 5, 8623, "Wetzikon ZH");

        System.out.println(person1);
        System.out.println(address1);
    }
}