package ch.juventus.object;

public class Application {
    public static void main(String[] args) {

        Address address = new Address();
        address.setStreet("Preyenstrasse");
        address.setNumber(5);
        address.setZip(8623);
        address.setCity("Wetzikon ZH");

        Person person = new Person();
        person.setFirstName("Rexhep");
        person.setLastName("Rexhepi");
        person.setAddress(address);
        person.setAge(30);
        person.setHasPet(true);


        System.out.println(person);
    }
}